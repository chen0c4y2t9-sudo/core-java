package homework.test3;

public class ShapeUtils {
    public static void printArea(Shape shape) {
        if (shape instanceof Circle) {
            System.out.print("圆形面积：");
        } else if (shape instanceof Rectangle) {
            System.out.print("矩形面积：");
        } else {
            System.out.print("图形面积：");
        }
        System.out.printf("%.2f\n", shape.getArea());
    }
}
