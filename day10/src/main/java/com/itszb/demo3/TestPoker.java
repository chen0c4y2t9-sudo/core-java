package com.itszb.demo3;

import java.util.ArrayList;
import java.util.Collections;

public class TestPoker {
    static void main() {
        // 创建一个集合保存牌信息
        ArrayList<String> pokerBox = new ArrayList<>();
        // 创建一个集合保存花色
        ArrayList<String> colors = new ArrayList<>();
        // 创建一个集合保存牌面字母+花色
        ArrayList<String> numbers = new ArrayList<>();
        // 将花色保存在集合中
        colors.add("♥️");
        colors.add("♦️");
        colors.add("♠️");
        colors.add("♣️");

        // 将牌面的数字和字母添加到集合中
        for(int i = 2;i<=10;i++){
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        // 根据花色和牌面数字+字母组成牌信息
        for(String color : colors){
            for(String number : numbers){
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("小💀");
        pokerBox.add("大💀");
        // System.out.println(pokerBox.size());
        // System.out.println(pokerBox);

        // 进行洗牌操作
        Collections.shuffle(pokerBox);
        // System.out.println(pokerBox);

        // 创建3个集合分别保存玩家的牌信息
        ArrayList<String> player_1 = new ArrayList<>();
        ArrayList<String> player_2 = new ArrayList<>();
        ArrayList<String> player_3 = new ArrayList<>();
        // 创建一个集合保存底牌信息
        ArrayList<String> dipai = new ArrayList<>();
        // 发牌的操作
        for(int i = 0;i<pokerBox.size();i++){
            String card = pokerBox.get(i);
            if(i >=51){
                dipai.add(card);
            }else{
                if(i % 3 == 0){
                    player_1.add(card);
                }else if(i % 3 == 1){
                    player_2.add(card);
                }else{
                    player_3.add(card);
                }
            }
        }
        // 查看各个玩家的牌信息和底牌信息
        System.out.println(player_1);
        System.out.println(player_2);
        System.out.println(player_3);
        System.out.println(dipai);
    }
}
