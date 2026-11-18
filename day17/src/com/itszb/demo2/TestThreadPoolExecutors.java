package com.itszb.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class TestThreadPoolExecutors {
    static void main() {
        /*ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "输出结果1....");
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "输出结果2....");
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "输出结果3....");
        });*/

        // 创建线程池，并自定义线程的名字
        ExecutorService pool = Executors.newFixedThreadPool(2, new ThreadFactory() {
            private AtomicInteger atomicInteger = new AtomicInteger(1);
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"mypool-" + atomicInteger.getAndIncrement());
            }
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "输出结果1....");
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "输出结果2....");
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "输出结果3....");
        });
    }
}
