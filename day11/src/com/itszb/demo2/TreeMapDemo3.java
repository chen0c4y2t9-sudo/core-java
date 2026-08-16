package com.itszb.demo2;

import java.util.TreeMap;

public class TreeMapDemo3 {
    static void main() {
        /*TreeMap<Employee,String> map1 = new TreeMap<>(new TreeMapComparator());
        map1.put(new Employee(1001,"eric",2000),"1001");
        map1.put(new Employee(1002,"james",4000),"1001");
        map1.put(new Employee(1003,"lily",3500),"1001");
        map1.put(new Employee(1004,"miller",1500),"1001");
        System.out.println(map1);*/

        TreeMap<Employee,String> map1 = new TreeMap<>();
        map1.put(new Employee(1001,"eric",2000),"1001");
        map1.put(new Employee(1002,"james",4000),"1001");
        map1.put(new Employee(1003,"lily",3500),"1001");
        map1.put(new Employee(1004,"miller",1500),"1001");
        System.out.println(map1);
    }
}
