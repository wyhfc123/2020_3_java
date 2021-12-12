package com.javaexercise.cn03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalender {
    public static void main(String[] args) {
        // 得到相关日期元素
        GregorianCalendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10, 50);
        //获得年
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        int day2 = calendar.get(Calendar.DAY_OF_MONTH);
        int date = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(day2);
        System.out.println(date);
        // 设置日期
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, 2020);
        calendar2.set(Calendar.MONTH, 4);
        calendar2.set(Calendar.DATE, 1);
        calendar2.set(Calendar.MINUTE, 10);
        calendar2.set(Calendar.HOUR_OF_DAY, 20);
        calendar2.set(Calendar.SECOND, 30);
        System.out.println(calendar2.toString());
        // 日期计算
        GregorianCalendar calendar3 = new GregorianCalendar(2999, 10, 9, 22, 10, 50);
        calendar3.add(Calendar.MONTH, -7); // 月份减7
        calendar3.add(Calendar.DATE, 7); // 增加7天
//        枚举的使用
        for (Week k : Week.values()) {
            System.out.println(k);
        }
        for (Season s:Season.values()) {
            System.out.println(s);
        }
    }
//enum 枚举
    enum Season {
        SPRING, SUMMER, AUTUMN, WINDTER
    }

    /**
     * 星期
     */
    enum Week {
        星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
    }
}
