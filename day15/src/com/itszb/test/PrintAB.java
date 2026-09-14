package com.itszb.test;

public class PrintAB {
    private static boolean printA = false; // true 打印A  false 打印B
    private static final Object lock = new Object();

    static void main() {
        // 打印A的线程
        new Thread(()->{
            for(int i = 0;i<10;i++){
                synchronized (lock){
                    while (!printA){
                        try{
                            lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "打印A ");
                    printA = false;
                    lock.notify();
                }
            }
        },"打印A的线程").start();

        // 打印B
        new Thread(()->{
            for(int i = 0;1<10;i++){
                synchronized (lock){
                    while (printA){
                        try{
                            lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "打印B ");
                    printA = true;
                    lock.notify();
                }
            }
        },"打印B的线程").start();
    }
}
