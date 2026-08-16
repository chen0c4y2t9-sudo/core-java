package com.itszb.demo1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    static void main() {
        Map<String,String> map = new Hashtable<>();
        // put方法：新增元素的方法
        map.put("1001","eric");
        map.put("1002","james");
        map.put("1003","miller");
        map.put("1004","kobe");
        //map.put(null,"kobe"); 在HashTable中是不能使用null来作为key的

        Map<String,String> map1 = new Hashtable<>();
        map1.put("1005","zhangsan");
        map1.put("1006","lisi");
        // 在一个集合中添加另一个完整的集合
        map.putAll(map1);

        // remove 根据key删除键值对，并将对应的value值返回。
        String remove = map.remove("1006");
        System.out.println(remove);

        // map.clear(); 清空集合中的所有元素

        int size = map.size();
        System.out.println("集合中元素的个数是:" + size);

        String value = map.get("1005");
        System.out.println("元素的value值是:" + value);
        System.out.println(map);

        // 获取Map集合中元素的key的集合
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println(key);
        }

        System.out.println("-----------获取Map集合中所有数据方式1-----------");
        Set<String> keySet1 = map.keySet();
        for(String key : keySet1){
            System.out.println(key + "     " + map.get(key));
        }

        System.out.println("-----------获取Map集合中所有数据方式2-----------");
        Set<String> keySet2 = map.keySet();
        Iterator<String> iterator = keySet2.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "     " + map.get(key));
        }

        System.out.println("-----------获取Map集合中所有数据方式3-----------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key + "     " + val);
        }

        // 判断是否包含某个键
        System.out.println("map集合中是否包含指定的键:" +  map.containsKey("1004"));
        // 判断是否包含指定的值
        System.out.println("map集合中是否包含指定的值:" + map.containsValue("eric"));
        System.out.println("两个集合中的内容是一样的吗?" + map.equals(map1));
    }
}
