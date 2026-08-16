package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Demo2 {

    // 处理无效的字符串列表
    @Test
    public void test01(){
        List<String> strings = List.of("1"," ","2","3"," ","abc");
        List<Integer> list = strings.stream().<Integer>mapMulti((str, consumer) -> {
            try {
                consumer.accept(Integer.parseInt(str.trim()));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
            }
        }).toList();
        System.out.println(list);
    }

    // 将字符串拆分成字符
    @Test
    public void test02(){
        List<String> words = List.of("java","stream");
        // 通过mapMulti方法将字符串拆分成字符
        List<Character> list = words.stream().<Character>mapMulti((word, consumer) -> {
            for (char c : word.toCharArray()) {
                consumer.accept(c);
            }
        }).toList();
        System.out.println(list);
    }

    @Test
    public void test03(){
        List<String> words = List.of("x:yz:abc","m:n");
        // 使用mapMulti将字符串拆分成字符
        List<String> list = words.stream().<String>mapMulti((str, consumer) -> {
            for (String part : str.split(":")) {
                if (part.length() > 1) {
                    consumer.accept(part);
                }
            }
        }).toList();
        System.out.println(list);
    }
}
