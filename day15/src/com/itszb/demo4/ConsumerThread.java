package com.itszb.demo4;

public class ConsumerThread extends Thread{

    Product p;

    public ConsumerThread(){}

    public ConsumerThread(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            synchronized (p){
                if(p.flag == true){
                    System.out.println("消费者消费了" + p.name + ",价格是:" + p.price);
                    p.flag = false;
                    p.notify(); // 唤醒生产者 进行产品的生产
                }else{
                   try{
                       p.wait();
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
                }
            }
        }
    }
}
