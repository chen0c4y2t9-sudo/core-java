package com.krisswen.demo1;

public class IPhone extends Phone{

    @Override
    public void call() throws Exception {
        System.out.println("苹果手机可以打电话");
        System.out.println("苹果手机可以发短信");
        System.out.println("苹果手机可以玩游戏");
        System.out.println("苹果手机可以刷抖音");
    }

    @Override
    public String sayHello() {
        return new String("hello");
    }
}
