package effectivejava.chapter5.item26;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/11/26
 */
public class SimpleListClassExample {
    public static void main(String[] args) {
        // 获取List接口的Class对象并打印其名称
        Class<?> listClass = List.class;
        //Class<?> listClass2 = List<String>.class;
        System.out.println("List interface Class object: " + listClass.getName());
    }
}
