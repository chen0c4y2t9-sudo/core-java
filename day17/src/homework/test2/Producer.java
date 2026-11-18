package homework.test2;

public class Producer implements Runnable {

    private final Bakery bakery;
    private final String who;
    private final int times;

    public Producer(Bakery bakery, String who, int times) {
        this.bakery = bakery;
        this.who = who;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            bakery.produce(who);
        }
        System.out.println(who + " 做了 " + times + " 次，收工");
    }
}
