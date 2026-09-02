package com.itszb.homework;

import java.io.File;


public class DeleteLogFiles {

    public static void main(String[] args) {
        String dirPath = "src/com/itszb/homework/demo/logTest";
        File dir = new File(dirPath);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("指定的目录不存在或不是一个文件夹: " + dirPath);
            return;
        }

        System.out.println("开始删除 " + dirPath + " 下的 .log 文件...");
        int deletedCount = deleteLogFiles(dir);
        System.out.println("删除完毕！共删除 " + deletedCount + " 个 .log 文件。");
    }


    public static int deleteLogFiles(File dir) {
        int count = 0;

        File[] files = dir.listFiles();
        if (files == null) {
            return 0;
        }

        for (File file : files) {
            if (file.isDirectory()) {

                count += deleteLogFiles(file);
            } else if (file.getName().toLowerCase().endsWith(".log")) {

                boolean deleted = file.delete();
                if (deleted) {
                    System.out.println("已删除文件: " + file.getAbsolutePath());
                    count++;
                } else {
                    System.out.println("删除失败: " + file.getAbsolutePath());
                }
            }
        }
        return count;
    }
}
