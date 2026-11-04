package com.itszb.demo2;

/**
 * 单例设计模式: 用于产生单例对象。所谓的单例对象指的是：多次重复获取同一个类型的对象，这些对象都是唯一的。
 * 创建单例对象的步骤:
 *    1. 成员属性私有化
 *    2. 构造函数私有化
 *    3. 创建一个静态的私有化的对象，使用final修饰
 *    4. 定义一个公共的方法，外界可以通过该公共的方法访问并获取这些对象
 *
 *  饿汉式单例设计模式:
 *      单例对象的创建是立即创建的，不管我们需不需要这个单例对象，都会被创建出来。
 *      在并发场景下面，创建获取单例对象的过程是线程安全的。
 */
public class HungrySingleton {

    // 成员属性私有化(避免在当前类的外部进行属性的获取和设置)
    private String name;
    private String color;

    // 构造函数私有化,避免在当前类的外部使用该构造函数进行对象的创建
    private HungrySingleton(String name, String color){
        this.name = name;
        this.color = color;
    }

    // 创建一个对象
    private static final HungrySingleton singleton = new HungrySingleton("黄色","大黄");

    // 定义一个公共的方法，通过该公共的方法访问并获取这些对象
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
