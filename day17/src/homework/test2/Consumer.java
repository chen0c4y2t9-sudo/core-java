package homework.test2;

public class Consumer implements Runnable {

    private final Bakery bakery;
    private final String who;
    private final int times;

    public Consumer(Bakery bakery, String who, int times) {
        this.bakery = bakery;
        this.who = who;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            bakery.consume(who);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(who + " 买了 " + times + " 次，走了");
    }
}
