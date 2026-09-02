package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * 关于File类的讲解。
 * 什么是File: 是java用来描述文件的一个类
 */
public class FileDemo1 {

    @Test
    public void test01(){
        // 根据文件路径构建一个File对象
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\moon.jpg");
        boolean exists = file.exists(); // 判断对应的文件路径是否存在，如果存在则返回true
        System.out.println(exists);
    }

    @Test
    public void test02(){
        // 根据父路径和子路径构建一个File对象
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file","moon.jpg");
        boolean result = file.exists();
        System.out.println(result);
    }

    @Test
    public void test03(){
        File parent = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file");
        // 根据父文件对象和子路径构建一个File对象
        File file = new File(parent,"moon.jpg");
        boolean flag = file.exists();
        System.out.println(flag);
    }

    /**
     * 注意： 在不同的操作系统下，文件路径的分隔符不一样，在windows里面，分隔符是"\\"；但是在linux里面分隔符是"/"，
     * 为了动态描述文件的分隔符，我们可以使用File.separatorChar
     */
    @Test
    public void test04(){
        File parent = new File("F:" + File.separator + "资料" + File.separator + "JAVASE" + File.separator + "day14 -- IO流" + File.separator + "file");
        // 根据父文件对象和子路径构建一个File对象
        File file = new File(parent,"moon.jpg");
        boolean flag = file.exists();
        System.out.println(flag);
    }
}
