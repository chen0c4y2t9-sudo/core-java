package homework.test2;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("Singleton 构造器被调用了");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
