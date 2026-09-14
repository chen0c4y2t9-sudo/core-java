package homework.Test2;

public class Test2 {
    static int num = 1;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (num <= 10) {
                    if (num % 2 == 1) {
                        System.out.println("线程1：" + num);
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
                while (num <= 10) {
                    if (num % 2 == 0) {
                        System.out.println("线程2：" + num);
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