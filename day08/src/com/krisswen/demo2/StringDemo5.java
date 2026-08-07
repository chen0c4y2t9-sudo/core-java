package com.krisswen.demo2;

public class StringDemo5 {
    static void main() {
        String str = "  helloworld   ";
        //System.out.println(str.strip());
        System.out.println(str.stripLeading());// 去除字符串前面的空格
        System.out.println(str.stripTrailing());// 去除字符串后面的空格

        String str1 = "  ";
        System.out.println(str1.isBlank());// 判断字符串的内容为空

        String str2 = "ABC";
        System.out.println(str2.repeat(5));// 将字符串的内容重复指定的次数，得到一个新的字符串

        String string  = """
                "hello,java"
                """;
        System.out.println(string);
    }
}
