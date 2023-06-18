package effectivejava.chapter2.item6;

public class BooleanTest {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Boolean bool = new Boolean("true");
        }
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Boolean bool = Boolean.valueOf("true");
        }
        long end2 = System.nanoTime();

        System.out.println("使用 new 关键字创建对象耗时: " + (end1 - start1) + " 纳秒");
        System.out.println("使用 Boolean.valueOf 创建对象耗时: " + (end2 - start2) + " 纳秒");
    }
}
