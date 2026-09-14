package com.itszb.demo3;

public class DeadLockThread extends Thread{

    public DeadLockThread(){

    }

    public DeadLockThread(String name){
        super(name);
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("张三")){
            synchronized ("电池"){
                System.out.println("张三抢占到了电池");
                synchronized ("遥控器"){
                    System.out.println("张三抢占到了遥控器");
                }
            }
        }else{
            synchronized ("遥控器"){
                System.out.println("李四抢占到了遥控器");
                synchronized ("电池"){
                    System.out.println("李四抢占到了电池");
                }
            }

        }
    }
}

class TestDeadLock{
    static void main() {
        DeadLockThread t1 = new DeadLockThread("张三");
        DeadLockThread t2 = new DeadLockThread("李四");

        t1.start();
        t2.start();
    }
}
