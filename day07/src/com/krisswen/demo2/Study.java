package com.krisswen.demo2;

public interface Study {

    int a = 20;

    void study();

    default void test(){
        System.out.println("这是test方法");
        inner();
        show();
    }

    default void inner(){
        System.out.println("这是inner方法。");
    }

    public static void test01(){
        System.out.println("在接口中可以定义静态的非抽象方法");
    }

    // 在java9中，可以使用private关键字修饰访问
    private void show(){
        System.out.println("这是一个show方法");
    }
}
