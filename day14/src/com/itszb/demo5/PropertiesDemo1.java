package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo1 {

    @Test
    public void test01() throws Exception{
        // 创建Properties对象
        Properties properties = new Properties();
        // 将字节输入流加载到Properties对象中
        properties.load(new FileInputStream(new File("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\user.properties")));
        Enumeration<?> enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
            String key = enumeration.nextElement().toString();
            String value = properties.getProperty(key);
            System.out.println(key + "  "  + value);
        }
    }

    @Test
    public void test02() throws Exception{
        // 创建Properties对象
        Properties properties = new Properties();
        // 基于类加载器加载类路径下面的资源
        InputStream in = PropertiesDemo1.class.getClassLoader().getResourceAsStream("user.properties");
        properties.load(in);
        Enumeration<?> enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
            String key = enumeration.nextElement().toString();
            String value = properties.getProperty(key);
            System.out.println(key + "  "  + value);
        }
    }
}
