package com.krisswen.demo4;

/**
 * 一个类可以同时继承一个类，也可以实现接口的
 */
public class Son extends Father implements ADao{

    /**
     * 一个类和接口中同时有一个同名的非抽象的方法，如果一个类继承了当前类，并实现了该接口，
     * 那么子类必须重写这个父类和接口中的同名方法。
     */
    @Override
    public void show() {
        System.out.println("这是Son类里面的show方法");
    }
}
