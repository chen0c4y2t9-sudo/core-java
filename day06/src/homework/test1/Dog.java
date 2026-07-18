package homework.test1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(name + "：狗吃骨头");
    }
}
