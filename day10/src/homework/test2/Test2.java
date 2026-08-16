package homework.test2;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Integer> scores = new HashSet<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(85);
        scores.add(92);
        scores.add(66);
        scores.add(78);
        scores.add(95);

        System.out.println("去重后：" + scores);

        int count = 0;
        int sum = 0;
        for (Integer s : scores) {
            count++;
            sum = sum + s;
        }

        System.out.println("总数：" + count);
        System.out.println("总和：" + sum);

        System.out.println("平均分：" + sum / count);
    }
}