package effectivejava.chapter5.item26;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用于演示Java泛型中instanceof的限制。
 * 通过本案例，我们可以了解到Java泛型在使用instanceof运算符时的限制。
 *
 * 这个类是由文心一言生成的。
 */
public class GenericInstanceofExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // 编译错误：不能使用泛型参数进行instanceof运算
         /*if (stringList instanceof List<String>) {
             System.out.println("stringList is an instance of List<String>");
         }*/

    }
}
