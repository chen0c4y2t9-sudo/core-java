package com.krisswen.demo4;

public interface ADao {

    default void show(){
        System.out.println("这是ADao中的show方法");
    }
}
