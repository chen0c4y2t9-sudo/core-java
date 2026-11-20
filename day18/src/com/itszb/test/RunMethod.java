package com.itszb.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunMethod {
}
class Task{

    @RunMethod
    public void doLogin(){
        System.out.println("执行登录逻辑");
    }

    public void doLoginOut(){
        System.out.println("执行登出逻辑");
    }

    @RunMethod
    public void doPay(){
        System.out.println("执行支付逻辑");
    }

    public void deRefund(){
        System.out.println("执行退款逻辑");
    }
}
