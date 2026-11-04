package com.itszb.test;

public class VolatileVisibleThread extends Thread{

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
            // 修改标记
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
