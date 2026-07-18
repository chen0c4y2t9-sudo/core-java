package com.krisswen.demo4;

/**
 * 一个类可以实现多个接口，多个接口之间使用逗号分隔。
 *
 */
public class ABImpl implements A,B{
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    /**
     * 如果一个类同时实现接口A和接口B，接口A和接口B中有两个相同的default方法，这时，这个类必须重写接口中的default方法
     */
    @Override
    public void show() {
        System.out.println("这是重写之后的方法");
    }
}
