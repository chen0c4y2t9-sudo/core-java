package com.itszb.demo1;

/**
 *  程序在运行的过程中出现了意外的情况，如果这些意外的情况不去处理，就会导致程序卡在出现意外的地方不会向下执行。在JAVA中就会有一个专门的类，
 *  这个类就是Throwable，专门用于描述异常信息。
 *
 *     Throwable描述错误和异常的父类
 *          Error  子类，描述的是程序出现的错误信息(无法使用代码去解决的问题)
 *          Exception 子类 描述的是程序出现的异常信息(可以使用代码去规避这些问题)
 *              运行时异常：程序会编译通过，但是在运行的时候出现异常。
 *                        ArithmeticException
 *              编译时异常：程序都不会编译通过，这类异常必须在编译之前就需要处理，否则程序编译失败。
 *
 */
public class ThrowableDemo1 {
    static void main() {
        // 创建一个Throwable对象
        Throwable throwable = new Throwable();
        System.out.println(throwable.toString());// 输出的是Throwable所在的全限定名
        // 创建带有异常描述信息的Throwable对象
        Throwable throwable1 = new Throwable("这是一个异常类");
        System.out.println("获取异常的描述信息:" + throwable1.getMessage());
        int i = 10 / 0;
        System.out.println(i);
        throwable1.printStackTrace();// 打印异常的堆栈信息
    }
}
