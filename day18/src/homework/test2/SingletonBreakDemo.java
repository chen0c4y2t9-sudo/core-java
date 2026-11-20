package homework.test2;

import java.lang.reflect.Constructor;

public class SingletonBreakDemo {

    public static void main(String[] args) throws Exception {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("正常拿两次是同一个对象吗：" + (s1 == s2));

        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton s3 = constructor.newInstance();
        Singleton s4 = constructor.newInstance();

        System.out.println("反射造出来的两个对象是同一个吗：" + (s3 == s4));
        System.out.println("s1 地址：" + System.identityHashCode(s1));
        System.out.println("s3 地址：" + System.identityHashCode(s3));
        System.out.println("s4 地址：" + System.identityHashCode(s4));
    }
}
