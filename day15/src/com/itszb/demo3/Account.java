package com.itszb.demo3;

public class Account {
    private int balance; // 账户余额

    // 定义一个存钱的方法，因为可能会出现线程不安全的问题，需要使用同步函数，来保证存钱业务的线程安全
    public synchronized  void save(int money){
        balance += money;
        System.out.println(Thread.currentThread().getName() + "存钱1000元，当前余额是:" + balance);
    }
}

class SaveAccountThread extends Thread{
    Account account;

    public SaveAccountThread(Account account){
        this.account = account;
    }

    public SaveAccountThread(Account account,String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            account.save(1000);
        }
    }
}

class TestAccountThread{
    static void main() {
        Account account = new Account();
        // 创建两个线程对象
        SaveAccountThread t1 = new SaveAccountThread(account,"线程1");
        SaveAccountThread t2 = new SaveAccountThread(account,"线程2");
        // 启动线程
        t1.start();
        t2.start();
    }
}
