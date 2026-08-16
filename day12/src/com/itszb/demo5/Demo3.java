package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Gatherers;

public class Demo3 {

    @Test
    public void test01(){
        List<String> list = List.of("A", "B", "C", "D");
        list.stream().collect(Collectors.groupingBy(s -> list.indexOf(s) / 2))
                .values().stream().map(group -> group.get(0) + group.get(1)).forEach(System.out::println);
    }

    @Test
    public void test02(){
        List<String> list = List.of("A", "B", "C", "D");
        list.stream().gather(Gatherers.windowFixed(2)).map(item -> item.getFirst() + item.getLast()).forEach(System.out::println);
    }

    @Test
    public void test03(){
        List<String> list = List.of("A", "B", "C", "D","A","C");
        list.stream().gather(Gatherers.fold(HashSet::new,(set,item)->{
            set.add(item);
            return set;
        })).flatMap(Collection::stream).forEach(System.out::println);
    }

    @Test
    public void test04(){
        List<String> list = List.of("A", "B", "C", "D");
        list.stream().gather(Gatherers.scan(()-> "0",(current,item)->current + item)).forEach(System.out::println);
    }
}
