package homework.test2;

public class Monster {
    protected String name;
    protected int life;
    protected int attack;


    public Monster() {
    }


    public Monster(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    public void attack() {
        System.out.println(name + "展开攻击");
        System.out.println("当前生命值是：" + life);
        System.out.println("攻击力是：" + attack);
    }


    public void move() {
        System.out.println("怪物在移动...");
    }
}
