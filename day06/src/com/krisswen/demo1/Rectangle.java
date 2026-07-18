package com.krisswen.demo1;

/**
 * 矩形类
 */
public class Rectangle extends Shape{

    int width;
    int length;

    public Rectangle(String name){
        super(name);
    }

    public Rectangle(String name, int width, int length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getLength() {
        return 2 * (this.width + this.length);
    }
}
