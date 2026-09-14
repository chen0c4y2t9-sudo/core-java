package com.itszb.test;

/**
 * 题目 1：两个线程交替打印 1~100（一个打印奇数，一个打印偶数）
 */
public class Test1 {
    static void main() {
        // 奇数线程
        new Thread(()->{
            for(int i = 1;i<=100;i+=2){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
        },"奇数线程").start();

        // 偶数线程
        new Thread(()->{
            for(int i = 2; i<=100;i+=2){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
        },"偶数线程").start();
    }
}
