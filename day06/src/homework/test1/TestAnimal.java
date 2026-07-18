package homework.test1;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog("旺财");
        Animal cat = new Cat("咪咪");

        System.out.println("--- 狗的行为 ---");
        dog.eat();
        dog.sleep();

        System.out.println("\n--- 猫的行为 ---");
        cat.eat();
        cat.sleep();
    }
}
