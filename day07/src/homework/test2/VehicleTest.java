package homework.test2;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        System.out.println("---- 方法重写测试 ----");
        bike.run();
        car.run();
    }
}