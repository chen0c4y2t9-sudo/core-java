package homework.test2;


public class ThreadLocalTest {

    public static void main(String[] args) throws InterruptedException {
        // 全局共用同一个工具类对象，但数据各自隔离
        ThreadLocalData data = new ThreadLocalData();

        // 开启 5 个线程
        for (int i = 1; i <= 5; i++) {
            final int no = i;
            new Thread(() -> {
                String threadName = Thread.currentThread().getName();
                // 每个线程存入自己的线程名数据
                data.setData("线程" + no + "的私有数据");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(threadName + " 读到的数据 = " + data.getData());

                data.remove();
            }, "线程" + no).start();
        }

        // 等待所有子线程执行完成
        Thread.sleep(100);
        System.out.println("主线程: 5 个线程均已执行完毕，数据隔离验证完成");
    }
}
