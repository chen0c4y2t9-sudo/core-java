package com.krisswen.demo4;

public interface A {

    void a();

    default void show(){
        System.out.println("这是接口A里面的show方法");
    }
}
