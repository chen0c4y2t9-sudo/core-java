package com.itszb.demo3;

public class MyDemo2 {
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    static void main() {
        MyDemo2 demo = new MyDemo2();
        for(int i = 0;i<5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (MyDemo2.class){
                        demo.setContent(Thread.currentThread().getName() + "的数据");
                        System.out.println("-----------------");
                        System.out.println(Thread.currentThread().getName() + "--->" + demo.getContent());
                    }
                }
            });
            thread.setName("线程" + i);
            thread.start();
        }
    }
}
