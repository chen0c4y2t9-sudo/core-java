package com.itszb.demo1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    static void main() {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student(1001,"eric"),"100");
        map.put(new Student(1002,"james"),"101");
        map.put(new Student(1003,"miller"),"102");
        map.put(new Student(1001,"eric"),"103");
        map.put(new Student(1004,"oscar"),"104");
        map.put(new Student(1002,"james"),"105");
        System.out.println(map);
    }
}
