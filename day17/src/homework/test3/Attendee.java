package homework.test3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Attendee implements Runnable {

    private final Semaphore semaphore;
    private final CountDownLatch latch;
    private final String name;

    public Attendee(Semaphore semaphore, CountDownLatch latch, String name) {
        this.semaphore = semaphore;
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(name + " 开始签到……");
            Thread.sleep(500);
            System.out.println(name + " 签到完成");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
            latch.countDown();
        }
    }
}
