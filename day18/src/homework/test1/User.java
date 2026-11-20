package homework.test1;

public class User {

    private int id;
    private String username;
    private int age;

    public User() {
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", username='" + username + "', age=" + age + "}";
    }
}
