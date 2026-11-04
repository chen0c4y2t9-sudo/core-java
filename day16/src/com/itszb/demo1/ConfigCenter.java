package com.itszb.demo1;

public class ConfigCenter {

    // 该值会被高频读操作
    private volatile String config = "v1";

    public void updateConfig(String newConfig){
        config = newConfig; // 赋值操作
    }

    public String getConfig(){
        return config; // 确保总是能够读到最新的值
    }


    static void main() throws Exception{
        ConfigCenter center = new ConfigCenter();
        Thread reader = new Thread(()->{
           String last = "";
            String cur = center.getConfig();
            if(!cur.equals(last)){
                System.out.println("当前的值是:" + cur);
                last = cur;
            }
        });

        Thread writer = new Thread(()->{
           try {
               Thread.sleep(1000);
               center.updateConfig("v2");
               Thread.sleep(1000);
               center.updateConfig("v3");
           }catch (Exception e){
               e.printStackTrace();
           }
        });

        reader.start();
        writer.start();

    }
}
