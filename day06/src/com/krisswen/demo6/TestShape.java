package com.krisswen.demo6;

public class TestShape {
    static void main(String[] args) {
        //Square square = new Square("正方形",4);
        Circle circle = new Circle("圆形",3);
        double area = getAreaFromShape(circle);
        System.out.println("图形面积是:" + area);

        Shape shape = getShape(2);
        double shapeArea = shape.getArea();
        System.out.println(shapeArea);
    }

    // 定义一个方法获取图形的面积
    /**
     * 多态的使用场景：使用父类作为方法的形式参数，这样可以接受更多类型的数据
     */
    public static double getAreaFromShape(Shape shape){ // Shape shape = new Square("正方形",4);
        return shape.getArea();
    }

    // 通过接收的数字来判断返回具体的图像面试，num=1返回正方形的面积，num=2，返回圆形的面积
    // 使用父类作为方法的返回值，可以返回更多类型的数据
    public static Shape getShape(int num){
        Shape shape = null;
        if(num == 1){
            shape = new Square("正方形,",4);
        }
        if(num == 2){
            shape = new Circle("圆形",3);
        }
        return shape;
    }
}
