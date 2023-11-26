package effectivejava.chapter5.item26;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个类演示了不使用泛型的情况下，List集合的使用方式。
 * 代码由文心一言生成。
 */
public class RawTypeListExample {
    public static void main(String[] args) {
        // 使用原生态类型List
        List list = new ArrayList();

        // 添加一个字符串对象
        list.add("Hello");

        // 尝试添加一个整数对象，引发运行时类型转换错误
        list.add(123);

        // 尝试将列表中的每个元素打印为字符串
        for (Object item : list) {
            // 这里假设list中每个元素都是String类型，但实际上它可能不是
            String str = (String) item; // 运行时类型转换错误：ClassCastException
            System.out.println(str);
        }

    }
}