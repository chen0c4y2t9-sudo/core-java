package homework.test3;

import java.util.HashMap;
import java.util.Map;


public class VoteManager {

    private static volatile VoteManager instance;

    // 存储候选人及其票数
    private final Map<String, Integer> voteMap;

    private VoteManager() {
        voteMap = new HashMap<>();
        // 初始化候选人信息
        voteMap.put("候选人A", 0);
        voteMap.put("候选人B", 0);
        voteMap.put("候选人C", 0);
    }

    public static VoteManager getInstance() {
        if (instance == null) {
            synchronized (VoteManager.class) {
                if (instance == null) {
                    instance = new VoteManager();
                }
            }
        }
        return instance;
    }

    public synchronized void vote(String candidate) {
        if (voteMap.containsKey(candidate)) {
            voteMap.put(candidate, voteMap.get(candidate) + 1);
        } else {
            System.out.println("候选人不存在:" + candidate);
        }
    }

    public int getVoteCount(String candidate) {
        return voteMap.getOrDefault(candidate, 0);
    }

    public void showResult() {
        System.out.println("---- 展示投票结果 ----");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + "票");
        }
    }
}
