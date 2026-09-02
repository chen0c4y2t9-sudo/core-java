package com.itszb.demo2;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 字节输入流:
 *  InputStream 输入流的基类,这是一个抽象类
 *      FileInputStream 字节输入流 继承了InputStream
 *
 * 需求: 读取指定目录下面的txt文件的内容
 * 使用字节输入流进行读取
 * 步骤:
 *    构建一个文件对象
 *    构建字节输入流对象
 *    执行read操作，读取文件
 *    关闭流通道,释放资源
 *
 */
public class FileInputStreamDemo1 {

    @Test
    public void test01() throws Exception{
        // 构建一个File对象
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\a.txt");
        // 构建字节输入流通道
        InputStream inputStream = new FileInputStream(file);
        int data = 0;
        /**
         * data到底是什么???
         *     读取到的每一个字符的10禁止的ascii编码值，我们可以使用char进行强转，得到对应的字符。
         * 为什么循环条件不等于-1???
         *     如果读到了文件的末尾处，这个返回值就是-1，说明这个文件的内容读取完了。
         *  为什么在程序的最后要关闭资源???
         *     防止内存泄漏(memory leak)
         *  内存溢出和内存泄漏的区别:
         *     内存泄漏指的是: 程序执行完成，因为一些原因导致程序所持有的内存不能被释放，刚开始没什么问题，但是如果越来越多的内存得不到释放，就会导致
         *     可用的内存越来越少，最终内存资源不够用，导致内存溢出(out of memory)。
         *
         */
        while ((data = inputStream.read()) != -1){
            System.out.print((char) data);
        }
        // 关闭资源
        inputStream.close();
    }

    @Test
    public void test02() throws Exception{
        // 构建一个文件对象
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\a.txt");
        // 根据文件对象构建一个字节输入流对象
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int data = 0;
        /**
         * read(bytes) 一次性读取1024字节，data保存的是实际读取的字节的个数。
         * 有可能在最后一次读操作的时候，读取的字节不满1024个，所以data保存的是实际读取字节的个数
         */
        while((data = in.read(bytes)) != -1){
            /**
             * 参数1: 字节数组对象
             * 参数2: 字节数组中的第一个元素
             * 参数3: 基于字节数组实际存在的字节个数
             */
            String string = new String(bytes,0,data);
            System.out.println(string);
        }
        // 关闭资源
        in.close();
    }

    @Test
    public void test03() throws Exception{
        long start = System.currentTimeMillis();
        // 构建一个文件对象
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\sql01.sql");
        // 根据文件对象构建一个字节输入流对象
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int data = 0;
        /**
         * read(bytes) 一次性读取1024字节，data保存的是实际读取的字节的个数。
         * 有可能在最后一次读操作的时候，读取的字节不满1024个，所以data保存的是实际读取字节的个数
         */
        while((data = in.read(bytes)) != -1){
            /**
             * 参数1: 字节数组对象
             * 参数2: 字节数组中的第一个元素
             * 参数3: 基于字节数组实际存在的字节个数
             */
            String string = new String(bytes,0,data);
            System.out.println(string);
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间是:" + (end - start));
        // 关闭资源
        in.close();
    }


    @Test
    public void test04() throws Exception{
        // 构建一个文件对象
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\资料\\demo1\\c.txt");
        // 根据文件对象构建一个字节输入流对象
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int data = 0;
        /**
         * read(bytes) 一次性读取1024字节，data保存的是实际读取的字节的个数。
         * 有可能在最后一次读操作的时候，读取的字节不满1024个，所以data保存的是实际读取字节的个数
         */
        while((data = in.read(bytes)) != -1){
            /**
             * 参数1: 字节数组对象
             * 参数2: 字节数组中的第一个元素
             * 参数3: 基于字节数组实际存在的字节个数
             */
            String string = new String(bytes,0,data);
            System.out.println(string);
        }
        // 关闭资源
        in.close();
    }
}
