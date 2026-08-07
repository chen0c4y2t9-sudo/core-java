package com.itszb.demo1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ThrowableDemo4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("请输入一个数字:");
        int num1 = sc.nextInt();
        System.out.println("请再次输入一个数字:");
        int num2 = sc.nextInt();
        getNum(num1,num2,arr);
    }

    public static void getNum(int a,int b,int[] arr){
       /* int c = 0;
        try{
            c =  a/ b;
            System.out.println(arr[2]);
            System.out.println("这行代码执行了吗????");
        }catch (ArithmeticException ex){
            System.out.println("除数不能为0，会触发ArithmeticException算术异常");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("数组下标不能越界，会触发ArrayIndexOutOfBoundsException数组下标越界异常");
        }catch (NullPointerException ex){
            System.out.println("数组对象不能为空，会触发NullPointerException空指针异常");
        }
        System.out.println("c的结果是:" + c);
        System.out.println("程序执行结束.....");*/

        int c = 0;
        try{
            c =  a/ b;
            System.out.println(arr[5]);
            System.out.println("这行代码执行了吗????");
        }catch (Exception ex){
            System.out.println("程序出现了异常");
        }
        System.out.println("c的结果是:" + c);
        System.out.println("程序执行结束.....");
    }
}
