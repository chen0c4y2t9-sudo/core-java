package com.itszb.demo2;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 字节输出流 OutputStream
 *    FileOutputStream  字节输出流
 */
public class FileOutputStreamDemo1 {

    /**
     * write方法，默认的情况下，会使用新的内容覆盖旧的内容，并不是在原有文件末尾处进行追加。
     *     如果我们要实现写出内容的时候，在原有文件末尾处进行追加，可以使用
     * @throws Exception
     */
    @Test
    public void test01() throws Exception{
        // 根据File对象构建字节输出流
        OutputStream out = new FileOutputStream(new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\a.txt"),true);
        String message = "hello,ai;hello,mysql;hello,spring;hello,cursor";
        // 将字符串的内容打成字节数组之后，以字节的方式向文件写出
        out.write(message.getBytes());
        //out.write(100);// 根据ascii码值去写数据
        //out.write(message.getBytes(),0,5); // 根据字节数组的内容，写出部分内容出去
        // 关闭资源
        out.close();
    }
}
