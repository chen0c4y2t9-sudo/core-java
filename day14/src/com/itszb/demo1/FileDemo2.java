package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 演示File中的常见方法
 */
public class FileDemo2 {

    /**
     * 创建和删除文件的方法
     * boolean createNewFile  创建文件的方法
     */
    @Test
    public void test01() throws Exception{
        //File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\Hello.java");
        /**
         * 如果指定的文件夹下面存在对应的文件，此时文件不会重复创建，createNewFile方法的返回值则为false
         * 如果指定的文件下面不存在对应的文件，此时文件会被创建出来，createNewFile方法的返回值则为true
         */
        //boolean result = file.createNewFile();
        //System.out.println("文件创建了嘛??" + result);

        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\User.java");
        if (!file.exists()){ // 如果对应的文件不存在
            boolean result = file.createNewFile();// 创建一个文件
            System.out.println("文件创建成功,结果是:" + result);
        }else {
            System.out.println("文件已经存在，创建失败");
        }
    }

    @Test
    public void test02() throws Exception{
        /*File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\abc");
        if(!file.exists()){
            boolean flag = file.mkdir(); // 常见单级文件夹
            System.out.println("文件夹创建的结果是:" + flag);
        }else{
            System.out.println("文件已经存在,创建失败");
        }*/

        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\aa\\bb\\cc\\dd");
        if(!file.exists()){
            boolean flag = file.mkdirs(); // 创建多级文件夹
            System.out.println("文件夹创建的结果是:" + flag);
        }else {
            System.out.println("文件夹已经存在，创建失败");
        }
    }

    @Test
    public void test03(){
        /*File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\User.java");
        // 对文件的名称进行重命名
        boolean b = file.renameTo(new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\Person.java"));
        System.out.println("重命名的结果是:" + b);*/

        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\Person.java");
        /**
         * 如果重命名前后的文件的路径不一样，则是对文件进行剪切并重命名
         */
        boolean flag = file.renameTo(new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\Student.java"));
        System.out.println("结果是:" + flag);
    }

    @Test
    public void test04(){
        /*File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\Student.java");
        if(file.exists()){
            // 对文件进行删除操作
            boolean delete = file.delete();
            System.out.println("删除的结果是:" + delete);
        }else{
            System.out.println("文件不存在，删除失败");
        }*/

        /**
         * delete() 删除文件夹
         *   如果我们的文件夹是一个空文件夹，使用delete方法可以删除成功；
         *   如果我们的文件夹是一个非空文件夹(多级目录或者文件夹里面存在文件)，则删除失败。
         */
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\aa");
        boolean delete = file.delete();
        System.out.println("文件夹删除的结果是:" +delete);
    }

    /**
     * 判断的方法
     * @throws Exception
     */
    @Test
    public void test05() throws Exception{
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\Hello.java");
        boolean exists = file.exists();
        System.out.println("文件存在吗???" + exists);
        boolean result1 = file.isFile();
        System.out.println("当前是一个文件吗???" + result1);

        File file1 = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        boolean directory = file1.isDirectory();
        System.out.println("是一个文件夹吗???" + directory);

        boolean hidden = file.isHidden();
        System.out.println("当前文件是否是一个隐藏文件?" + hidden);
        System.out.println("是否是一个只读文件???" + file.canRead());
        System.out.println("是否是一个可写文件???" + file.canWrite());
        System.out.println("是否可执行???" + file.canExecute());

        boolean absolute = file.isAbsolute();
        System.out.println("当前文件路径是绝对路径???" + absolute);
    }

    @Test
    public void test06(){
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\Hello.java");
        // 获取当前路径下面的文件名称
        String name = file.getName();
        System.out.println(name);
        // 哪怕这个文件的路径不存在，也会获得到这个文件的名称
        File file1 = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1\\Student.java");
        String name1 = file1.getName();
        System.out.println(name1);

        File file2 = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        System.out.println(file2.getName());

        long modified = file.lastModified();
        Date date = new Date(modified);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        System.out.println("获取文件最后的修改时间" + sdf.format(date));

        // 获取当前文件的父级路径
        String parent = file.getParent();
        System.out.println(parent);

        // 获取当前文件的父级路径的File对象
        File parentFile = file.getParentFile();
        System.out.println(parentFile.getName());

        // 获取一个文件的绝对路径
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        // 获取文件长度
        System.out.println(file.length());
    }


    @Test
    public void test07(){
        // 获取本机的磁盘盘符列表
        File[] files = File.listRoots();
        for(File file : files){
            System.out.println(file);
        }
    }

    @Test
    public void test08(){
        File file = new File("F:\\资料\\JAVASE\\day14 -- IO流\\file\\demo1");
        // 获取指定目录下面的文件内容
        String[] list = file.list();
        for(String fileName : list){
            System.out.println(fileName);
        }
        System.out.println("-----------------");
        // 获取当前目录下面的所有文件(文件(夹))对象
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f.getName());
        }
    }

}
