package com.krisswen.demo6;

public class Circle extends Shape{
    int r;

    public Circle(String name){
        super(name);
    }

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * this.r * this.r;
    }
}
