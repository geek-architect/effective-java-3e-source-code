package effectivejava.chapter3.item10.reflexive;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false; // 违反自反性
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.title.equals(other.title) && this.author.equals(other.author);
    }
}
