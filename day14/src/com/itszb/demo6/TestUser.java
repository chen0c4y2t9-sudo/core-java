package com.itszb.demo6;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 序列化反序列化体系结构
 *
 * InputStream 字节输入流基类
 *    ObjectInputStream  序列化流的类
 * OutputStream 字节输出流基类
 *   ObjectOutputStream 反序列化流的类
 */
public class TestUser {


    // 序列化对象
    @Test
    public void test01() throws Exception{
        User user = new User();
        user.setUsername("eric");
        user.setPassword("admin123");
        // 构建一个输出流对象
        FileOutputStream out = new FileOutputStream(new File("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\user.txt"));
        // 构建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(user);
        // 关闭资源
        oos.close();
        out.close();
    }

    // 反序列化对象
    @Test
    public void test02() throws Exception{
        FileInputStream in = new FileInputStream(new File("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\user.txt"));
        // 构建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(in);
        User user = (User) ois.readObject();
        System.out.println(user);
        ois.close();
        in.close();
    }
}
