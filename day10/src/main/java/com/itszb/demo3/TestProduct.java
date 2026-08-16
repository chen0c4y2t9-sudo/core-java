package com.itszb.demo3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
    static List<Product> list = new ArrayList<>();

    // 通过静态代码快初始化商品信息
    static {
        list.add(new Product("1001","Iphone15ProMax","苹果",10999.0));
        list.add(new Product("1002","华为Note50","华为",8999.0));
        list.add(new Product("1003","三星手机","三星",5999.0));
        list.add(new Product("1004","小米14","小米",6888.0));
        list.add(new Product("1005","惠普笔记本电脑","惠普",8888.0));
        list.add(new Product("1006","苹果Mac","苹果",12999.0));
        list.add(new Product("1007","西门子电冰箱","西门子",15999.0));
        list.add(new Product("1008","格力空调","格力",3999.0));
        list.add(new Product("1009","三菱空调","三菱",4678.0));
        list.add(new Product("1010","奇瑞电动车","奇瑞",450.0));
    }

    // 定义一个方法，展示商品信息
    public static void showProductInfo(List<Product> productList){
        for(Product p : productList){
            System.out.println(p);
        }
    }

    // 定义一个方法，根据商品id返回对应的商品信息
    public static Product findById(String id){
        for(Product product : list){
            if(id.equals(product.getId())){
                return product;
            }
        }
        return null;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------展示商品信息--------");
        showProductInfo(list);
        // 定义一个集合保存商品信息
        LinkedList<Product> linkedList = new LinkedList<>();
        boolean flage = true;
        while (flage){
            System.out.println("请输入商品编号:");
            String id = scanner.next();
            // 根据商品id查询商品信息
            Product product = findById(id);
            if(linkedList.size() < 3){ // 浏览的商品信息和历史商品信息重复
                if(linkedList.contains(product)){
                    linkedList.remove(product);
                    linkedList.addFirst(product);
                }else{  // 浏览的商品信息不重复
                    linkedList.addFirst(product);
                }
            }
            if(linkedList.size() == 3){
                if(linkedList.contains(product)){ // 浏览的商品信息和历史商品信息重复
                    linkedList.remove(product);
                    linkedList.addFirst(product);
                }else{  // 浏览的商品信息不重复
                    linkedList.removeLast();
                    linkedList.addFirst(product);
                }
            }
            // 展示浏览的商品信息：
            System.out.println("您浏览的商品信息如下:");
            showProductInfo(linkedList);
            System.out.println("是否继续浏览(true/false)");
            flage = scanner.nextBoolean();
        }
        System.out.println("谢谢惠顾，欢迎下次光临!!!");
    }
}
