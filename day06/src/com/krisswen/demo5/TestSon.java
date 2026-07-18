package com.krisswen.demo5;

public class TestSon {
    static void main(String[] args) {
        /**
         * 在多态的前提下，如果子类和父类都存在同名的成员变量，访问的是父类的成员变量值
         */
        Fu fu = new Son();
        System.out.println(fu.num);// 父类的值
        /**
         * 在多态的前提下面，如果父类和子类都存在同名的成员方法，访问的是子类的成员方法
         */
        fu.study();
        // 在多态场景下面，是不能直接调用子类里面特有方法的
        // fu.sleep();
        // 如果想要调用子类里面特有的方法，可以使用instanceof 表达式来实现
        if(fu instanceof Son son){
            son.sleep();
        }
    }
}
