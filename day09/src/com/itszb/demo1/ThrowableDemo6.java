package com.itszb.demo1;

/**
 * finally关键字：
 * finally不能单独使用，必须和try语句一起使用。
 *   try - catch - finally
 *   try - finally
 */
public class ThrowableDemo6 {
    static void main() {
        getNum1(10,3);
    }

    public static void getNum(int a,int b){
       try{
           int c = a / b;
           System.out.println(c);
           //return;
           throw new Exception("抛出了异常");
       }catch (Exception ex){
           System.out.println("处理了异常类型");
       }finally {
           // 不管我们的程序有没有出现异常，最终都会进入到finally块里面来，即使在程序中出现了return throw关键字，finally块中的代码依旧会被执行
           System.out.println("finally块里面的代码最终执行了.....");
       }
    }

    public static void getNum1(int a,int b){
        try{
            int c = a / b;
            System.exit(0); //JVM强制退出，此时finally块里面的代码会执行吗？？？
        }catch (Exception ex){
            System.out.println("处理了异常类型");
        }finally {
            // 不管我们的程序有没有出现异常，最终都会进入到finally块里面来，即使在程序中出现了return throw关键字，finally块中的代码依旧会被执行
            System.out.println("finally块里面的代码最终执行了.....");
        }
    }
}
