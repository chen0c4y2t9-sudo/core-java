package com.krisswen.demo1;

/**
 * 需求：计算图形的面积
 *  如果我们要描述一个方法，但是我们又不能一次性的描述清楚。那我们索性不描述这个方法的具体实现过程。不描述具体事项过程的方法，我们称为抽象方法，而
 *  抽象方法所属的类又称为抽象类
 *
 *  定义一个抽象类的格式： abstract关键字
 *
 *  public abstract class 类名{
 *
 *      public abstract 方法名(参数列表);
 *  }
 *  注意：抽象类是不能够直接使用的，也就是不能基于抽象类去实例化对象，因为如果能实例化对象，通过对象调用一个抽象方法，是没有任何意义的。
 *        但是抽象类可以被继承。子类可以去实现父类的抽象方法
 *
 *  使用抽象类需要注意的事项：
 *     1. 如果一个子类继承了抽象类，在当前子类里面必须实现父类里面的所有抽象方法
 *     2. 在一个抽象类里面，我们可以定义非抽象的方法
 *     3. 抽象类是不能被实例化的，因为这样做没有意义。
 *     4. 抽象类是可以有成员变量和构造函数的，因为提供了构造函数可以被其他子类调用
 */
public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    // 定义一个计算图形面积的方法
    public abstract double getArea();
    // 获取周长的方法
    public abstract double getLength();

   /* public void show(){
        System.out.println("这是一个非抽象的方法");
    }*/
}
