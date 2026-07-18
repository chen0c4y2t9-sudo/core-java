package homework.test2;

public class TestUSB {
    public static void main(String[] args) {
        // 多态创建对象
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();

        System.out.println("--- 鼠标操作 ---");
        mouse.start();
        mouse.show();
        mouse.stop();

        System.out.println("\n--- 键盘操作 ---");
        keyboard.start();
        keyboard.show();
        keyboard.stop();
    }
}
