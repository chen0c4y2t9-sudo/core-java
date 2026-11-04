package com.itszb.demo2;

/**
 * 基于静态内部类实现单例设计模式: 线程安全的，并且是懒加载的
 */
public class SingletonHandler {
    private String name;
    private String color;

    private SingletonHandler(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 静态内部类
    private static class SingletonHolder{
        private static final SingletonHandler INSTANCE = new SingletonHandler("大黄", "黄色");
    }

    // 定义一个静态的公共的方法，通过该方法返回单例对象
    public static SingletonHandler getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
