package com.itszb.homework;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class CharCount {

    public static void main(String[] args) {
        String filePath = "src/com/itszb/homework/demo/charCountTest.txt";
        int count = countChar(filePath, 'a');
        System.out.println("字母 a (不区分大小写) 出现的次数为: " + count);
    }


    public static int countChar(String filePath, char target) {
        int count = 0;

        try (Reader reader = new FileReader(filePath)) {
            int ch;

            while ((ch = reader.read()) != -1) {

                if (Character.toLowerCase((char) ch) == Character.toLowerCase(target)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
