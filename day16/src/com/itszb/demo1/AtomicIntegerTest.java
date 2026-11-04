package com.itszb.demo1;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    static void main() {
        // 初始化一个默认值为0的Integer的原子型的数据
        AtomicInteger a = new AtomicInteger();
        // get() 获取值
        System.out.println(a.get());

        // 初始化一个指定值的原子性的Integer
        AtomicInteger b = new AtomicInteger(100);
        System.out.println(b.get());
        // 以原子方式在当前值的基础上+1，但是这里返回的是自增之前的值
        // System.out.println(b.getAndIncrement());

        // 以原子的方式在当前值的基础上+1，但是这里返回的是自增之后的值
        System.out.println(b.incrementAndGet());

    }
}
