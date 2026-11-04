package com.itszb.demo1;

public class VolatileDemo3 {
    // 没有使用volatile关键字修饰，会产生指令重排序的情况
    volatile static int x = 0;
    volatile static int y = 0;
    volatile static int a = 0;
    volatile static int b = 0;

    static void main() {
        for(int i = 0;i<Integer.MAX_VALUE;i++) {
            // 每次循环都要初始化变量值
            x = 0;
            y = 0;
            a = 0;
            b = 0;

            // 线程1
            // 如果出现指令重排  先执行b =1,再执行x = a
            new Thread(new Runnable() {
                @Override
                public void run() {
                    x = a;
                    b = 1;
                }
            }).start();

            // 线程2
            // 如果执行重排 先执行a =1,再执行y = b
            new Thread(new Runnable() {
                @Override
                public void run() {
                    y = b;
                    a = 1;
                }
            }).start();

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*
             * 执行上述代码，不是执行线程1就是执行线程2
             *   如果线程1先执行，则 x = 0, y = 1
             *   如果线程2先执行，则 x = 1, y = 0
             *
             * 目前来看是不可能出现x=1 y=1的情况
             *    如果出现了，则说明线程内部的顺序被颠倒了，就出现了指令重排的情况
             */
            if(x == 1 && y == 1){
                System.out.println("出现异常值，x = 1,y = 1");
                return;
            }else{
                System.out.println("正常值x = " + x + ", y = " + y);
            }
        }
    }
}
