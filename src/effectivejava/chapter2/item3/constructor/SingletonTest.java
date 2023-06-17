package effectivejava.chapter2.item3.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton newInstance = constructor.newInstance();
        System.out.println(newInstance == Singleton.getInstance());
    }

}
