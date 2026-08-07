package com.krisswen.demo4;

public class TestInner {
    static void main() {
        /*Test test = new Test();// 创建外层对象
        Test.Inner inner = test.new Inner();// 基于外层对象 new 内层类名 --> 创建内层对象  要求Inner内部类访问修饰符不能是private关键字修饰，否则创建内部类对象失败
        inner.test();*/

        Test test = new Test("小明");
        Test.Inner inner1 = test.new Inner();
        inner1.test("eric");

        /*Test test2 = new Test("小黄");
        Test.Inner inner2 = test2.new Inner();
        inner2.test("james");*/
    }
}
