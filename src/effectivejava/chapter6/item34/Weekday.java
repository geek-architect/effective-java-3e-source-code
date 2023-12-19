package effectivejava.chapter6.item34;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/12/18
 */
public enum Weekday {
    MONDAY("周一"),
    TUESDAY("周二"),
    WEDNESDAY("周三"),
    THURSDAY("周四"),
    FRIDAY("周五"),
    SATURDAY("周六"),
    SUNDAY("周日");

    private final String chineseName;

    Weekday(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }
    public static void main(String[] args) {
        Weekday today = Weekday.MONDAY;
        System.out.println("今天是：" + today.getChineseName());

        // 测试values()方法
        Weekday[] days = Weekday.values();
        System.out.println("测试values()方法:");
        for (Weekday day : days) {
            System.out.print(day.getChineseName()+",");
        }
        System.out.println();

        // 测试valueOf()方法
        Weekday monday = Weekday.valueOf("MONDAY");
        System.out.println("测试valueOf()方法:");
        System.out.println("MONDAY的中文名称是：" + monday.getChineseName());
        System.out.println();

        // 测试ordinal()方法
        System.out.println("测试ordinal()方法:");
        for (Weekday day : days) {
            System.out.println(day.getChineseName() + "的ordinal值是：" + day.ordinal());
        }
    }
}
