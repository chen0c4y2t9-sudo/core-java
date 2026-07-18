package com.krisswen.demo1;

public class Cat extends Animal{

    public Cat(String name, int age, String type) {
        super(name, age, type);
    }

    // 方法的重写
    @Override
    public void sleep() {
        System.out.println("睡前刷会手机");
        System.out.println("睡前听会音乐");
        System.out.println("cat要睡觉了....");
    }
}
