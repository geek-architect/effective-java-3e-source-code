package effectivejava.chapter5.item28;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/11/26
 */
public class GenericArrayCreationErrorCase<E> {
    public static void main(String[] args) {
        GenericArrayCreationErrorCase<Integer> caseInstance = new GenericArrayCreationErrorCase<>();

        // 尝试创建一个泛型E数组（此行会导致编译错误）
        //E[] array = new E[5]; // Error: Generic array creation

        // 其他操作...
    }
}
