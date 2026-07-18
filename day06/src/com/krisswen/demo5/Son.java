package com.krisswen.demo5;

public class Son extends Fu{
    int num = 100;
    int a = 10;

    @Override
    public void study() {
        System.out.println("子类在学习");
    }

    // 定义一个子类特有的方法
    public void sleep(){
        System.out.println("这是子类特有的sleep方法");
    }
}
