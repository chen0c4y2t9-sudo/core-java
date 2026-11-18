package com.itszb.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestSingleThreadExecutor {
    static void main() {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + " 输出1");
            int i = 10 / 0;
        });

        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + " 输出2");
        });

        pool.execute(()->{
            System.out.println(Thread.currentThread().getName() + " 输出3");
        });
    }
}
