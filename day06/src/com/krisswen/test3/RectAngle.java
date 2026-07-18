package com.krisswen.test3;

public class RectAngle extends Shape {

    private double width;
    public double height;

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
