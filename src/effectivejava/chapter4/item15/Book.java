package effectivejava.chapter4.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book {
    //Potential security hole!
    //public static final String[] authors = {"Author1", "Author2", "Author3"};

    private static final String[] authors = {"Author1", "Author2", "Author3"};

    //有安全隐患的公有域
    public static String[] getAuthors() {
        return authors;
    }

    public static List<String> getAuthors01() {
        return Collections.unmodifiableList(Arrays.asList(authors));
    }

    public static String[] getAuthors02() {
        return authors.clone();
    }

    //编写测试代码
    public static void main(String[] args) {
        getAuthors01().add("Author4");
        getAuthors02()[0] = "Author4";
        System.out.println(Arrays.toString(getAuthors02()));
    }

}
