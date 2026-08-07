package com.krisswen.demo7;

public class TestStudent {
    static void main() {
        Student student = new Student() {
            int a = 100;
            @Override
            public void test() {
                System.out.println("这是一个测试方法" + a);
            }

            @Override
            public void test1() {
                System.out.println("这是test1方法");
            }
        };
        student.test1();
    }

}
