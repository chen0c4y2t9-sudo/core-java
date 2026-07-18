package com.krisswen.demo1;

/**
 * 方法重写需要注意的一些事项：
 *   1. 子类重写父类方法，要求方法的访问修饰符必须大于或等于父类
 *   2. 方法在重写的时候，要求子类方法的返回值类型必须要小于或等于父类
 *   3. 子类方法抛出的异常类型小于或等于父类方法抛出的异常类型
 */
public class Phone {

    public void call() throws Exception{
        System.out.println("传统的功能手机有打电话、发短信的功能");
    }

    public Object sayHello(){
        return new Object();
    }
}
