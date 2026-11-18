package com.itszb.demo4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试锁打断
 */
public class TestLockInterrupt {
    private static ReentrantLock lock = new ReentrantLock();

    static void main() {
        Thread t = new Thread(() -> {
            try {
                System.out.println("尝试获取这把锁");
                /**
                 * 如果没有线程竞争锁，次方法会获取到锁对象
                 * 如果有竞争，就进入到阻塞队列中，但是可以被其他线程使用interrupt方法打断
                 */
                lock.lockInterruptibly();
            }catch (InterruptedException exception){
                exception.printStackTrace();
                System.out.println("等待锁的过程中被打断");
                return;
            }

            try{
                System.out.println("获取到了锁对象");
            }finally {
                lock.unlock();
            }
        },"t1");

        // 使用主线程来竞争锁
        lock.lock();
        t.start();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "打断t1");
            t.interrupt(); // 打断线程1的锁等待，直接放弃等待
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
