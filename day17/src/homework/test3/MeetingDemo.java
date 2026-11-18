package homework.test3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class MeetingDemo {

    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore = new Semaphore(3);
        CountDownLatch latch = new CountDownLatch(10);

        for (int i = 1; i <= 10; i++) {
            new Thread(new Attendee(semaphore, latch, "参会者" + i)).start();
        }

        System.out.println("主持人：大家先签到，人齐了就开始");
        latch.await();

        System.out.println("主持人：10 位都签到了，会议现在开始！");
    }
}
