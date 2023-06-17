package effectivejava.chapter2.item3.constructor;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("单例模式被打破");
        }
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
