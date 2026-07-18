package Homework.Test1;

public class Truck {
    private String carNumber;
    private String model;
    private String color;
    private double dailyRent;
    private double loadWeight;


    public Truck() {
    }


    public Truck(String carNumber, String model, String color, double dailyRent, double loadWeight) {
        this.carNumber = carNumber;
        this.model = model;
        this.color = color;
        this.dailyRent = dailyRent;
        this.loadWeight = loadWeight;
    }


    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(double dailyRent) {
        this.dailyRent = dailyRent;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public void rent(String renterName, int days) {
        if (days <= 0) {
            System.out.println("租赁天数无效！必须大于0天！");
            return;
        }

        double totalMoney = dailyRent * days;

        System.out.println("租赁信息");
        System.out.println("车牌号：" + carNumber);
        System.out.println("车型：" + model);
        System.out.println("颜色：" + color);
        System.out.println("载重量：" + loadWeight);
        System.out.println("租车人：" + renterName);
        System.out.println("应付金额：" + totalMoney);
    }
}
