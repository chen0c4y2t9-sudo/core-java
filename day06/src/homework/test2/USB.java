package homework.test2;

public interface USB {
    void start();
    void stop();
    default void show() {
        System.out.println("USB 设备工作中");
    }
}
