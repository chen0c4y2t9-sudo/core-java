package com.itszb.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GoodsStockManager {
    static void main() {
        // 创建HashMap集合存储商品的库存信息
        Map<String,Integer> stockMap = new HashMap<>();
        // 添加商品信息
        stockMap.put("手机",50);
        stockMap.put("电脑",30);
        stockMap.put("平板",20);
        // 添加一个已经存在的商品，覆盖原有数据
        stockMap.put("手机",60);

        // 查询电脑的库存信息
        System.out.println(stockMap.get("电脑"));
        // 删除平板并打印库存值
        System.out.println("删除的平板的库存值是:" + stockMap.remove("平板"));
        // 遍历所有的商品信息
        Set<Map.Entry<String, Integer>> entrySet = stockMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            System.out.println("商品:" + entry.getKey() + ",库存:" + entry.getValue());
        }
        System.out.println(stockMap);
    }
}
