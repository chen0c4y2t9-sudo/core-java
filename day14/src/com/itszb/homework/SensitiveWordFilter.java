package com.itszb.homework;

import java.io.*;


public class SensitiveWordFilter {

    public static void main(String[] args) {
        String srcPath = "src/com/itszb/homework/demo/sensitiveTest.txt";
        String destPath = "src/com/itszb/homework/demo/sensitiveResult.txt";

        filterSensitiveWord(srcPath, destPath);
        System.out.println("敏感词过滤完成，结果已输出到: " + destPath);
    }


    public static void filterSensitiveWord(String srcPath, String destPath) {

        try (
            BufferedReader reader = new BufferedReader(new FileReader(srcPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {

                String filtered = line.replace("垃圾", "**");
                writer.write(filtered);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
