package com.krisswen.test1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
