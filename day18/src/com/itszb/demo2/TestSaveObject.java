package com.itszb.demo2;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class TestSaveObject {
    public static void saveObject(Object o) throws Exception{
        // 打印流(可以将数据以明文的方式写入到文件中)
        PrintStream ps = new PrintStream(new FileOutputStream("F:\\资料\\JAVASE\\day18 -- 反射&注解\\课件\\hello.txt",true));
        // 获取字节码对象
        Class<?> clazz = o.getClass();
        ps.print("--------------------" + clazz.getSimpleName() + "---------------");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            // 获取成员变量的名称
            String name = field.getName();
            // 获取成员变量的值
            field.setAccessible(true);
            String value = field.get(o) + "";
            ps.print(name + "   " + value);
        }
        ps.close();
    }

    @Test
    public void test01() throws Exception{
        Student student = new Student("eric",14,'男',1.88,"踢球");
        Teacher teacher = new Teacher("lily",999.9);
        saveObject(student);
        saveObject(teacher);
    }
}
