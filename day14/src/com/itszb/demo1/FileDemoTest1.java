package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileDemoTest1 {

    // 将指定目录下面文件归类输出
    @Test
    public void test01(){
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        File[] files = file.listFiles();
        // 输出文件目录
        for(File f : files){
            if(f.isDirectory()){
                System.out.println("文件目录是:" + f.getName());
            }
        }

        // 输出.java文件
        for(File f : files){
            if(f.getName().endsWith(".java")){
                System.out.println("JAVA文件名称是:" + f.getName());
            }
        }

        // 输出.txt文件
        for(File f : files){
            if(f.getName().endsWith(".txt")){
                System.out.println("txt文件名称是:" + f.getName());
            }
        }

        // 输出.js文件
        for(File f : files){
            if(f.getName().endsWith(".js")){
                System.out.println("js文件名称是:" + f.getName());
            }
        }

        // 输出.xml文件
        for(File f : files){
            if(f.getName().endsWith(".xml")){
                System.out.println("xml文件名称是:" + f.getName());
            }
        }

        // 输出.jpg文件
        for(File f : files){
            if(f.getName().endsWith(".jpg")){
                System.out.println("jpg文件名称是:" + f.getName());
            }
        }
    }

    // 输出指定目录下面的文件夹
    @Test
    public void test02(){
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        for(String s : file.list(new MyFileFilter())){
            System.out.println(s);
        }
    }
}
