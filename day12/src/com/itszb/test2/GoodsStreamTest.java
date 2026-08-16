package com.itszb.test2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GoodsStreamTest {

    @Test
    public void test01(){
        // 初始化商品列表
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("冰箱", 2999.99, "家电"));
        goodsList.add(new Goods("面包", 8.9, "食品"));
        goodsList.add(new Goods("卫衣", 129.9, "服饰"));
        goodsList.add(new Goods("洗衣机", 1999.99, "家电"));
        goodsList.add(new Goods("饼干", 5.5, "食品"));
        goodsList.add(new Goods("运动鞋", 399.9, "服饰"));
        goodsList.add(new Goods("空调", 3599.99, "家电"));
        goodsList.add(new Goods("巧克力", 25.8, "食品"));

        // 使用Stream流进行处理
        List<String> stringList = goodsList.stream().filter(g -> g.getType().equals("家电") && g.getPrice() > 2000)
                .sorted((g1, g2) -> g1.getPrice().compareTo(g2.getPrice()))
                .map(g -> g.getName() + ":" + g.getPrice() + "元").toList();
        stringList.forEach(System.out::println);
    }
}
