package com.itszb.demo1;

/**
 * 双重检查锁单例设计
 */
public class DoubleCheckLockSingleton {
    private String name;
    private String color;

    private DoubleCheckLockSingleton(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private static volatile DoubleCheckLockSingleton instance = null;

    public static DoubleCheckLockSingleton getInstance() {
        if(instance  == null){
            synchronized (DoubleCheckLockSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLockSingleton("大黄","黄色");
                }
            }
        }
        return instance;
    }
}
