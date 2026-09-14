package com.itszb.demo1;

/**
 * 线程创建的第二种方式: 实现Runnable接口，并重写里面的run方法
 * 如何使用这个线程：
 *   创建Runnable实现类的对象，并将该对象作为参数传递到Thread对象中
 *   通过Thread线程对象，调用start方法来启动线程
 *
 *
 * 总结: 实现Runnable接口对比继承Thread类更具优势。由于java单继承的特性，继承Thread类之后，不能再去继承其他的类了，程序的扩展性很差。
 *       但是实现了Runnable接口之后，我们还可以继承其他的类，程序的健壮性 可扩展性更好。
 */
public class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "输出的偶数是:" + i);
            }
        }
    }
}
