package com.itszb.demo2;

/**
 *  run() 编写线程的业务逻辑，业务逻辑就在run方法中运行
 *  start() 启动线程的方法，只有线程对象调用start方法，才会被CPU进行调度。
 *  getName() 获取当前线程的名称
 *  setName() 设置当前线程对象的名称
 *  currentThread() 获取当前的线程对象
 *
 *  sleep(long time) 将正在运行的线程按照指定的时间进行睡眠
 *  yield() 线程的礼让，将当前线程暂停一下，下一次执行需要CPU重新调度。
 *  isAlive() 判断当前的线程是否是存活的状态
 *  join() 当前线程插队执行，执行结束之后，别的线程才执行
 *  setPriority() 设置线程的优先级,优先级是一个数字 1-10 默认线程的优先级是5.数字越大，优先级越高，就会优先被CPU调度的概率越高
 *  getPriority() 获取线程的优先级
 *
 *  stop() 过时的方法，让正在运行的线程处于死亡的状态
 *  suspend()  暂停线程 resume() 恢复线程  我们一般不用，因为容易造成死锁的现象。
 */
public class ThreadMethod2 extends Thread {

    public ThreadMethod2(){}

    public ThreadMethod2(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            /*try{
                Thread.sleep(2000);// 线程休眠2s
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }*/
            if(i % 2 == 0){
                // Thread.currentThread() 获取当前线程对象
                // getName() 获取当前线程对象的名字
                System.out.println(Thread.currentThread().getName() + "输出:" + i);
            }
            if(i % 20 == 0){
                Thread.yield();
            }
        }
    }
}
class TestThreadMethod2{
    static void main() {
        ThreadMethod2 t1 = new ThreadMethod2();
        t1.setName("线程1");
        t1.setPriority(8);
        t1.start();

        Thread.currentThread().setName("主线程");
        for(int i = 1;i<=100;i++){
            if(i % 2 != 0){
                // 获取当前线程的优先级 默认是5
                System.out.println(Thread.currentThread().getName() + "，线程的优先级是:" + Thread.currentThread().getPriority() + "，输出的是:" + i);
            }
            if(i == 21){
                try{
                    t1.join(); // t1线程插队执行
                }catch (InterruptedException exception){
                    exception.printStackTrace();
                }
            }
        }

        // System.out.println(t1.isAlive());
    }
}
