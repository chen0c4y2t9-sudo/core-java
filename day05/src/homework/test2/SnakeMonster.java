package homework.test2;

public class SnakeMonster extends Monster{
    public SnakeMonster(String name, int life, int attack) {
        super(name, life, attack);
    }


    public void move() {
        System.out.println("我是蛇怪，我走S型路线");
    }


    public void bloodRestore() {
        if (life < 10) {
            life += 20;
            System.out.println("实施大蛇补血术。。。。。。，当前生命值是：" + life);
        } else {
            System.out.println("生命值充足，不需要补血！");
        }
    }
}
