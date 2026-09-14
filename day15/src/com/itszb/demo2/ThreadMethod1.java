package com.itszb.demo2;

/**
 * 线程Thread的构造器的使用
 *    Thread() 构造一个线程对象，线程的名字使用的是默认的名称，默认名是Thread-数字  数字是从0开始的
 *    Thread(String name) 根据指定的线程名称创建线程对象
 *    Thread(Runnable target) 基于Runnable接口的实现创建线程对象。将Runnable接口的实现类的实例对象当成参数，传递到Thread的构造函数中
 *    Thread(Runnable target,String name) 基于Runnable接口的实现创建线程对象，并指定线程的名称
 */
public class ThreadMethod1 implements Runnable {

   /* static void main() {
        new Thread("偶数输出线程"){
            @Override
            public void run() {
                for(int i = 0;i<100;i++){
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + "输出的数字是:" + i);
                    }
                }
            }
        }.start();
    }*/

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "输出的数字是:" + i);
            }
        }
    }
}
