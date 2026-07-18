package homework.test2;

public class Keyboard implements USB {
    @Override
    public void start() {
        System.out.println("键盘开始工作");
    }
    @Override
    public void stop() {
        System.out.println("键盘停止工作");
    }
}
