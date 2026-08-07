package com.krisswen.demo4;

public class Test {
    private String name;

    public Test(){}

    public Test(String name) {
        this.name = name;
    }

    public class Inner{
        String name;
        public void test(String name){
            //System.out.println("方法参数的name:" + name);
            //System.out.println("内部类的name:" + this.name);
            // 在内部类里面是可以访问外部类的成员变量的
            //System.out.println("我是内部类Inner....." + Test.this.name);

            this.toString(); // 调用内部类自己的toString方法
            super.toString(); // 掉用Inner父类的toString方法
            Test.this.toString(); // 调用外部类的toString方法
            Test.super.toString(); // 调用外部类的父类的toString方
        }
    }
}
