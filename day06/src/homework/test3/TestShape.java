package homework.test3;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("--- 使用工具方法计算面积 ---");
        ShapeUtils.printArea(circle);
        ShapeUtils.printArea(rectangle);

        System.out.println("\n--- 直接调用 getArea() ---");
        System.out.printf("圆形面积：%.2f\n", circle.getArea());
        System.out.printf("矩形面积：%.2f\n", rectangle.getArea());
    }
}
