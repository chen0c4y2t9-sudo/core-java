package com.itszb.test1;

import java.util.HashSet;
import java.util.Set;

public class ScoreSetTest {
    static void main() {
        Set<Integer> scoreSet= new HashSet<>();
        // 添加成绩
        scoreSet.add(85);
        scoreSet.add(92);
        scoreSet.add(78);
        scoreSet.add(85);
        scoreSet.add(92);
        scoreSet.add(66);
        scoreSet.add(78);
        scoreSet.add(95);

        System.out.println("分数是:" + scoreSet);

        // 遍历统计
        int count = 0; // 成绩总数
        int sum = 0; // 成绩综合
        double avg = 0.0;

        for(int score : scoreSet){
            count ++;
            sum += score;
        }
        avg= (double) sum / count;
        System.out.println("去重之后的成绩总数:" + count);
        System.out.println("成绩总和:" + sum);
        System.out.println("平均分:" + avg);

    }
}
