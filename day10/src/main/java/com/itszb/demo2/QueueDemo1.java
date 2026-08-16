package com.itszb.demo2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue队列的接口，支持对队列进行相关的操作
 *  Dequeue 双端队列的接口，能够支持双端队列的的操作
 */
public class QueueDemo1 {
    static void main() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("AAA");
        queue.offer("BBB");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
