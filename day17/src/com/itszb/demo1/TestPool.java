package com.itszb.demo1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 自定义线程池
 */
public class TestPool {
    static void main() {
        // 创建线程池对象
        ThreadPool threadPool = new ThreadPool(2,1000,TimeUnit.MILLISECONDS,10,(queue,task)->{
            // 死等
            // queue.put(task);
            // 带超时等待
            queue.offer(task,1500,TimeUnit.MILLISECONDS);
            task.run();
        });
        for(int i=0;i<1500;i++) {
            int j = i;
            threadPool.execute(()->{
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println(j);
            });
        }
    }
}

// 定义线程池
class ThreadPool{
    // 任务队列
    private BlockingQueue<Runnable> taskQueue;
    // 线程集合
    private HashSet<Worker> workers = new HashSet<>();
    // 核心线程数
    private int coreSize;
    // 获取任务的超时时间
    private long timeout;
    private TimeUnit timeUnit;
    // 定义拒绝策略
    private RejectPolicy<Runnable> rejectPolicy;

    public ThreadPool(int coreSize, long timeout, TimeUnit timeUnit,int queueCapcity,RejectPolicy<Runnable> rejectPolicy){
        this.coreSize = coreSize;
        this.timeout = timeout;
        this.timeUnit = timeUnit;
        this.taskQueue = new BlockingQueue<>(queueCapcity);
        this.rejectPolicy = rejectPolicy;
    }

    // 定义执行任务的方法，将任务交给Worker执行
    public void execute(Runnable task) {
        // 当任务数没有超过coreSize,直接交给Worker线程进行处理
        // 如果任务数超过coreSize,加入到阻塞队列执行
        synchronized (workers) {
            if(workers.size() < coreSize){
                Worker worker = new Worker(task);
                System.out.println(Thread.currentThread().getName() + worker + "，任务是:" + task);
                workers.add(worker);
                worker.start();
            }else{
                // taskQueue.put(task);
                /**
                 *  如果阻塞队列满了，我们的选择策略又很多:
                 *   死等
                 *   带超时等
                 *   让调用者放弃任务执行
                 *   让调用者抛异常
                 *   让任务提交者自己执行任务
                 */
                taskQueue.tryPut(rejectPolicy,task);
            }
        }
    }

    class Worker extends Thread{
        private Runnable task;
        public Worker(Runnable task){
            this.task = task;
        }

        /**
         * 执行任务的方法
         *  当task不为空，就执行任务
         *  当task执行完毕，再接着从阻塞队列获取任务并执行
         */
        @Override
        public void run() {
            while(task != null || (task = taskQueue.poll(timeout,timeUnit)) !=  null){
                try{
                    System.out.println(Thread.currentThread().getName()+ "正在执行任务,任务是:" + task);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    task = null;
                }
            }
            synchronized (workers) {
                System.out.println("Worker被移除:" + this);
                workers.remove(this);
            }
        }
    }
}

//  定义阻塞队列
class BlockingQueue<T>{
    // 任务队列
    private Deque<T> queue = new ArrayDeque<>();
    // 锁，保证线程在取任务的时候，只有1个线程能够取到任务，避免多个线程取到同一个任务，导致任务重复执行
    private ReentrantLock lock = new ReentrantLock();
    // 生产者条件变量(阻塞队列是有容量限制的，一旦生产者向队列添加任务，达到了队列的极限容量，此时生产者也需要阻塞)
    private Condition fullWaitSet = lock.newCondition();
    // 消费者条件变量(如果阻塞队列中没有任务的时候，消费者需要阻塞等待)
    private Condition emptyWaitSet = lock.newCondition();
    // 阻塞队列的容量
    private int capacity;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    // 带超时的阻塞获取
    public T poll(long timeout, TimeUnit unit)  {
        lock.lock();
        try{
            // 将timout统一转换成纳秒
            long nanos = unit.toNanos(timeout);
            while (queue.isEmpty()){
                try{
                    if(nanos <= 0){
                        return null;
                    }
                    // 返回值是剩余时间(等待时间减去已经过的时间，下一次等待就从剩余的时间开始)
                    nanos = emptyWaitSet.awaitNanos(nanos);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            // 队列不为空
            T t = queue.removeFirst();
            fullWaitSet.signal();
            return t;
        }finally {
            lock.unlock();
        }
    }

    // 消费者阻塞获取
    public T take(){
        lock.lock(); // 上锁的方法
        try{
            while (queue.isEmpty()){
                try{
                    emptyWaitSet.await(); // 如果阻塞队列里面的内容为空，对于消费者需要阻塞。当队列里面有元素，需要进行唤醒
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            T t = queue.removeFirst(); // 当队列里面有元素，需要取出阻塞队列中的第一个任务
            fullWaitSet.signal();// 唤醒阻塞的生产者线程
            return t;
        }finally {
            lock.unlock(); // 释放锁的方法
        }
    }

    // 生产者阻塞添加
    public void put(T task){
        lock.lock(); // 加锁
        try{
            while(queue.size()==capacity){ // 队列任务满了
                try{
                    System.out.println(Thread.currentThread().getName() + "等待加入任务队列:" + task);
                    fullWaitSet.wait(); // 如果队列任务满了，生产者线程需要阻塞
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "加入任务队列:" + task);
            queue.addLast(task); // 将新任务添加到队列的尾部
            emptyWaitSet.signal(); // 唤醒阻塞消费者进行消费
        }finally {
            lock.unlock(); // 释放锁
        }
    }

    // 带超时的阻塞添加(添加成功返回true，添加失败返回false)
    public boolean offer(T task,long timeout, TimeUnit timeUnit){
        lock.lock();
        try{
            long nanos = timeUnit.toNanos(timeout);
            while (queue.size()==capacity){
                try{
                    if(nanos <= 0){
                        return false;
                    }
                    System.out.println(Thread.currentThread().getName() + "等待加入到任务队列:" + task);
                    nanos =fullWaitSet.awaitNanos(nanos);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "加入到任务队列:" + task);
            queue.addLast(task);
            emptyWaitSet.signal();
            return true;
        }finally {
            lock.unlock();
        }
    }

    public void tryPut(RejectPolicy<T> rejectPolicy,T task){
        lock.lock();
        try{
            // 判断队列是否满了
            if(queue.size()==capacity){
                rejectPolicy.reject(this,task);
            }else{
                // 有空闲
                System.out.println(Thread.currentThread().getName() + "加入任务队列" + task);
                queue.addLast(task);
                emptyWaitSet.signal();
            }
        }finally {
            lock.unlock();
        }
    }

    // 获取阻塞队列的大小
    public int size(){
        lock.lock();
        try{
            return queue.size();
        }finally {
            lock.unlock();
        }
    }
}
// 定义线程池的拒绝策略
@FunctionalInterface
interface RejectPolicy<T>{
    void reject(BlockingQueue<T> queue,T task);
}