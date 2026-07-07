package com.krisswen.pojo;

/**
 * 懒汉式单例设计模式：实现了单例对象的创建是按需创建的。
 */
public class Animal {
    private String name;
    private String color;

    private Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private static Animal animal = null;

    public static Animal getInstance(){
        if(animal == null){
            animal = new Animal("黄色","大黄");
        }
        return animal;
    }

}
