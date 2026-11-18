package com.itszb.demo3;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestShutDown {
    static void main() throws Exception{
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Integer> result1 = pool.submit(()->{
            System.out.println(Thread.currentThread().getName() + ": task 1 starting....");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + ": task 1 finish....");
            return 1;
        });

        Future<Integer> result2 = pool.submit(()->{
            System.out.println(Thread.currentThread().getName() + ": task 2 starting....");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + ": task 2 finish....");
            return 2;
        });

        Future<Integer> result3 = pool.submit(()->{
            System.out.println(Thread.currentThread().getName() + ": task 3 starting....");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + ": task 3 finish....");
            return 3;
        });

        List<Runnable> runnables = pool.shutdownNow();
        System.out.println(Thread.currentThread().getName() + ": others：" + runnables);
        System.out.println(runnables.size());

        //System.out.println(Thread.currentThread().getName() + ": shutdown");
        //pool.shutdown();
        //pool.awaitTermination(3, TimeUnit.SECONDS);
        //System.out.println(Thread.currentThread().getName() + ": 主线程还在执行");
       /* Future<Integer> result4 = pool.submit(()->{
            System.out.println(Thread.currentThread().getName() + ": task 4 starting....");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + ": task 4 finish....");
            return 4;
        });*/
    }
}
