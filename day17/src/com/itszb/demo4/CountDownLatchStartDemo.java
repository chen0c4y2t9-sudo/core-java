package com.itszb.demo4;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchStartDemo {
    static void main() throws InterruptedException {
        // 只需要一个信号
        CountDownLatch startLatch = new CountDownLatch(1);

        for(int i = 1;i<=5;i++){
            int findI = i;
            new Thread(()->{
                try{
                    System.out.println("运动员" + findI + " 已就位,等待发令枪");
                    // 所有的线程都需要在这里阻塞
                    startLatch.await();
                    System.out.println("运动员" + findI + " 开始奔跑....");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }

        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + "发令枪响!");
        // 计数器变成0
        startLatch.countDown();
    }
}
