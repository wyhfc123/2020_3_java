package com.javaexercise.cn03;




import java.text.SimpleDateFormat;
import java.util.Date;

//时间测试类
public class TestTime {
    public static void main(String[] args) {
//        long now=System.currentTimeMillis();
//        System.out.println(now);
//        Date d=new Date(2000);
//        Date d1=new Date(1000);
//        System.out.println(d.after(d1));
//        System.out.println(d.before(d1));
//        System.out.println(d.equals(d1));
//        System.out.println(d.getTime());
//        System.out.println(d.toString());
//        SimpleDateFormat类的使用
        SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat s2=new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
        String DayTime=s1.format(new Date());
        System.out.println(DayTime) ;
        System.out.println(s2.format(new Date()));
        String time = "2007-10-7";

    }
}
