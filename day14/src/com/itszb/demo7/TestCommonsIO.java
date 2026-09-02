package com.itszb.demo7;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestCommonsIO {

    // 文件的读操作
    @Test
    public void test01() throws Exception{
        String msg = FileUtils.readFileToString(new File("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\demo1\\new_file.txt"));
        System.out.println(msg);
    }

    // 文件的写操作
    @Test
    public void test02() throws Exception{
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\demo1\\out.txt");
        String message = "今天我们学习的是IO";
        /**
         * 参数1: 指定File对象
         * 参数2: 指定写的内容
         * 参数3: 指定写入数据需要遵循的编码格式
         * 参数4: 描述内容是否进行追加 true: 在文件的末尾处进行追加  false: 直接覆盖原来的内容
         */
        FileUtils.writeStringToFile(file,message,"utf-8",true);
    }

    // 文件拷贝操作
    @Test
    public void test03() throws Exception{
        FileInputStream in = new FileInputStream("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\demo1\\moon.jpg");
        FileOutputStream out = new FileOutputStream("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\demo1\\moon2.jpg");
        // 实现图片的拷贝功能
        IOUtils.copy(in,out);
        // 释放资源
        IOUtils.closeQuietly(out);// out.close()
        IOUtils.closeQuietly(in); // in.close()
    }
}
