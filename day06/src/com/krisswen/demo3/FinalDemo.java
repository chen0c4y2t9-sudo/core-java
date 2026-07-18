package com.krisswen.demo3;

/**
 * 在继承的场景下面，子类是可以继承父类里面的非私有方法，并且可以根据之类的需求，去重写父类里面的方法。但是如果父类的方法不允许子类去重写，那应该怎么做呢？
 * 可以使用final关键字修饰父类方法来实现。
 * final关键字：
 *   final修饰类，意味着该类不能被继承；
 *   final修饰方法 意味着该方法不能被子类重写；
 *   final修饰变量 意味着该变量不能被再次修改（就是一个常量）
 *
 *   final修饰一个类，格式如下：
 *   public final class 类名{
 *
 *   }
 *
 *   final修饰一个方法，意味着子类不能重写这个方法
 *      访问修饰符  final 返回值类型  方法名称(参数列表){
 *
 *      }
 *
 *  final修饰变量：  final  数据类型 变量名称 = 值
 */
public class FinalDemo {
    String name;
    int age;
    static final String ADDRESS = "USA";

    public final void showInfo(){
        final int a = 100;
        // a = 20;
        System.out.println("姓名:" + this.name + "年龄:" + this.age);
    }
}
