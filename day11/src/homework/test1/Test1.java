package homework.test1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("手机", 50);
        stock.put("电脑", 30);
        stock.put("平板", 20);


        Integer oldValue = stock.put("手机", 60);
        System.out.println("手机库存从" + oldValue + "变为60");


        System.out.println("电脑库存：" + stock.get("电脑"));


        Integer removed = stock.remove("平板");
        System.out.println("删除平板，被删的值：" + removed);
        System.out.println("删除后平板库存：" + stock.get("平板"));


        System.out.println("所有商品：");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }


        System.out.println("包含耳机吗？" + stock.containsKey("耳机"));
    }
}