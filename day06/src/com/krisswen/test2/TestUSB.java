package com.krisswen.test2;

public class TestUSB {
    static void main() {
        USB mouse = new Mouse();
        mouse.start();
        mouse.show();
        mouse.stop();

        USB keyboard = new KeyBoard();
        keyboard.start();
        keyboard.show();
        keyboard.stop();
    }
}
