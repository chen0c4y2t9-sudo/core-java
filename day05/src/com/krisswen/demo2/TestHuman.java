package com.krisswen.demo2;

public class TestHuman {
    static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "eric";
        worker.age = 22;
        worker.address = "USA";
        worker.work();
        // 在子类里面，同样可以继承父类里面的方法
        worker.hello();
    }
}
