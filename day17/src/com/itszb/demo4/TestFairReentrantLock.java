package com.itszb.demo4;

import java.util.concurrent.locks.ReentrantLock;

public class TestFairReentrantLock {
    // 创建锁对象  参数设置为true，它就是公平锁
    private final ReentrantLock fairLock = new ReentrantLock(true);

    public void doTask() {
        // 加锁的方法
        fairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "获取到公平锁，开始执行任务");
            // 模拟业务执行耗时，这样线程上下切换更加明显
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            fairLock.unlock(); // 释放锁
            System.out.println(Thread.currentThread().getName() + "释放了公平锁");
        }
    }

    static void main() {
        TestFairReentrantLock demo = new TestFairReentrantLock();
        // 创建5个线程，同时竞争公平锁
        for(int i = 1;i<=5;i++){
            new Thread(demo::doTask).start();
        }
    }
}
