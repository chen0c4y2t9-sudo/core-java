package com.krisswen.test1;

public class WrapperTest {
    static void main() {
        // Integer 120的比较
        Integer a = 120;
        Integer b = 120;
        System.out.println("120 == 120 :" + (a == b));
        System.out.println("120 equals 120:" + a.equals(b));
        System.out.println("---------------------------");
        // Integer 150的比较
        Integer c = 150;
        Integer d = 150;
        System.out.println("150 ==  150" + (c == d));
        System.out.println("150 equals 150:" + c.equals(d));
        System.out.println("---------------------------");

        // 字符串转int，再自动装箱
        int num = Integer.parseInt("2025");
        Integer numObj = num;
        System.out.println("字符串转保证类的结果是:" + numObj);
        System.out.println("---------------------------");

        // double与字符串、保证类互相转换
        double dNum = 99.99;
        String str = String.valueOf(dNum);
        Double dObj = Double.valueOf(str);
        System.out.println("转换后的Double包装类:" + dObj);
        System.out.println("---------------------------");

        // Character 判断
        System.out.println("'5'是数字吗?" + Character.isDigit('5'));
        System.out.println("'z'是小写字母吗?" + Character.isLowerCase('z'));

    }
}
