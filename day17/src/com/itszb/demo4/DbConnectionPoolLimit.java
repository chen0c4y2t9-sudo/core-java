package com.itszb.demo4;

import java.util.concurrent.Semaphore;

public class DbConnectionPoolLimit {
    // 最多支持5个连接
    private final Semaphore semaphore = new  Semaphore(5);

    public void getConnection() throws InterruptedException {
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName() + " 获取到数据库连接");

        try{
            Thread.sleep(500);
        }finally {
            System.out.println(Thread.currentThread().getName() + " 释放数据库连接");
            semaphore.release();
        }
    }

    static void main() {
        DbConnectionPoolLimit pool = new DbConnectionPoolLimit();
        for(int i = 0;i<20;i++){
            Thread t = new Thread(()->{
               try{
                   pool.getConnection();
               } catch (InterruptedException e){
                   e.printStackTrace();
               }
            });
            t.setName("线程 - " + i);
            t.start();
        }
    }
}
