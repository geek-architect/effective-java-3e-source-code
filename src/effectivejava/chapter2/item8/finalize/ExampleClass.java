package effectivejava.chapter2.item8.finalize;

public class ExampleClass {

    // 终结方法
    @Override
    protected void finalize() throws Throwable {
        // 释放资源
        super.finalize();
    }
}
