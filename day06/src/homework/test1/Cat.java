package homework.test1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(name + "：猫吃鱼");
    }
}
