package homework.Test1;

public class Test1 {
    static int num = 1;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (num <= 100) {
                    if (num % 2 == 1) {
                        System.out.println("奇数线程：" + num);
                        num++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                lock.notify();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                while (num <= 100) {
                    if (num % 2 == 0) {
                        System.out.println("偶数线程：" + num);
                        num++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                lock.notify();
            }
        });

        t1.start();
        t2.start();
    }
}