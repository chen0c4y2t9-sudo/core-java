package com.itszb.demo2;

import java.util.concurrent.SynchronousQueue;

/**
 * 演示同步队列
 */
public class TestSynchronousQueue {
    static void main() throws Exception{
        SynchronousQueue<Integer> integers = new SynchronousQueue<>();
        // 创建线程1
        new Thread(()->{
           try{
               System.out.println(Thread.currentThread().getName() + " putting:" + 1);
               integers.put(1);
               System.out.println(Thread.currentThread().getName() + " putted:" + 1);

               System.out.println(Thread.currentThread().getName() + " putting:" + 2);
               integers.put(2);
               System.out.println(Thread.currentThread().getName() + " putted:" + 2);

           } catch (InterruptedException ex){
               ex.printStackTrace();
           }
        },"t1").start();
        Thread.sleep(1);

        // 创建线程2
        new Thread(()->{
            try{
                System.out.println(Thread.currentThread().getName() + " taking:" + 1);
                integers.take();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        },"t2").start();
        Thread.sleep(1);

        // 创建线程3
        new Thread(()->{
            try{
                System.out.println(Thread.currentThread().getName() + " taking:" + 2);
                integers.take();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        },"t3").start();
    }
}
