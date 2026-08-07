package com.krisswen.demo1;

public class Person {

    public void test(String... strings){
        // 如何获取传入的可变参数的值?
        for(String string : strings){
            System.out.println(string);
        }
    }

    /**
     * 如果一个方法既要传入固定的参数值，也需要传递可变参数，那么可变参数只能放在参数列表的最后面
     * @param a
     * @param b
     * @param strs
     */
    public void test1(int a,int b,String... strs){}
}
