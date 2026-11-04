package homework.test3;


public class VoteTest {

    public static void main(String[] args) throws InterruptedException {
        final int VOTER_COUNT = 10;

        // 10 个线程同时投票
        for (int i = 0; i < VOTER_COUNT; i++) {
            new Thread(() -> {
                VoteManager manager = VoteManager.getInstance();

                int rand = (int) (Math.random() * 3);
                String candidate = rand == 0 ? "候选人A"
                        : rand == 1 ? "候选人B" : "候选人C";

                manager.vote(candidate);
                System.out.println(Thread.currentThread().getName() + " --> 投给:" + candidate);
            }, "投票线程" + (i + 1)).start();
        }

        Thread.sleep(200);

        VoteManager m1 = VoteManager.getInstance();
        VoteManager m2 = VoteManager.getInstance();
        System.out.println("实例唯一性验证:m1 == m2 ? " + (m1 == m2));

        // 查看最终投票结果
        m1.showResult();

        int total = m1.getVoteCount("候选人A")
                + m1.getVoteCount("候选人B")
                + m1.getVoteCount("候选人C");
        System.out.println("总票数 = " + total + "(应为 " + VOTER_COUNT + ")");
    }
}
