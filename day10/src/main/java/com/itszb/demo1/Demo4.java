package com.itszb.demo1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo4 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("eric");
        deque.add("james");
        deque.add("kobe");
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
