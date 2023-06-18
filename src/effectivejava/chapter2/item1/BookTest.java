package effectivejava.chapter2.item1;

// 测试代码
public class BookTest {
    public static void main(String[] args) {
        Book book1 = Book.createBook("Effective Java", "Joshua Bloch", 416);
        Book book2 = Book.createBook(null, "Unknown Author", -100);

        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + ", " + book1.getPages() + " pages");
        System.out.println("Book 2: " + book2);
    }
}
