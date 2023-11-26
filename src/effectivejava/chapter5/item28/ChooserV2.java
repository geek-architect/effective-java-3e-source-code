package effectivejava.chapter5.item28;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/11/23
 */
public class ChooserV2<T> {
    private final T[] choiceArray;
    public ChooserV2(Collection choices) {
        this.choiceArray = (T[])choices.toArray();
    }
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }

    public static void main(String[] args) {
        Collection intList = List.of(1, 2, 3, 4, 5, 6);

        ChooserV2<Integer> chooser = new ChooserV2(intList);

        for (int i = 0; i < 10; i++) {
            Number choice = chooser.choose();
            System.out.println(choice);
        }
    }
}
