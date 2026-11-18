package homework.test2;

public class BakeryDemo {

    public static void main(String[] args) throws InterruptedException {

        Bakery bakery = new Bakery();

        Thread p1 = new Thread(new Producer(bakery, "师傅甲", 5), "生产者1");
        Thread p2 = new Thread(new Producer(bakery, "师傅乙", 5), "生产者2");
        Thread c1 = new Thread(new Consumer(bakery, "顾客A", 5), "消费者1");
        Thread c2 = new Thread(new Consumer(bakery, "顾客B", 5), "消费者2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();

        p1.join();
        p2.join();
        c1.join();
        c2.join();

        System.out.println("----- 生产消费结束，柜台还剩 " + bakery.getCount() + " 个面包 -----");
    }
}
