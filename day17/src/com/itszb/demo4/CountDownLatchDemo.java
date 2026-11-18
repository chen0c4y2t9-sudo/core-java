package com.itszb.demo4;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    static void main() throws InterruptedException {
        // 初始化CountDownLatch，并指定任务等待数
        CountDownLatch latch = new CountDownLatch(3);
        // 启动3个线程
        for(int i = 1;i<=3;i++){
            int findI = i;
            try{
                System.out.println("线程" + findI + " 开始执行任务");
                Thread.sleep(100);
                System.out.println("线程" + findI + "任务执行完成");
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                // 每个线程任务执行外层之后，计数器-1
                latch.countDown();
            }
        }

        System.out.println(Thread.currentThread().getName() + "主线程等待所有子线程执行完成....");
        latch.await(); // 阻塞主线程，直到计数器=0
        System.out.println(Thread.currentThread().getName() + "所有子线程执行完毕，主线程继续执行");
    }
}
