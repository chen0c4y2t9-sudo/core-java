package com.itszb.demo1;

/**
 * 捕获异常的处理方式
 *   try{
 *       定义可能会出现异常的代码
 *   }catch(异常类型  变量名称){
 *       处理异常的代码
 *   }
 *  手动进行异常处理的方式:
 *    ① 虽然没有对异常进行修正，但是它可以保证我们程序继续执行。
 *    ② 在整个代码中，虽然某个地方出现了异常，但是不能因为这个地方出现异常，而导致我们后续正常代码也没办法执行，所以使用这种手动处理的方式比JVM
 *       进行自动异常的处理会更加合理。
 *
 *  使用try-catch进行异常处理的需要注意的事项:
 *     1. 如果在try中出现了多行代码，如果一行代码出现了问题，那么在try块中出现问题代码的后面代码都不会被执行。
 *     2. 在程序中，有可能出现多种异常类型的。这些不同类型的异常，我们都需要进行处理，此时我们可以使用多重catch语句进行处理。
 */
public class ThrowableDemo3 {
    static void main() {
        getNum(10,0);
    }

    public static void getNum(int a,int b){
        int c = 0;
        try{
            c = a / b;
            System.out.println("被执行了吗?????");
        }catch (ArithmeticException ex){
            System.out.println("除数不能为0!");
        }
        System.out.println("两个数字相除的结果是:" + c);
    }
}
