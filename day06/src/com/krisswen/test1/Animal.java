package com.krisswen.test1;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // 定义一个抽象的方法eat
    public abstract void eat();

    // 定义一个普通的方法slepp
    public void sleep(){
        System.out.println("动物在睡觉");
    }
}
