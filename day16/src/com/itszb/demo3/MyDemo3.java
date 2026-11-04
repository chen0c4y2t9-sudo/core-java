package com.itszb.demo3;

public class MyDemo3 {
    private static ThreadLocal<String> tl = new ThreadLocal<>();

    private String content;

    public String getContent() {
        return tl.get();
    }

    public void setContent(String content) {
       tl.set(content);
    }

    static void main() {
        MyDemo3 demo3 = new MyDemo3();
        for(int i = 0;i<5;i++){
            Thread thread = new Thread(new Runnable(){
                @Override
                public void run() {
                    demo3.setContent(Thread.currentThread().getName() + "的数据");
                    System.out.println("-----------------");
                    System.out.println(Thread.currentThread().getName() + "--->" + demo3.getContent());
                }
            });
            thread.setName("线程" + i);
            thread.start();
        }
    }
}
