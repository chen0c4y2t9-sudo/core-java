package com.itszb.demo2;

import java.util.*;

public class QueueDemo2 {
    static void main(String[] args) {
//        Deque<String> deque = new LinkedList<>();
//        deque.push("AAA");
//        deque.push("BBB");
//        System.out.println(deque.pop());
//        System.out.println(deque.pop());

//        deque.addLast("AAA");
//        deque.addLast("BBB");
//        Iterator<String> iterator = deque.descendingIterator();
//        System.out.println(iterator.next());
//
//        Iterator<String> iterator1 = deque.iterator();
//        System.out.println(iterator1.next());

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
