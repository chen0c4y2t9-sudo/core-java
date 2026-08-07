package homework.test2;

public class TestMonster {
    public static void main(String[] args) {
        System.out.println("========== 蛇怪测试 ==========");

        SnakeMonster snake = new SnakeMonster("蛇妖甲", 5, 20);
        snake.attack();
        snake.bloodRestore();
        snake.move();

        System.out.println("\n========== 蜈蚣精测试 ==========");

        CentipedeMonster centipede = new CentipedeMonster("蜈蚣乙", 60, 15);
        centipede.attack();
        centipede.move();
    }
}