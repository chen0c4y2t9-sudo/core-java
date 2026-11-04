package com.itszb.demo1;

/**
 * 目标: volatile读写建立的happeds-before关系
 * 规则： 如果线程1写入了volatile变量v，
 *        接着线程2读取到了，那么线程1写入v以及之前的写操作对线程2来说，都是可见的。
 */
public class Demo1 {
    private int a = 1;
    private volatile int b = 2;

    // 定义一个写操作的方法
    public void write(){
        a = 3;
        b = a;
    }

    // 定义一个读操作的方法
    public void read(){
        System.out.println("b = " + b + " a = " + a);
    }

    static void main(){
        Demo1 v = new Demo1();
        // 提供两个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
              v.write();
            };
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                v.read();
            }
        }).start();

        /**
         * 分析程序可能会出现的集中情况
         * b = 3;a = 3 // 如果一个线程率先执行write方法
         * b = 2;a = 1 // 如果一个线程率先执行read方法
         * b = 2;a = 3 // 线程1执行read方法，读到b= 2,接着cpu进行切换，另一个线程执行write方法，a = 3
         *
         * a = 1, b = 3 一个线程执行write方法，修改了a的值，但是a的值修改之后对于其他线程不可见，但是对b进行修改恰好对其他线程可见，此时就会
         * 出现这种情况。
         */

    }
}
