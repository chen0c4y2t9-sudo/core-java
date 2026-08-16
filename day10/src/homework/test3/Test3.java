package homework.test3;

public class Test3 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.set("你好泛型");
        System.out.println(b1.get());
        b1.showType();

        Box<Integer> b2 = new Box<>();
        b2.set(2026);
        System.out.println(b2.get());
        b2.showType();
    }
}