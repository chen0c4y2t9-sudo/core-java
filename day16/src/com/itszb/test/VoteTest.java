package com.itszb.test;

public class VoteTest {
    static void main() throws Exception{
        // 定义10个线程同时投票
        for(int i = 0;i<10;i++){
            new Thread(()->{
                VoteManager manager = VoteManager.getInstance();
                // 随机投票给A/B/C
                int rand = (int)(Math.random() * 3);
                String candidate = rand == 0 ? "候选人A" : rand == 1 ? "候选人B" : "候选人C";
                manager.vote(candidate);
                System.out.println(Thread.currentThread().getName() + "--> 投给:" + candidate);
            }).start();
            Thread.sleep(1000);
            // 查看最终结果
            VoteManager manager = VoteManager.getInstance();
            manager.showResult();
        }
    }
}
