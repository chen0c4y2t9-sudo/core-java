package com.itszb.demo6;

public class ArrayListTest {
    static void main() {
        MyArrayList<String> mylist = new MyArrayList<>();
        mylist.add("eric");
        mylist.add("james");
        mylist.add("kobe");
        mylist.add("lucy");
        String string = mylist.get(2);
        System.out.println(string);
    }
}
