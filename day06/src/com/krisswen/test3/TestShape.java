package com.krisswen.test3;

public class TestShape {

    public static void printArea(Shape shape){
        System.out.println("图形的面积是：" + shape.getArea());
    }

    static void main() {
        Shape circle = new Circle(3);
        Shape rect = new RectAngle(4,5);
        printArea(circle);
        printArea(rect);
    }
}
