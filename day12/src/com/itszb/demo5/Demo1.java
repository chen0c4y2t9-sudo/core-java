package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

    @Test
    public void test01(){
        String[] strings = new String[]{"aaa","bbb","ccc"};
        List<String> list = Arrays.asList(strings);
        list.stream();

        Stream.of(strings).forEach(System.out::println);

        List<String> names = Arrays.asList("Alice",null,"Bob",null,"Charlie");
        //  ofNullable 将每个null元素转换成空流
        List<String> list1 = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
        System.out.println(list1); // [Alice, Bob, Charlie]
        List<String> list2 = names.stream().collect(Collectors.toList());
        System.out.println(list2); // [Alice, null, Bob, null, Charlie]
    }

    @Test
    public void test02(){
        List<String> list = Arrays.asList("AA","AAA","AAAA","AA");
        // takeWhile 不断获取满足条件的元素为止
        list.stream().takeWhile(s-> s.length() <=3).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(2,4,6,7,8,10);
        // 丢弃连续的偶数，直到遇到第一个奇数，然后保留这个奇数以及之后的所有元素
        List<Integer> list1 = numbers.stream().dropWhile(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

        String str = "hello,java";
        str.chars().filter(c -> c == 'l').forEach(System.out::println);

        Path path = Paths.get("F:\\资料\\JAVASE\\day12--方法引用 Stream流 Optional类\\课件\\Hello.txt");
        try (Stream<String> lines = Files.lines(path)){
            lines.forEach(System.out::println);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    @Test
    public void test03(){
        String[] strings = new String[]{"AAA","AAA","AA"};
        List<String> list = Stream.of(strings).filter(s -> s.length() > 2).toList();
        System.out.println(list);
    }
}
