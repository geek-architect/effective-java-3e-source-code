package effectivejava.chapter6.item34;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

// Enum type with constant-specific class bodies and data (Pages 163-4)
public enum Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);

    // Implementing a fromString method on an enum type (Page 164)
//    private static final Map<String, Operation> stringToEnum =
//            Stream.of(values()).collect(
//                    toMap(Object::toString, e -> e));

    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).collect(
                    toMap(
                            // 键的转换函数：将枚举常量转换为它的字符串表示形式
                            (Operation operation) -> operation.toString(),

                            // 值的转换函数：直接返回枚举常量本身
                            (Operation operation) -> operation
                    ));


    // Returns Operation for string, if any
    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));

        // 从字符串中获取枚举常量
        System.out.println(Operation.fromString("+"));
    }
}
