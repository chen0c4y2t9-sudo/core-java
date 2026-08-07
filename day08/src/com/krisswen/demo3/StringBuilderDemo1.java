package com.krisswen.demo3;

public class StringBuilderDemo1 {
    static void main() {
        // 将String类型的字符串对象转换成了StrinBuilder对象
        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder);
        System.out.println(builder.length());

        /**
         * 字符串的追加方法 append()
         */
        StringBuilder builder1 = builder.append("java");
        System.out.println(builder == builder1);// 说明了修改字符串的内容是基于本身进行修改的
        StringBuilder builder2 = builder1.append("css");
        System.out.println(builder1 == builder2);
        System.out.println(builder2);

        /**
         * 删除方法 delete  deleteCharAt
         */
        StringBuilder builder3 = new StringBuilder("hello,java");
        // 删除指定区间的字符串内容，返回一个新的字符串
        builder3 = builder3.delete(5, 10);// [5,10)
        System.out.println(builder3);

        StringBuilder builder4 = new StringBuilder("hello,java");
        // 删除指定位置上的字符，返回一个新的字符串
        builder4 = builder4.deleteCharAt(5);
        System.out.println(builder4);

        /**
         * 替换的方法 replace
         */
        StringBuilder builder5 = new StringBuilder("hello,java");
        builder5 = builder5.replace(6,10,"hadoop");
        System.out.println(builder5);

        /**
         * insert方法，在指定索引位置上插入新的字符串内容
         */
        StringBuilder builder6 = new StringBuilder("hello,java");
        //builder6 = builder6.insert(6,"flink");
        char[] chars = {'s','p','a','r','k',','};
        builder6 = builder6.insert(6,chars);
        System.out.println(builder6);

        /**
         *  字符串翻转的方法 reverse()
         */
        StringBuilder builder7 = new StringBuilder("hello,java");
        builder7 = builder7.reverse();
        System.out.println(builder7);
        /**
         * toString方法 将一个StringBuilder对象转换成String对象
         */
        StringBuilder builder8 = new StringBuilder("hello,java");
        System.out.println(builder8.toString());
    }
}
