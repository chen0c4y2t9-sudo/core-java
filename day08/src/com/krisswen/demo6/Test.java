package com.krisswen.demo6;

public class Test {
    public String name;

    public Test(String name) {
        this.name = name;
    }

    public void hello(){
        class Inner{
            public void test(){
                System.out.println("这是局部内部类Inner里面的test方法");
            }
        }
        Inner inner = new Inner();
        inner.test();
    }
}
