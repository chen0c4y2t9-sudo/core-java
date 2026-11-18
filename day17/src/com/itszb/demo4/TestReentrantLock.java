package com.itszb.demo4;

import java.util.concurrent.locks.ReentrantLock;

import static com.itszb.demo3.TestSubmit.m2;

public class TestReentrantLock {
    private static ReentrantLock lock = new ReentrantLock();

    static void main() {
        lock.lock(); // 加锁的方法
        try{
            System.out.println("进入到main方法");
            m1();
        }finally {
            lock.unlock();
        }
    }

    public static void m1(){
        lock.lock();
        try{
            System.out.println("进入到m1方法");
            m2();
        }finally {
            lock.unlock();
        }
    }

    public static void m2(){
        lock.lock();
        try{
            System.out.println("进入到m2方法");
        }finally {
            lock.unlock();
        }
    }
}
