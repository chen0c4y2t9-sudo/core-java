package com.itszb.test;

public class ThreadLocalData {

    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    // 存数据的方法
    public void setData(String data){
        THREAD_LOCAL.set(data);
    }

    // 取数据
    public String getData(){
        return THREAD_LOCAL.get();
    }

    // 清除数据，防止内存泄漏
    public void remove(){
        THREAD_LOCAL.remove();
    }
}
