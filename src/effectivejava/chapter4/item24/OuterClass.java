package effectivejava.chapter4.item24;

public class OuterClass {

    private static int staticField = 1; // 静态成员变量
    private int nonStaticField = 2; // 非静态成员变量

    public static class StaticMemberClass { // 静态成员类
        // 只能访问外部类的静态成员变量和方法
        public void printStaticField() {
            System.out.println("StaticMemberClass");
            System.out.println(staticField);
        }
    }

    public class NonStaticMemberClass { // 非静态成员类，也称为内部类
        // 可以访问外部类的静态和非静态成员变量和方法
        public void printFields() {
            System.out.println("NonStaticMemberClass");
            System.out.println(staticField);
            System.out.println(nonStaticField);
        }
    }

    public void printLocalAndAnonymousClasses() {
        final int localVariable = 3; // 局部变量

        class LocalClass { // 局部类
            // 可以访问外部类的静态和非静态成员变量和方法，以及局部变量（如果它们是 final 或 effectively final）
            public void printAllFields() {
                System.out.println("LocalClass");
                System.out.println(staticField);
                System.out.println(nonStaticField);
                System.out.println(localVariable);
            }
        }

        LocalClass localClass = new LocalClass(); // 实例化局部类
        localClass.printAllFields();

        new Runnable() { // 匿名类，实现 Runnable 接口
            // 可以访问外部类的静态和非静态成员变量和方法，以及局部变量（如果它们是 final 或 effectively final）
            public void run() {
                System.out.println("AnonymousClass with Runnable");
                System.out.println(staticField);
                System.out.println(nonStaticField);
                System.out.println(localVariable);
            }
        }.run();

        new Thread(() -> { // 匿名类，使用 Lambda 表达式实现 Runnable 接口
            // 可以访问外部类的静态和非静态成员变量和方法，以及局部变量（如果它们是 final 或 effectively final）
            System.out.println("AnonymousClass with Lambda");
            System.out.println(staticField);
            System.out.println(nonStaticField);
            System.out.println(localVariable);
        }).start();
    }

    public static void main(String[] args) {
        StaticMemberClass staticMemberClass = new OuterClass.StaticMemberClass(); // 实例化静态成员类
        staticMemberClass.printStaticField();

        OuterClass outerClass = new OuterClass();
        NonStaticMemberClass nonStaticMemberClass = outerClass.new NonStaticMemberClass(); // 实例化非静态成员类
        nonStaticMemberClass.printFields();

        outerClass.printLocalAndAnonymousClasses(); // 调用方法，打印局部类和匿名类的访问结果
    }
}

