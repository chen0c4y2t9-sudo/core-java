package com.itszb.demo1;

/**
 * 目的：研究volatile的原子性操作
 * 观点： volatile不保证原子性操作
 *
 * 需求: 定义一个共享变量，开启100个线程，每个线程负责为变量累加10000次，执行完毕之后，查看变量的结果
 */
public class VolatileDemo1 implements Runnable{

    // 定义一个变量
    private volatile int count = 0;

    @Override
    public void run() {
        for(int x = 0;x<10000;x++){
            synchronized (VolatileDemo1.class){
                count++; // 不是一个原子性操作
                System.out.println(Thread.currentThread().getName()+"count >>>>>>>>>>>>>>" + count);
            }
        }
    }
}
