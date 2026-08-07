package com.krisswen.demo2;

/**
 * 字符串转换的方法
 */
public class StringDemo4 {
    static void main(String[] args) {
        String str1 = "hello";
        // toCharArray() 将字符串的内容转换成字符数组
        for (char c : str1.toCharArray()) {
            System.out.print(c + "\t");
        }
        System.out.println();
        // split() 对字符串内容进行切割
        String str2 = "a-b-c-d-e-f-g-h";
        String[] split = str2.split("-");
        for(String str : split){
            System.out.println(str);
        }
        // replace 将字符串中指定的内容替换成新的内容
        String str3 = "abc";
        String replace_str = str3.replace("bc", "mn");
        System.out.println("替换之后的新的字符串是:" + replace_str);

        // 转大写 toUpperCase() 转小写 toLowerCase()
        String str4 = "bcd";
        System.out.println(str4.toUpperCase());
        System.out.println("ABCDEFG".toLowerCase());

        // ValueOf方法 将指定的内容转换成字符串
        String str_num = String.valueOf(100);
        System.out.println(str_num);
        String str_bool = String.valueOf(true);
        String str_cha = String.valueOf('a');
        System.out.println(str_bool);
        System.out.println(str_cha);
    }
}
