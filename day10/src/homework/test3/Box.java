package homework.test3;

public class Box<T> {
    private T content;

    void set(T content) {
        this.content = content;
    }

    T get() {
        return content;
    }

    void showType() {
        System.out.println("类型是：" + content.getClass().getName());
    }
}