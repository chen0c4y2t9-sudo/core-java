package com.krisswen.demo1;

public class Animal {
    String name;
    int age;
    String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void sleep(){
        System.out.println("aniaml在睡觉");
    }
}
