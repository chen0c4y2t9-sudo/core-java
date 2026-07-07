public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 5);

        // 输出矩形的周长和面积
        System.out.println("矩形信息：");
        System.out.println("长度：" + 10 + "，宽度：" + 5);
        System.out.println("周长：" + rect.getPerimeter());
        System.out.println("面积：" + rect.getArea());
    }
}