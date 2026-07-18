package homework.test1;

public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public void sleep() {
        System.out.println(name + "：动物睡觉");
    }
}
