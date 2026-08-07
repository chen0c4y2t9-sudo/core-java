package com.krisswen.demo2;
/*
 * 字符串的常见方法 -- 判断的方法
 */
public class StringDemo2 {
    static void main() {
        String msg1 = "hello,java";
        String msg2 = "hello,JAVA";
        String msg3 = "hello,java";
        // equals 没有忽略大小写进行比较
        System.out.println("两个字符串的内容相等吗?" + msg1.equals(msg2));
        // equalsIgnoreCase 忽略大小写敏感进行比较
        System.out.println("两个字符串的内容相等吗?" + msg2.equalsIgnoreCase(msg3));

        String str1 = new String("www.baidu.com");
        String str2 = new String("runob");
        // 比较两个字符串在某个区域的内容是否相等
        System.out.println("返回的结果是:" + str1.regionMatches(4,str2,0,5));

        String str3 = "hello,hadoop";
        System.out.println("判断字符串的内容是否以指定的内容开始:" + str3.startsWith("hello"));
        System.out.println("判断字符串的内容是否以指定的内容结尾:" + str3.endsWith("hadoop"));
        System.out.println("判断字符串是否包含指定的内容:" + str3.contains("hadoop"));
    }
}
