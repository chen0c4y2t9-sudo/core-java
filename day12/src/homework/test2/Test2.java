package homework.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Goods> list = new ArrayList<>();
        list.add(new Goods("冰箱", 2999.99, "家电"));
        list.add(new Goods("面包", 8.9, "食品"));
        list.add(new Goods("卫衣", 129.9, "服饰"));
        list.add(new Goods("洗衣机", 1999.99, "家电"));
        list.add(new Goods("饼干", 5.5, "食品"));
        list.add(new Goods("运动鞋", 399.9, "服饰"));
        list.add(new Goods("空调", 3599.99, "家电"));
        list.add(new Goods("巧克力", 25.8, "食品"));

        List<String> result = list.stream()
                .filter(g -> "家电".equals(g.getType()) && g.getPrice() > 2000)
                .sorted((g1, g2) -> g1.getPrice().compareTo(g2.getPrice()))
                .map(g -> g.getName() + "：" + g.getPrice() + "元")
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
