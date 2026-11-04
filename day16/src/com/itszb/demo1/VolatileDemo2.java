package com.itszb.demo1;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo2 implements Runnable{

    // 定义一个count
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        for(int x = 0; x < 10000; x++){
            // CAS自旋锁(乐观锁)
            System.out.println(Thread.currentThread().getName()+":"+atomicInteger.incrementAndGet());
        }
    }
}
