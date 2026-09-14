package com.itszb.demo3;

/**
 * 线程安全问题的解决方案： 同步代码块和同步方法
 *
 * 同步代码块的格式:
 *     synchronized(锁对象){
 *         // 定义需要被同步的代码块(可能会出现线程安全的代码都会定义在里面)
 *     }
 *  只要被synchronized关键字包括的代码，具备互斥性。 某一个线程在synchronized同步代码块中执行是不会被其他线程打断的。
 *  前提： 锁对象必须唯一
 *
 *  同步方法：  使用synchronized修饰方法，表示同一个时刻只能有一个线程访问该方法。具体格式：
 *  public synchronized 返回值 方法名(){
 *      // 定义需要被同步的代码(可能会出现线程安全的代码都会定义在里面)
 *  }
 */
public class SaleTicketsRunnable implements Runnable{

    private int tickets = 100;
    @Override
    public void run() {
        while (tickets > 0){
            synchronized (SaleTicketsRunnable.class){ // 字节码对象是唯一的
                if(tickets > 0){
                    System.out.println(Thread.currentThread().getName() + "卖出了一张票,票号是:" + tickets);
                    tickets--;
                }
            }

        }
    }
}

class SaleTicketsRunnableTest{
    static void main() {
        SaleTicketsRunnable sr = new SaleTicketsRunnable();
        Thread t1 = new Thread(sr,"窗口1");
        Thread t2 = new Thread(sr,"窗口2");
        Thread t3 = new Thread(sr,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
