package effectivejava.chapter4.item20;

public interface MyInterface {
    void doSomething(); // 定义必需的方法

    default void doSomethingElse() { // 定义默认方法
        System.out.println("默认方法：正在进行其他操作...");
    }
}

 class DefaultImplementation implements MyInterface {
    public void doSomething() { // 实现必需的方法
        System.out.println("正在进行某些操作...");
    }

     @Override
     public void doSomethingElse() {
         System.out.println("覆盖默认方法：正在进行其他操作...");
     }
 }

 class NoDefaultImplementation implements MyInterface {
    public void doSomething() { // 实现必需的方法
        System.out.println("正在进行某些操作...");
    }
}

 class Main {
    public static void main(String[] args) {
        DefaultImplementation obj1 = new DefaultImplementation();
        obj1.doSomethingElse(); // 调用默认方法

        NoDefaultImplementation obj2 = new NoDefaultImplementation();
         obj2.doSomethingElse(); // 调用默认方法会导致编译错误
    }
}
