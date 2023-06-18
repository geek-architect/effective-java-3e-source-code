package effectivejava.chapter2.item4;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    private DateTimeUtil() {
        // 私有构造器，避免实例化
    }

    /**
     * 获取当前时间
     *
     * @return 当前时间
     */
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    /**
     * 获取当前日期
     *
     * @return 当前日期
     */
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    /**
     * 获取当前时间的毫秒数
     *
     * @return 当前时间的毫秒数
     */
    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * 获取指定时间的毫秒数
     *
     * @param dateTime 时间
     * @return 毫秒数
     */
    public static long getTimeMillis(LocalDateTime dateTime) {
        return dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 将指定的日期时间字符串转换为LocalDateTime对象
     *
     * @param dateTimeStr 日期时间字符串
     * @param pattern     日期时间格式
     * @return LocalDateTime对象
     */
    public static LocalDateTime parseDateTime(String dateTimeStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTimeStr, formatter);
    }

    /**
     * 将指定的日期字符串转换为LocalDate对象
     *
     * @param dateStr 日期字符串
     * @param pattern 日期格式
     * @return LocalDate对象
     */
    public static LocalDate parseDate(String dateStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateStr, formatter);
    }

    /**
     * 将LocalDateTime对象格式化为指定的日期时间字符串
     *
     * @param dateTime LocalDateTime对象
     * @param pattern 日期时间格式
     * @return 日期时间字符串
     */
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    /**
     * 将LocalDate对象格式化为指定的日期字符串
     *
     * @param date    LocalDate对象
     * @param pattern 日期格式
     * @return 日期字符串
     */
    public static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    /**
     * 获取指定日期的开始时间，例如：2022-07-01 00:00:00
     *
     * @param date 日期
     * @return 开始时间
     */
    public static LocalDateTime getStartOfDate(LocalDate date) {
        return LocalDateTime.of(date, LocalTime.MIN);
    }

    /**
     * 获取指定日期的结束时间，例如：2022-07-01 23:59:59
     *
     * @param date 日期
     * @return 结束时间
     */
    public static LocalDateTime getEndOfDate(LocalDate date) {
        return LocalDateTime.of(date, LocalTime.MAX);
    }

    /**
     * 在指定的日期时间上加上指定的年数
     *
     * @param dateTime 日期时间
     * @param years    年数
     * @return 加上年数后的日期时间
     */
    public static LocalDateTime plusYears(LocalDateTime dateTime, long years) {
        return dateTime.plusYears(years);
    }

    /**
     * 在指定的日期时间上加上指定的月数
     *
     * @param dateTime 日期时间
     * @param months   月数
     * @return 加上月数后的日期时间
     */
    public static LocalDateTime plusMonths(LocalDateTime dateTime, long months) {
        return dateTime.plusMonths(months);
    }

    /**
     * 在指定的日期时间上加上指定的天数
     *
     * @param dateTime 日期时间
     * @param days     天数
     * @return 加上天数后的日期时间
     */
    public static LocalDateTime plusDays(LocalDateTime dateTime, long days) {
        return dateTime.plusDays(days);
    }

    /**
     * 在指定的日期时间上加上指定的小时数
     *
     * @param dateTime 日期时间
     * @param hours    小时数
     * @return 加上小时数后的日期时间
     */
    public static LocalDateTime plusHours(LocalDateTime dateTime, long hours) {
        return dateTime.plusHours(hours);
    }

    /**
     * 在指定的日期时间上加上指定的分钟数
     *
     * @param dateTime 日期时间
     * @param minutes  分钟数
     * @return 加上分钟数后的日期时间
     */
    public static LocalDateTime plusMinutes(LocalDateTime dateTime, long minutes) {
        return dateTime.plusMinutes(minutes);
    }

    /**
     * 在指定的日期时间上加上指定的秒数
     *
     * @param dateTime 日期时间
     * @param seconds  秒数
     * @return 加上秒数后的日期时间
     */
    public static LocalDateTime plusSeconds(LocalDateTime dateTime, long seconds) {
        return dateTime.plusSeconds(seconds);
    }
}

