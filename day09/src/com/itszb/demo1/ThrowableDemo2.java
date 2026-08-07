package com.itszb.demo1;

import java.util.Scanner;

/**
 * 为什么程序在运行的过程中会出现一些异常信息：
 *   因为程序在执行到20行代码的时候，由于发现num2等于0，但是除数是不能为0的，此时就出现了程序执行不正常的情况。由于我们程序员没有
 *   收到的处理异常，所以JVM在执行到int c = num1 / num2 的时候，发现我们没有处理异常，它就会亲自处理异常信息。它处理的逻辑是：
 *   调用Throwable类里面printStackTrace方法，将异常信息在控制台进行输出，并且后续代码都不会再执行。
 *
 *
 *  异常信息的处理除了依赖于JVM自动处理之外，我们还可以进行手动处理，手动处理异常的方式有很多：
 *     捕获异常处理
 *     抛出异常处理
 *     自定义异常处理。
 */
public class ThrowableDemo2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num1 =  sc.nextInt();
        System.out.println("请再次输入一个数字:");
        int num2 = sc.nextInt();
        getNUm(num1,num2);
    }

    private static void getNUm(int num1, int num2) {
        int c = num1 / num2;
        System.out.println(c);
    }


}
