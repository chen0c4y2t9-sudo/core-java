package com.krisswen.demo5;

public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }
    public static class Inner{
        String desc;
        // 在静态内部类中，是无法访问到外部类的非静态资源，因为在静态内部类里面，都是属于静态上下文
        public void test(){
            // System.out.println("这是静态内部类Inner的test方法" + name);  编译报错
            System.out.println(desc); // 在静态内部类里面，使用自己非静态的资源是可以的
        }
    }
}
