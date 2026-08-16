package com.itszb.test1;

public class Box<T> {

    public T content;

    public void set(T content){
        this.content = content;
    }

    public T get(){
        return content;
    }

    public void showType(){
        System.out.println("存储的类型是:" + content.getClass().getName());
    }
}
