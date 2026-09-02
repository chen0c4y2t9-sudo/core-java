package com.itszb.demo2;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 使用字节输入流和字节输出流实现图片的拷贝
 */
public class CopyImageTest {

    @Test
    public void test01() throws Exception{
        // 构建源文件对象
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\moon.jpg");
        // 构建输出文件对象
        File newFile = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\new_moon.jpg");
        // 构建图片的字节输入流对象
        InputStream in = new FileInputStream(file);
        // 构建图片的字节输出流对象
        OutputStream out = new FileOutputStream(newFile);
        /**
         * 拷贝思路: 先读后写
         *   先将文件通过输入流读取到内存中来，再将读到内存中的内容输出到文件中
         */
        byte[] bytes = new byte[1024];
        int length = 0;
        while((length = in.read(bytes)) != -1){
            out.write(bytes,0,length);
        }
        // 关闭资源
        out.close();
        in.close();
    }
}
