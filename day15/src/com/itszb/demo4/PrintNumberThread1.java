package com.itszb.demo4;

/**
 * 线程的通讯： 多个线程需要共同协作才能完成一个任务，这个过程就涉及到线程的通信。线程的通信会设计到几个核心的方法
 *    wait() 将当前正在运行的线程阻塞，一旦一个线程调用了wait方法，那么这个线程持有的锁对象也会释放。此时当前线程无法竞争到锁对象了，
 *    除非另一个线程调用notify方法将其唤醒
 *
 *    notify() 将一个wait方法阻塞的线程唤醒，将其变成可运行的状态。此时被唤醒的线程可以竞争锁对象
 *
 *    notifyAll() 唤醒所有被wait方法阻塞的线程
 */
public class PrintNumberThread1 implements Runnable{

    int i = 1;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                notify(); // 唤醒被wait方法阻塞的线程
                if(i <=100){
                    System.out.println(Thread.currentThread().getName() + "输出数字:" + i);
                    i++;
                }else{
                    break;
                }
                // wait一下 当前现场处于阻塞状态，并释放锁对象
                try{
                    this.wait();
                }catch (InterruptedException exception){
                    exception.printStackTrace();
                }
            }
        }
    }
}


class TestPrintNumberThread1{
    static void main() {
        PrintNumberThread1 rm = new PrintNumberThread1();
        Thread t1 = new Thread(rm,"线程1");
        Thread t2 = new Thread(rm,"线程2");
        t1.start();
        t2.start();
    }

}