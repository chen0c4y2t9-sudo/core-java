package com.itszb.demo2;

public class TestThreadDemo {
    static void main() {
        Thread t1 = new Thread("线程1"){
            @Override
            public void run() {
                for(int i = 1;i<=100;i++){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + "输出:" + i);
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread("线程2"){
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                for(int i = 1;i<=100;i++){
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + "输出:" + i);
                    }
                    if(i== 15){
                        try{
                            t1.join();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        t2.setDaemon(true);// t2线程就是一个守护线程
        t2.start();
    }
}
