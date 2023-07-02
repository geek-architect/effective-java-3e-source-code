package effectivejava.chapter3.item10.reflexive;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);

        if (bookList.contains(book1)) {
            System.out.println("Book1 is already in the list!");
        } else {
            System.out.println("Book1 is not in the list.");
        }
    }
}
