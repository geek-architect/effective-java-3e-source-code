package effectivejava.chapter6.item34;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/12/18
 */
public class IntWeekdayEnumTest {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {
        int today = MONDAY;
        System.out.println("今天是周" + today);
    }
}
