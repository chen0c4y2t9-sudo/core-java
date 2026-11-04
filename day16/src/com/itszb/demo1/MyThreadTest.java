package com.itszb.demo1;

/**
 * 目前代码出现的问题： 线程t1将flag的值修改成true之后，主线程没有感知到修改之后的true。导致不能进入到循环体里面
 * 这种情况是多线程场景下面，线程修改数据之后的不可见性。
 *
 * 如果要保证线程之间的可见性，有两种解决方案，分别是加锁还有使用volatile关键字
 */
public class MyThreadTest {
    /*static void main() {
        // 开启子线程
        MyThread t1 = new MyThread();
        t1.start();

        // 主线程执行
        while (true){
            if(t1.isFlag()){
                System.out.println("主线程进入循环体");
            }
        }
    }*/


    /**
     *  加锁的方式保证线程之间的可见性
     *
     *  执行流程:
     *
     */
   /* static void main() {
        // 开启子线程
        MyThread t1 = new MyThread();
        t1.start();

        // 主线程执行
        while (true){
            synchronized (t1){
                if(t1.isFlag()){
                    System.out.println("主线程进入到循环体.....");
                }
            }
        }

        }*/


    /**
     * 使用volatile关键字可以保证线程之间数据的可见性
     */
    static void main() {
        // 开启子线程
        MyThread t1 = new MyThread();
        t1.start();

        // 主线程执行
        while (true){
            if(t1.isFlag()){
                System.out.println("主线程进入循环体");
            }
        }
    }

}
