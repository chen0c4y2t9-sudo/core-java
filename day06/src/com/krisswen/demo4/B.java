package com.krisswen.demo4;

public interface B {
    void b();

    default void show(){
        System.out.println("这是接口B里面的show方法");
    }
}
