package effectivejava.chapter3.item13;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Copy Constructor
    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.pages = book.pages;
    }

    // Static Factory Method
    public static Book newInstance(Book book) {
        return new Book(book);
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
