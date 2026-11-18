package com.itszb.demo4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLockCondition {
    static ReentrantLock lock = new ReentrantLock();
    static Condition waitCigaretteQueue = lock.newCondition();
    static Condition waitbreakfastQueue = lock.newCondition();
    static volatile boolean hasCigrette = false;
    static volatile boolean hasBreakfast = false;

    public static void main(String[] args) {

        new Thread(()->{
            lock.lock();
            try{
                while(!hasCigrette){
                    try{
                        waitCigaretteQueue.await();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() +  "  :等到了它的烟");
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                lock.lock();
                while (!hasBreakfast) {
                    try {
                        waitbreakfastQueue.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() +  "  :等到了它的早餐");
            } finally {
                lock.unlock();
            }
        }).start();

        try{
            Thread.sleep(1);
            sendBreakfast();
            Thread.sleep(1);
            sendCigarette();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void sendCigarette() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "送烟来了");
            hasCigrette = true;
            waitCigaretteQueue.signal();
        } finally {
            lock.unlock();
        }
    }

    private static void sendBreakfast() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "送早餐来了");
            hasBreakfast = true;
            waitbreakfastQueue.signal();
        } finally {
            lock.unlock();
        }
    }
}
