package com.itszb.demo2;

/**
 * 懒汉式单例设计模式
 *    实现了单例对象的创建是按需创建的，不再立即创建。但是会有在并发场景下面调用getInstance方法，会导致线程不安全的问题(对象可能会被重复创建)。
 */
public class LazySingleton {
    private String name;
    private String color;

    private LazySingleton(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton("大黄", "黄色");
        }
        return instance;
    }
}
