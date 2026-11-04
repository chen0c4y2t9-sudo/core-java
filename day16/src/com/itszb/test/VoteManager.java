package com.itszb.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局唯一的投票管理器 -- 基于双重检查锁单例设计模式实现
 */
public class VoteManager {

    private static volatile VoteManager instance;

    // 存储候选人票数
    private  Map<String,Integer> voteMap;

    public VoteManager(){
        voteMap = new HashMap<>();
        // 初始化候选人信息
        voteMap.put("候选人A",0);
        voteMap.put("候选人B",0);
        voteMap.put("候选人C",0);
    }

    // 基于双重检查锁创建单例对象
    public static VoteManager getInstance(){
        if(instance == null){
            synchronized (VoteManager.class){
                if(instance == null){
                    instance = new VoteManager();
                }
            }
        }
        return instance;
    }

    // 投票的方法
    public synchronized void vote(String candidate){
        if(voteMap.containsKey(candidate)){
            voteMap.put(candidate,voteMap.get(candidate)+1);
        }else {
            System.out.println("候选人不存在:" + candidate);
        }
    }

    // 获取指定候选人票数的方法
    public int getVoteCount(String candidate){
        return voteMap.getOrDefault(candidate,0);
    }

    // 展示投票结果
    public void showResult(){
        System.out.println("----展示投票结果----");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + "票");
        }
    }
}
