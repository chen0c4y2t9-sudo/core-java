package com.krisswen.demo1;

/**
 * 圆形类
 */
public class Circle extends Shape{

    int r;

    public Circle(String name) {
        super(name);
    }

    public Circle(String name,int r){
        super(name); // 调用父类的构造器
        this.r = r;
    }

    // 快捷键: Ctrl + i 可以看到父类里面的抽象方法，并且自动给它做实现。这个就是方法的重写

    /**
     * 什么是方法重写：必须在继承的场景下面，如果一个子类发现父类里面的方法不可用，或者父类里面的方法不满足子类需求，此时子类可以对父类的方法进行
     * 自定义，这个过程称为方法的重写。
     * @return
     */
    @Override
    public double getArea() {
        double area = 3.14 * this.r * this.r;
        return area;
    }

    @Override
    public double getLength() {
        return 2 * 3.14 * this.r;
    }
}
