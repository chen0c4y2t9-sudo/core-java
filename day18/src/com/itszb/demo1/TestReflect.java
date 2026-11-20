package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射测试类
 */
public class TestReflect {

    /**
     * 获取一个类的Class对象，Class字节码对象的获取方式有3种。
     *   方式1: Class.forName(类的全限定名);
     *   方式2: 类名.class
     *   方式3: 对象名.getClass()
     * 不管是基于哪种方式获取的字节码对象，该字节码文件对象永远唯一。
     */
    @Test
    public void test01() throws Exception {
        // 第一种方式
        Class<?> clazz1 = Class.forName("com.itszb.demo1.Person");
        // 第二种方式
        Class<Person> clazz2 = Person.class;
        // 第三种方式
        Class<? extends Person> clazz3 = new Person().getClass();
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
        System.out.println(clazz1 == clazz3);
    }

    /**
     * 测试构造器的使用
     * @throws Exception
     */
    @Test
    public void test02() throws Exception {
        Class<?> clazz = Class.forName("com.itszb.demo1.Person");
        // 使用Class字节码对象获取构造函数对象
        Constructor<?> c1 = clazz.getConstructor();// 获取无参数的构造器
        System.out.println("无参数的构造器对象是: " + c1);
        // 获取带String类型参数的构造器
        Constructor<?> c2 = clazz.getConstructor(String.class);
        System.out.println("带一个参数的构造器对象:" + c2);
        // 带两个参数的构造器对象(只能获取public修饰的构造器对象)
        // Constructor<?> c3 = clazz.getConstructor(String.class, Integer.class);
        // 获取私有的构造器对象
        Constructor<?> c3 = clazz.getDeclaredConstructor(String.class, Integer.class);
        System.out.println("带两个参数的构造器对象:" + c3);

        // 带所有参数的构造器对象(只能获取公有的构造器对象)
        /*Constructor<?>[] ctors = clazz.getConstructors();
        for(Constructor ctor : ctors){
            System.out.println(ctor);
        }*/

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }

        // 根据Constructor对象进行对象的构建
        Person p1 = (Person)c1.newInstance();
        System.out.println(p1);
        Person p2 = (Person) c2.newInstance("eric");
        System.out.println(p2);
        // 声明对私有资源的访问权限
        c3.setAccessible(true);
        Person p3 = (Person) c3.newInstance("eric",13);
        System.out.println(p3);
    }

    @Test
    public void test03() throws Exception {
        DoubleCheckLockSingleton o1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton o2 = DoubleCheckLockSingleton.getInstance();
        System.out.println(o1 == o2); // true

        // 基于反射的机制打破单例设计模式
        Class<DoubleCheckLockSingleton> clazz = DoubleCheckLockSingleton.class;
        Constructor<DoubleCheckLockSingleton> constructor = clazz.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);
        DoubleCheckLockSingleton o3 = constructor.newInstance("黄色","大黄");
        DoubleCheckLockSingleton o4 = constructor.newInstance("黄色","大黄");
        System.out.println(o3 == o4); // false
    }

    /**
     * 演示Method对象的方法
     * @throws Exception
     */
    @Test
    public void test04() throws Exception {
        Class<?> clazz = Class.forName("com.itszb.demo1.Person");
        // 创建Person对象
        Person person = (Person) clazz.getConstructor(null).newInstance(null);
        // 获取方法对象Method
        Method[] methods = clazz.getMethods(); // 获取当前类的公有方法包括父类的公共方法
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("-----------------------");
        // 获取指定的方法对象showInfo
        // Method method = clazz.getMethod("showInfo", null);
        // getDeclaredMethod(): 不管是公有的方法还是私有的方法，都能够进行获取
        Method method = clazz.getDeclaredMethod("showInfo", null);
        System.out.println(method);
        // 获取私有的方法对象
        Method method1 = clazz.getDeclaredMethod("getMessage", String.class);
        System.out.println(method1);

        Method method2 = clazz.getDeclaredMethod("getSum", int.class,int.class);

        // 基于方法对象进行方法的调用
        // 参数1： 指定对象名字  参数2: 传入到方法的实际参数
        method.invoke(person);
        Object result = method2.invoke(person, 1, 2);
        System.out.println(result);

        method1.setAccessible(true);
        Object result1 = method1.invoke(person,"hello");
        System.out.println(result1);
    }

    /**
     * 演示Field的使用
     * @throws Exception
     */
    @Test
    public void test05() throws Exception {
        Class<Person> clazz = Person.class;
        Person person = clazz.getConstructor().newInstance();
        // 还有一种是直接使用Class字节码对象进行对象的创建
        //Person person1 = clazz.newInstance();

        // 获取所有公有的成员变量
        Field[] fields = clazz.getFields();
        for(Field field : fields){
            System.out.println(field);
        }
        System.out.println("-------------------------");
        // 获取指定的field对象(公有的)
//        Field field = clazz.getField("username");
//        Field field1 = clazz.getField("age");
        Field field = clazz.getDeclaredField("username");
        Field field1 = clazz.getDeclaredField("age");
        // 声明对私有资源的访问权限
        field.setAccessible(true);
        field1.setAccessible(true);
        field.set(person,"eric");
        field1.set(person,18);
        System.out.println(person);

        // 获取属性值
        Object v1 = field.get(person);
        Object v2 = field1.get(person);
        System.out.println(v1 + "----" + v2);

        // 获取一个类的全限定名(包名+类名)
        System.out.println(clazz.getName());
        // 获取类的名称
        System.out.println(clazz.getSimpleName());
    }
}
