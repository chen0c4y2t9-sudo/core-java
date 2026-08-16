package com.itszb.demo3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceDemo5 {

    @Test
    public void test01(){
        // 给字符串数组进行排序输出
        String[] strs = {"hello","basketball","football","swimming","flying","Fight","zoom","Zero","City","country","LebronJames"};
        //Arrays.sort(strs);

       /* Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/

        // Arrays.sort(strs,(o1,o2) ->o1.compareToIgnoreCase(o2));

        Arrays.sort(strs,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strs));
    }

    // 需求：比较两个字符串的内容是否一致，忽略大小写比较
    @Test
    public void test02(){
        StringDao stringDao = new StringDao() {
            @Override
            public boolean compareString(String str1, String str2) {
                return str1.equalsIgnoreCase(str2);
            }
        };

        boolean flag = stringDao.compareString("hello", "HeLlo");
        System.out.println(flag);
    }

    @Test
    public void test03(){
        StringDao stringDao = (s1,s2)->s1.equalsIgnoreCase(s2);
        boolean flag = stringDao.compareString("hello", "HeLlo");
        System.out.println(flag);
    }

    @Test
    public void test04(){
        StringDao stringDao = String::equalsIgnoreCase;
        boolean flag = stringDao.compareString("hello", "HeLlo");
        System.out.println(flag);
    }
}
