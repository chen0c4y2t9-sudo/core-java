package com.itszb.demo4;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    static void main() {
        // 最多允许3个线程同时访问资源
        Semaphore semaphore = new Semaphore(3,true); // true 公平信号量

        for(int i = 1; i <= 10; i++) {
            new Thread(() -> {
                try{
                    // 获取许可证
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "获取准入许可证，开始执行");
                    // 模拟业务执行
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "执行完毕，释放许可证");
                }catch(Exception e){

                }finally {
                    // 释放资源
                    semaphore.release();
                }
            },"线程 - " + i).start();
        }
    }
}
