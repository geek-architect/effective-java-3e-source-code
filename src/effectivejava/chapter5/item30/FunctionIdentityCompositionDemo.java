package effectivejava.chapter5.item30;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/11/23
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 一个恒等函数的案例
 *
 */
public class FunctionIdentityCompositionDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry");

        // 一个将字符串转为大写的函数
        Function<String, String> toUpperCase = String::toUpperCase;

        // 使用Function.identity()作为默认的恒等函数
        Function<String, String> identity = Function.identity();

        // 条件：是否转换为大写
        boolean convertToUpperCase = true;

        // 根据某种条件，我们选择是否使用toUpperCase函数或恒等函数
        Function<String, String> chosenFunction = convertToUpperCase ? toUpperCase : identity;

        List<String> transformed = strings.stream()
                .map(chosenFunction)
                .collect(Collectors.toList());

        System.out.println(transformed); // 当someCondition为true时，输出大写字符串；否则输出原字符串
    }
}
