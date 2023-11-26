package effectivejava.chapter5.item28;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/11/23
 */
public class ChooserV1 {
    private final Object[] choiceArray;
    private ChooserV1(Collection choices) {
        this.choiceArray = choices.toArray();
    }
    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }

    public static void main(String[] args) {
        Collection intList = List.of(1, 2, 3, 4, 5, 6);

        ChooserV1 chooser = new ChooserV1(intList);

        for (int i = 0; i < 10; i++) {
            Number choice = (Number) chooser.choose();
            System.out.println(choice);
        }
    }
}
