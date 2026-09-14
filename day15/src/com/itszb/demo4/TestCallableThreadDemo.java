package com.itszb.demo4;

import java.util.concurrent.FutureTask;

public class TestCallableThreadDemo {
    static void main() {
        // 创建实现Callable接口的线程对象
        CallableThreadDemo callableThreadDemo = new CallableThreadDemo();
        // 创建FutureTask对象，将线程对象传入到构造器里面去
        FutureTask futureTask = new FutureTask(callableThreadDemo);
        // 启动线程
        Thread t1 = new Thread(futureTask,"线程1");
        t1.start();
       try{
           Object o = futureTask.get();
           System.out.println("线程执行的结果是:" + o);
       }catch (Exception e){
           e.printStackTrace();
       }

       // 定义主线程的执行逻辑
        for(int i = 1;i<=100;i++){
            if( i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + "输出的数字是：" + i);
            }
        }
    }
}
