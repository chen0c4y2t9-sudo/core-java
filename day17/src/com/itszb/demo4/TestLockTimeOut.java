package com.itszb.demo4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试锁超时
 */
public class TestLockTimeOut {
    private static ReentrantLock lock = new ReentrantLock();

    static void main() {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "尝试获取锁");
            try{
                /**
                 * 锁超时等待的时间是1s钟，如果1s钟之内，主线程释放了锁对象，线程1还可以可以获取到这把锁。
                 * 如果主线程在1s钟之内没有获取到锁，线程就会放弃等待。
                 */
                if(!lock.tryLock(3, TimeUnit.SECONDS)){
                    System.out.println(Thread.currentThread().getName() + "获取不到锁");
                    return;
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            try{
                System.out.println(Thread.currentThread().getName() + "获取到了锁");
            }finally {
                lock.unlock();
            }
        },"t1");

        System.out.println(Thread.currentThread().getName() + "尝试获得锁");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + "获取到了锁");
        lock.unlock();
        System.out.println(Thread.currentThread().getName() + "释放了锁资源");
        t1.start();
    }
}
