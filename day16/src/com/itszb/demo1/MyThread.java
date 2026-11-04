package com.itszb.demo1;

public class MyThread extends Thread{

    // 成员变量
    private volatile boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        // 修改成员变量
        flag = true;
        System.out.println("flag:" + flag);
    }
}
