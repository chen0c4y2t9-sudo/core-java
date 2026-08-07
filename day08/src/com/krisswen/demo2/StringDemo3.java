package com.krisswen.demo2;

/**
 * 字符串获取的方法
 */
public class StringDemo3 {
    static void main(String[] args) {
        // length() 获取字符串的长度
        String message = "hello,java";
        System.out.println("字符串的长度是:" + message.length());

        // 获取当前位置的指定字符内容
        char c = message.charAt(2);
        System.out.println("当前位置的字符是:" + c);

        // concat 进行字符串的内容拼接，类似于使用+和字符串进行拼接的方法
        String str1 = "spring";
        String str2 = "Cloud";
        //String concat = str1.concat(str2);
        String concat = str1 + str2;
        System.out.println(concat);

        // indexOf 返回指定字符第一次出现的下标，如果不存在，就返回-1
        // lastIndexOf
        String str3 = "hello,springcloud";
        System.out.println("当前字符所在的下标是:" + str3.indexOf("l"));
        System.out.println("当前字符所在的最后一个下标是:" + str3.lastIndexOf("l"));

        // subString 截取字符串
        String newStr = str3.substring(6);
        System.out.println("截取之后的字符串是:" + newStr);
        // 截取指定区间的内容，这个区间是前闭后开，[6,9)
        String newStr1 = str3.substring(6, 9);
        System.out.println("截取指定区间的内容是:" + newStr1);
        // 根据字符串内容，获取字节数组
        String str4 = "abc";
        for (byte aByte : str4.getBytes()) {
            System.out.print(aByte + "\t");
        }
        System.out.println();
        String str5 = "  hello  ";
        System.out.println(str5);
        // trim() 去除一个字符串的前后空格
        System.out.println(str5.trim());
    }
}
