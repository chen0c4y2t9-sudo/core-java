package com.itszb.demo1;

public class VolatileDemo1Test {
    static void main() {
        // 创建一个线程任务对象
        //VolatileDemo1 demo1 = new VolatileDemo1();
        VolatileDemo2 demo2 = new VolatileDemo2();
        for(int i=0;i<100;i++) {
            new  Thread(demo2,"第" + i + "个线程").start();
        }
    }
}
