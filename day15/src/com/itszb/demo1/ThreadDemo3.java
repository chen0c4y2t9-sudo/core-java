package com.itszb.demo1;

public class ThreadDemo3 {
    static void main() {
        new Thread("线程1"){
            @Override
            public void run() {
                for(int i = 1;i<=100;i++){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();

        new Thread("线程2"){
            @Override
            public void run() {
                for(int i = 1;i<=100;i++){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();

        new Thread("线程3"){
            @Override
            public void run() {
                for(int i = 1;i<=100;i++){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }
}
