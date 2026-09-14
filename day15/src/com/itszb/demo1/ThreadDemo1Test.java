package com.itszb.demo1;

public class ThreadDemo1Test {

    static void main() {
        // 创建3个线程对象
        ThreadDemo1 t1 = new ThreadDemo1("线程1");
        ThreadDemo1 t2 = new ThreadDemo1("线程2");
        ThreadDemo1 t3 = new ThreadDemo1("线程3");

        /*ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo1 t2 = new ThreadDemo1();
        ThreadDemo1 t3 = new ThreadDemo1();*/

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
        //t3.start();  线程不能重复调用，否则会出现异常

        // main方法本身就是一个线程，一般称为主线程
        for(int i = 1;i<=10;i++){
            System.out.println( Thread.currentThread().getName() + "正在输出数字:" + i);
        }
    }
}
