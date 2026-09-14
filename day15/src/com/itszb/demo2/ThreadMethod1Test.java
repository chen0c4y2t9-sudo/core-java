package com.itszb.demo2;

public class ThreadMethod1Test {
    static void main() {
        ThreadMethod1 method1 = new ThreadMethod1();
        Thread thread = new Thread(method1,"线程1");
        thread.start();
    }
}
