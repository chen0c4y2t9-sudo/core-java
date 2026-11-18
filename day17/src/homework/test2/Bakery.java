package homework.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Bakery {

    public static final int CAPACITY = 5;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    private int count = 0;
    private int total = 0;

    public void produce(String who) {
        lock.lock();
        try {
            while (count == CAPACITY) {
                System.out.println(who + " 看柜台满了，等着");
                notFull.await();
            }
            count++;
            total++;
            System.out.println(who + " 做好第 " + total + " 个面包，柜台有 " + count + " 个");
            notEmpty.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void consume(String who) {
        lock.lock();
        try {
            while (count == 0) {
                System.out.println(who + " 看柜台空了，等着");
                notEmpty.await();
            }
            count--;
            System.out.println(who + " 买走 1 个面包，柜台还剩 " + count + " 个");
            notFull.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }
}
