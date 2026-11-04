package com.itszb.test;

public class ThreadLocalDataTest {
    static void main() {
        ThreadLocalData data = new ThreadLocalData();
        // 创建5个线程并发操作
        for(int i = 0;i<5;i++){
            Thread thread = new Thread(()->{
                // 存入当前线程数据
                data.setData(Thread.currentThread().getName() + "的私有数据");
                // 打印并读取
                System.out.println(Thread.currentThread().getName() + "读取到的数据是:" + data.getData());
                // 调用remove方法，避免内存泄漏
                data.remove();
            });
            thread.setName("线程 - " + i);
            thread.start();
        }

    }
}
