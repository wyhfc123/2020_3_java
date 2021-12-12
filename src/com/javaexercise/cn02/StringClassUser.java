package com.javaexercise.cn02;

public class StringClassUser {
    public static void main(String[] args) {
//        String str1=new String("123");
////        str1.intern();
//        System.out.println( str1.intern());

        String str2=" ABCD ";
        //通过下标获得具体字符
        System.out.println(str2.charAt(2));
        //判断两个字符串是否一致
        System.out.println(str2.equals("ABCD"));
        ////判断两个字符串是否一致,    忽略大小写的字符串比较
        System.out.println(str2.equalsIgnoreCase("ABCD"));
        //返回字符A再字符串中的位置，找不到返回-1
        System.out.println(str2.indexOf("A"));
        //返回字符A再字符串中的位置，找不到返回-1（从末尾查找）
        System.out.println(str2.lastIndexOf("A"));
        //返回字符串长度
        System.out.println(str2.length());
        //替换字符串
        System.out.println(str2.replace("A","F"));
        //判断是否是以字符A开头，不是返回false
        System.out.println(str2.startsWith("A"));
        //判断是否是以字符A结尾，不是返回false
        System.out.println(str2.endsWith("A"));
        //截取字符串
        System.out.println(str2.substring(0,2));
        //字符串大写
        System.out.println(str2.toUpperCase());
        //字符串小写
        System.out.println(str2.toLowerCase());
        //去除字符串两边空格
        System.out.println(str2.trim());
    }
}
