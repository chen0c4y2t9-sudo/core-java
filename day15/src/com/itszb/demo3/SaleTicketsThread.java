package com.itszb.demo3;

/**
 * 线程安全的问题： 多个线程对同一份数据进行写操作可能会导致最后写的结果和预期不一致，这就是线程安全的问题
 */
public class SaleTicketsThread extends Thread{

    private static int tickets = 100; // static修饰票数，保证tickets是唯一的

    public SaleTicketsThread(){}

    public SaleTicketsThread(String name){
        super(name);
    }

    /**
     * 售票的逻辑 由于售票的代码在并发调用的时候会出现线程安全的问题，所以必须进行同步，使用同步方法来实现。
     *    使用同步方法需要注意的事项:
     *       如果一个方法是非静态的方法，那么这个锁对象的this
     *       如果一个方法的静态方法，那么同步方法的锁对象就是当前的Class对象  SaleTicketsThread.class
     */
    public synchronized static void saleTickets(){
        if(tickets > 0){
            System.out.println(Thread.currentThread().getName() + "卖出了一张票,票号是:" + tickets);
            tickets--;
        }
    }

    @Override
    public void run() {
        while (tickets > 0){
            saleTickets();
        }
    }
}

class TestSaleTickets{
    static void main() {
        // 模拟3个售票窗口
        SaleTicketsThread t1 = new SaleTicketsThread("窗口1");
        SaleTicketsThread t2 = new SaleTicketsThread("窗口2");
        SaleTicketsThread t3 = new SaleTicketsThread("窗口3");
        // 开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
