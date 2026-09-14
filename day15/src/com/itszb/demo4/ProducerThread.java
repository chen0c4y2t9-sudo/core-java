package com.itszb.demo4;

/**
 * 生产者线程
 */
public class ProducerThread extends Thread{

    Product p;

    public ProducerThread(){}

    public ProducerThread(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            synchronized (p){
                if(p.flag == false){
                    if(i % 2 == 0){
                        p.name = "苹果";
                        p.price = 9.8;
                    }else{
                        p.name = "香蕉";
                        p.price = 4.4;
                    }
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException exception){
                        exception.printStackTrace();
                    }
                    System.out.println("生产者生产了" + p.name + "，价格是:" + p.price);
                    i++;
                    // 改变当前产品的状态
                    p.flag = true;
                    // 通知消费者进行消费
                    p.notify();
                }else{
                    // 产品已经生产了，当前生产者线程需要进入到阻塞的状态
                    try{
                        p.wait();
                    }catch (InterruptedException exception){
                        exception.printStackTrace();
                    }
                }
            }
        }
    }
}
