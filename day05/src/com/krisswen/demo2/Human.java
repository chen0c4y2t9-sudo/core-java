package com.krisswen.demo2;

/**
 * 人类 --父类
 */
public class Human {
    String name;
    int age;
    String address;

    public Human(){}

    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void hello(){
        System.out.println("这是父类Human里面的hello方法");
    }
}
