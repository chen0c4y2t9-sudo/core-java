package com.krisswen.test1;

public class TestAnimal {
    static void main() {
        Animal dog = new Dog("旺财");
        dog.eat();
        dog.sleep();

        Animal cat = new Cat("橘猫");
        cat.eat();
        cat.sleep();
    }
}
