package effectivejava.chapter2.item1;

public class Book {
    private String title;
    private String author;
    private int pages;

    // 私有构造函数
    private Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // 静态工厂方法
    public static Book createBook(String title, String author, int pages) {
        if (title == null || author == null || pages <= 0) {
            return null;
        }
        return new Book(title, author, pages);
    }

    // getter 和 setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
