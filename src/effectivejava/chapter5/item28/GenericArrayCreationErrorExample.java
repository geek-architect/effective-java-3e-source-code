package effectivejava.chapter5.item28;

import java.util.List;
import java.util.ArrayList;

public class GenericArrayCreationErrorExample {
    public static void main(String[] args) {
        // 尝试创建一个泛型List<String>数组（此行会导致编译错误）
        //List<String>[] listArray = new ArrayList<String>[5]; // Error: Generic array creation

        // 其他操作...
    }
}
