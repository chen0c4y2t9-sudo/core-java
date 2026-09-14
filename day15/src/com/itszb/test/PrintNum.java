package com.itszb.test;

public class PrintNum {
    // 控制当前应该打印奇数还是偶数
    private static boolean flag = true;
    private static final Object lock = new Object();

    static void main() {
        // 打印奇数的线程
        new Thread(()->{
            for(int i = 1;i<=100;i+=2){
                synchronized (lock){
                    while(!flag){ // 不是打印奇数的时候
                        try{
                            lock.wait();
                        }catch (InterruptedException exception){
                            exception.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    flag = false;
                    lock.notify(); // 唤醒对方
                }
            }
        },"奇数线程").start();

        // 偶数线程
        new Thread(()->{
            for(int i = 2;i<=100;i+=2){
                synchronized (lock){
                    while (flag){
                        try{
                            lock.wait();
                        }catch (InterruptedException exception){
                            exception.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    flag = true;
                    lock.notify();
                }
            }
        },"偶数线程").start();
    }
}
