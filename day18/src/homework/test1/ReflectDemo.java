package homework.test1;

import java.lang.reflect.Field;

public class ReflectDemo {

    public static void main(String[] args) throws Exception {

        Class<User> clazz = User.class;
        User user = clazz.getDeclaredConstructor().newInstance();

        System.out.println("改之前：" + user);

        Field id = clazz.getDeclaredField("id");
        Field username = clazz.getDeclaredField("username");
        Field age = clazz.getDeclaredField("age");

        id.setAccessible(true);
        username.setAccessible(true);
        age.setAccessible(true);

        id.set(user, 1001);
        username.set(user, "张三");
        age.set(user, 20);

        System.out.println("改之后：" + user);
        System.out.println("id = " + id.get(user));
        System.out.println("username = " + username.get(user));
        System.out.println("age = " + age.get(user));
    }
}
