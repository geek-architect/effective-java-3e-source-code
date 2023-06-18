package effectivejava.chapter2.item1;

import java.util.EnumSet;

public class EnumSetExample {
    public enum Color {
        RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
    }

    public static void main(String[] args) {
        EnumSet<Color> colors1 = EnumSet.allOf(Color.class);
        System.out.println("All Colors: " + colors1);

        EnumSet<Color> colors2 = EnumSet.noneOf(Color.class);
        System.out.println("No Colors: " + colors2);

        EnumSet<Color> colors3 = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        System.out.println("Primary Colors: " + colors3);

        EnumSet<Color> colors4 = EnumSet.range(Color.YELLOW, Color.INDIGO);
        System.out.println("Rainbow Colors: " + colors4);
    }
}
