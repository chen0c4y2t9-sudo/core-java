package homework.test3;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java核心技术", 128.0, "Cay S. Horstmann");
        books[1] = new Book("三体", 45.0, "刘慈欣");
        books[2] = new Book("设计模式", 68.5, "Erich Gamma");

        System.out.println("---- 所有书籍信息 ----");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\n---- 价格大于50元的书籍 ----");
        for (Book book : books) {
            if (book.getPrice() > 50) {
                System.out.println(book);
            }
        }
    }
}