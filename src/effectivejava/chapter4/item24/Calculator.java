package effectivejava.chapter4.item24;

public class Calculator {
    public static enum Operation {
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
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        double result;

        result = Calculator.Operation.PLUS.apply(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);

        result = Calculator.Operation.MINUS.apply(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + result);

        result = Calculator.Operation.TIMES.apply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result);

        result = Calculator.Operation.DIVIDE.apply(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}

