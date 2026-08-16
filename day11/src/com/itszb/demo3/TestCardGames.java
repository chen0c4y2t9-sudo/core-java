package com.itszb.demo3;

import java.util.*;

/**
 * 斗地主的游戏
 */
public class TestCardGames {
    static void main() {
        // 定义一个集合，存放牌号和纸牌的映射关系
        Map<Integer,String> pckerMap = new HashMap<>();
        // 定义一个List集合，来存储牌号
        List<Integer> pokerList = new ArrayList<>();
        String[] colors = "♥️-♠️-♦️-♣️".split("-");
        String[] nums = "2-A-K-Q-J-10-9-8-7-6-5-4-3".split("-");
        int index = 2;
        for(String num : nums){
            for(String color : colors){
                String poker = color + num;
                // 存储牌
                pckerMap.put(index,poker);
                // 存储牌号
                pokerList.add(index);
                index ++;
            }
        }
        // 大小王存储在Map中
        pckerMap.put(0,"大王");
        pckerMap.put(1,"小王");
        // 将大小王的牌号存储在List中
        pokerList.add(0);
        pokerList.add(1);
        // System.out.println(pckerMap);
        // System.out.println(pokerList);

        // 洗牌
        Collections.shuffle(pokerList);
        // 发牌
        // 定义4个List集合，分别存放3个玩家的牌号，以及3张底牌的牌号
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        // 遍历牌号的集合，将牌号分发给不同的玩家
        for(int i = 0;i<pokerList.size();i++){
            Integer pokerNum = pokerList.get(i);
            if(i >= 51){
                dipai.add(pokerNum);
            }else{
                if(i % 3 == 0){
                    player1.add(pokerNum);
                }else if(i % 3 == 1){
                    player2.add(pokerNum);
                }else{
                    player3.add(pokerNum);
                }
            }
        }

        // 排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        // 摸牌，并展示出来
        show("张三",player1,pckerMap);
        show("李四",player2,pckerMap);
        show("王五",player3,pckerMap);
        show("底牌",dipai,pckerMap);
    }

    // 展示牌的方法
    public static void show(String name,ArrayList<Integer> pockerNums,Map<Integer,String> pokerMap){
        System.out.println(name + ":");
        for(Integer pokerNum : pockerNums){
            String pocker = pokerMap.get(pokerNum);
            System.out.print(pocker + "  ");
        }
        System.out.println();
    }
}
