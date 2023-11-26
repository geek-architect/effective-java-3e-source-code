package effectivejava.chapter5.item27;

import java.util.*;

public class UncheckedWarningExample1 {


    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Orange");
        set.add("Grape");

        // 将原生类型集合转换为泛型类型集合，产生unchecked警告

        Collection<String> stringCollection = (Collection<String>) set;

        stringCollection.stream().forEach(System.out::println);
    }
}