package homework.Test3;

public class Test3 {
    static int count = 0;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (count < 10) {
                    System.out.print("A ");
                    count++;
                    lock.notify();
                    if (count < 10) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                while (count < 10) {
                    System.out.print("B ");
                    lock.notify();
                    if (count < 10) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}