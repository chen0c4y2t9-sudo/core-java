package Homework.Test2;

public class CentipedeMonster extends Monster {

    public CentipedeMonster(String name, int life, int attack) {
        super(name, life, attack);
    }

    @Override
    public void move() {
        System.out.println("我是蜈蚣精，御风飞行");
    }


}