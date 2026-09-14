package com.itszb.demo4;

public class TestProducerConsumer {
    static void main() {
        Product product = new Product();
        ProducerThread producer = new ProducerThread(product);
        ConsumerThread consumer = new ConsumerThread(product);
        // 启动线程
        producer.start();
        consumer.start();
    }
}
