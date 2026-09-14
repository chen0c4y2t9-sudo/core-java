package com.itszb.demo1;

public class ThreadDemo2Test {
    static void main() {
        // 创建Runnable实现类的对象
        ThreadDemo2 td = new ThreadDemo2();
        // 创建线程对象
        Thread t1 = new Thread(td,"线程1");
        Thread t2 = new Thread(td,"线程2");
        Thread t3 = new Thread(td,"线程3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
