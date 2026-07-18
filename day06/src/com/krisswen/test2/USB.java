package com.krisswen.test2;

public interface USB {
    void start();
    void stop();
    default void show(){
        System.out.println("USB设备正在工作中");
    }
}
