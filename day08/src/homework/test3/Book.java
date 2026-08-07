package homework.test3;

public class Book {

    private String name;      // 书名
    private double price;     // 价格
    private String author;    // 作者

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "书名: " + name + ", 价格: " + price + "元, 作者: " + author;
    }
}
