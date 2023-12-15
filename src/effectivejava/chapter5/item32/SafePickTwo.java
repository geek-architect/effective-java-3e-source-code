package effectivejava.chapter5.item32;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// Safe version of PickTwo using lists instead of arrays (Page 150)
public class SafePickTwo {
    static <T> List<T> pickTwo(T a, T b, T c) {
        List<T> result=null;
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0:
                result= List.of(a, b);
            case 1:
                result=  List.of(a, c);
            case 2:
                result= List.of(b, c);
        }
        if (result != null){
            System.out.println(result.getClass().getSimpleName());
            return result;
        }
        throw new AssertionError();
    }

    public static void main(String[] args) {
        List<String> attributes = pickTwo("Good", "Fast", "Cheap");
        System.out.println(attributes);
    }
}
