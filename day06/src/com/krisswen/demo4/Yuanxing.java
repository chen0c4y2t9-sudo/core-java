package com.krisswen.demo4;

/**
 * 如果一个接口被定义之后，这个接口中的所有抽象方法是需要被实现的。我们可以使用一个类去实现一个接口，具体的语法格式：
 *  public 类名 implements 接口名{
 *
 *      // 在这个类里面需要去实现接口中的所有方法
 *  }
 */
public class Yuanxing implements Tuxing{

    @Override
    public void getArea() {
        System.out.println("圆形获取面积的方法被实现了");
    }

    @Override
    public void getLength() {
        System.out.println("圆形获取周长的方法被实现了");
    }
}
