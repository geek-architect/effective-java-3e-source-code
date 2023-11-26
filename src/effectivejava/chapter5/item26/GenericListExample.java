package effectivejava.chapter5.item26;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个类演示了使用泛型的情况下，List集合的使用方式。
 * 通过泛型，我们可以提高代码的可读性和安全性。
 * 代码由文心一言生成。
 */
public class GenericListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        // list.add(new Integer(100));

        for (String item : list) {
            System.out.println(item);
        }
    }
}