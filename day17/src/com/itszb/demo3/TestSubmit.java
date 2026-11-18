package com.itszb.demo3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSubmit {
    static void main() throws Exception {
        // m1();
        // m2();
        m3();
    }

    public static void m1() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Future<String> future = pool.submit(()->{
            System.out.println(Thread.currentThread().getName() + ": running");
            Thread.sleep(1000);
            return "ok";
        });
        System.out.println(Thread.currentThread().getName() + " 拿到任务的结果是: " + future.get());
    }

    public static void m2() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(1);// 创建线程池，核心线程数为1
        List<Future<String>> futureList = pool.invokeAll(Arrays.asList(
                ()->{
                    System.out.println(Thread.currentThread().getName() + ": begin1");
                    Thread.sleep(1000);
                    return "1";
                },
                ()->{
                    System.out.println(Thread.currentThread().getName() + ": begin2");
                    Thread.sleep(500);
                    return "2";
                },
                ()->{
                    System.out.println(Thread.currentThread().getName() + ": begin3");
                    Thread.sleep(2000);
                    return "3";
                }
        ));

        futureList.forEach(f ->{
            try{
                System.out.println(Thread.currentThread().getName() + ": " + f.get());
            }catch(Exception ex){
                ex.printStackTrace();
            }
        });
    }

    public static void m3() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        String result = pool.invokeAny(Arrays.asList(
                ()->{
                    System.out.println(Thread.currentThread().getName() + ": begin1");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ": end1");
                    return "1";
                },
                ()->{
                    System.out.println(Thread.currentThread().getName() + ": begin2");
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName() + ": end2");
                    return "2";
                },
                ()->{
                    System.out.println(Thread.currentThread().getName() + ": begin3");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + ": end3");
                    return "3";
                }
        ));
        System.out.println(Thread.currentThread().getName() + " 任务执行结果是: " + result);
    }
}
