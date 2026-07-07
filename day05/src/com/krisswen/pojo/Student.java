package com.krisswen.pojo;

/**
 * 饿汉式单例设计模式：强调的是对象的立即创建
 *
 * 单例设计模式：用来帮助我们生产单例对象，所谓的单例对象指的是：不管重复获取该对象多少次，这个对象都是同一个对象。
 * 单例设计模式的实现步骤：
 *    1. 成员属性私有化
 *    2，构造函数私有化
 *    3. 定义一个私有的、静态的对象
 *    4. 提供一个公共的方法，让外界可以通过该公共的方法访问并获取这些对象。
 */
public class Student {
    // 成员属性私有化
    private String name;
    private int age;
    private String address;

    // 构造器(函数)一旦被private关键字修饰之后，意味着在当前类的外部没办法使用该构造函数创建对象
    private Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 定义一个外界需要获取的对象，这个是对象是私有的 静态的。
    private static Student student = new Student("eric",18,"USA");

    // 如果外界就是想使用Student类型的对象，这个时候我们可以定义一个公共的方法，让外界通过这个公共的方法访问并获取这个对象
    public static Student getInstance(){
        return student;
    }
}
