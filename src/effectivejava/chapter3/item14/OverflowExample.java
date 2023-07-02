package effectivejava.chapter3.item14;

public class OverflowExample implements Comparable<OverflowExample> {
    private int value;

    public OverflowExample(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(OverflowExample o) {
        return value - o.value;
    }

    public static void main(String[] args) {
        OverflowExample a = new OverflowExample(Integer.MAX_VALUE);
        OverflowExample b = new OverflowExample(Integer.MIN_VALUE);
        System.out.println(a.compareTo(b));
    }
}

