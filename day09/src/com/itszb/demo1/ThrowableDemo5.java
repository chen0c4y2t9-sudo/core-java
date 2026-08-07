package com.itszb.demo1;

import java.util.Scanner;

/**
 * 异常的抛出处理
 *    throw: 在方法的内部使用，throw后面跟一个异常对象
 *            比如  throw NullPointException
 *    throws 声明在方法的名称后面，thorws后面跟的是异常的类名
 *            比如  getNum() throws NullPointException{}
 *
 *  在使用抛出异常处理需要注意的细节：
 *     ① 在方法内部使用throw抛出了Exception类型的异常，在方法上需要使用throws关键字声明抛出
 *     ② 如果一个方法使用throws声明抛出Exception类型的异常，那么在调用这个方法的时候，必须对该方法进行异常处理。处理异常的方式有2两种，要么使用
 *       try-catch进行捕获处理，要么继续使用throws关键字进行异常的抛出。
 *     ③ 方法在执行的时候，如果遇到了throw关键字，那么throws关键字后面的代码是不会执行的。
 *     ④ 在一个方法的内部，可以使用throw关键字抛出多个异常类型的对象
 *
 *  总结:  throw 和throws关键字的区别：
 *  throw关键字用于方法的内部，用于异常对象的抛出。 throw后面只能跟一个异常对象。
 *  throws 关键字用于方法名称上面，用于异常抛出声明，throws后面可以跟多个异常类型，多个异常类型使用逗号分隔。
 *
 */
public class ThrowableDemo5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num1 = sc.nextInt();
        System.out.println("请再次输入一个数字:");
        int num2 = sc.nextInt();
        try {
            getNum(num1,num2,null);
        }catch (Exception ex){
            System.out.println("调用者处理了异常");
            ex.printStackTrace();
        }
    }

    // 定义一个数字运算的方法
    public static void getNum(int a,int b,int[] arr) throws Exception{ // throws Exception 声明将该方法可能出现的异常进行抛出
        if(b == 0){
            throw new ArithmeticException("除数不能为0");
            // System.out.println("hello");
        }
        if(arr == null){
            throw new RuntimeException("数组的对象不能为空");
        }
        int c = a / b;
        System.out.println(arr[0]);
        System.out.println("两个数字相除的结果是:" + c);
    }
}
