package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileDemoTest {

    // 需求: 根据指定的目录，获取当前目录下面的java文件
    @Test
    public void test01(){
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        String[] list = file.list();
        for(String fileName : list){
            if(fileName.endsWith(".java")){
                System.out.println(fileName);
            }
        }
    }

    // 基于文件名称过滤器（FilenameFilter）来实现
    @Test
    public void test02(){
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        String[] list = file.list(new FileFilter());
        for(String fileName : list){
            if(fileName.endsWith(".java")){
                System.out.println(fileName);
            }
        }
    }


    // 基于文件过滤器(FileFilter)实现
    @Test
    public void test03(){
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        File[] files = file.listFiles(new CustomizeFileFilter());
        for(File f : files){
            System.out.println(f.getName());
        }
    }
}
