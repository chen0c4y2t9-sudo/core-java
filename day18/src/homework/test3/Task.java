package homework.test3;

public class Task {

    @RunMethod
    public void login() {
        System.out.println("login：执行登录");
    }

    public void logout() {
        System.out.println("logout：执行登出（不该出现）");
    }

    @RunMethod
    public void pay() {
        System.out.println("pay：执行支付");
    }

    public void refund() {
        System.out.println("refund：执行退款（不该出现）");
    }
}
