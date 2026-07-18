package com.krisswen.test1;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
