package effectivejava.chapter2.item8.finalize;

public class ResourceClass implements AutoCloseable {

    // 关闭资源
    @Override
    public void close() throws Exception {
        // 释放资源
    }

    // 终结方法
    @Override
    protected void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}

