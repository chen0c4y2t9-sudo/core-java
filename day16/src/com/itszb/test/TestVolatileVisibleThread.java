package com.itszb.test;

public class TestVolatileVisibleThread {
    static void main() {
        VolatileVisibleThread t = new VolatileVisibleThread();
        t.start();

        // 主线程循环监听
        while (true){
            if(t.isFlag()){
                System.out.println("主线程感知到flag为true，执行循环");
                break;
            }
        }
    }
}
