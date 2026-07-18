package com.krisswen.demo6;

public abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    // 计算图形面积的抽象方法
    public abstract double getArea();
}
