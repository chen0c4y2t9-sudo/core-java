package com.itszb.demo3;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * Properties 也是一个Map集合，因为继承了HashTable。后续我们会对properties配置文件进行内容的读取操作，然后会将读取的内容
 * 封装到Properties对象中，然后再根据Properties对象提供的方法对key  value进行操作。
 * 由于Properties继承了HashTable，所以其操作也是线程安全的。
 *
 * Properties类中的常见方法：
 *   setProperty(String key,String value) 给Properties对象设置key value
 *   getProperty(String key) 根据key值获取Properties对象中的value值
 *   load(InputStream inputStream) 将输入流封装到Properties对象中
 *   propertyNames() 获取所有key的迭代器
 *   stringPropertyNames() 获取所有key的set集合
 */
public class PropertiesDemo {
    static void main() {
        // 创建Properties对象
        Properties properties = new Properties();
        // 向Properties对象中设置数据
        properties.setProperty("p1","v1");
        properties.setProperty("p2","v2");
        properties.setProperty("p3","v3");
        properties.setProperty("p4","v4");
        // 获取Properties对象中封装的数据
        String value = properties.getProperty("p2");
        System.out.println(value);

        // 循环遍历的方式输出Properties对象中的所有数据。  方式1
        Enumeration<?> enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
            // 获取Properties对象中的key值
            String key = enumeration.nextElement().toString();
            // 获取key值中对应的value值
            String property = properties.getProperty(key);
            System.out.println("键:" + key + "  值:" + property);
        }
        System.out.println("--------------------");
        // 循环遍历的方式输出Properties对象中的所有数据  方式2
        Set<String> set = properties.stringPropertyNames();// 获取所有key值放在set集合中
        for(String key : set){
            System.out.println(key + "------" + properties.getProperty(key));
        }
    }
}
