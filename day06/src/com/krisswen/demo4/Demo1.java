package com.krisswen.demo4;

/**
 * 接口的定义格式：
 *    public interface 接口名称{
 *
 *    }
 */
public interface Demo1 {

    // String name;  在接口中不能定义成员变量
    int age = 22; // 相当于定义的是一个常量，因为java编译器在编译的时候，会自动的给变量前面加上public static final的关键字

    /**
     * 在接口中我们可以定义抽象方法，甚至可以省略不写abstract关键字，因为如果不写，编译器在编译的时候，会自动的加上abstract关键字
     */
    void test1();

    /**
     * 在接口中可以定义抽象方法，也可以定义非抽象的方法，但是非抽象的方法访问修饰符只能使用default关键字修饰
     * 接口也是不能被实例化的，因为实例化接口没有任何意义。
     */
    default void test02(){
        System.out.println("这是test02方法");
    }
}
