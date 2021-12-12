package com.javaexercise.cn03;

public class TestStringBufferAndBuilder {
    public static void main(String[] args) {
        //创建可变字符串StringBuilder
//        StringBuilder sb=new StringBuilder();
//        for (int i=0;i<10;i++){
//            sb.append((String) ("c-"+i+" "));
//        }
//        System.out.println(sb.toString());
//        sb.append("hello world");
//        System.out.println(sb.toString());
//        StringBuffer sb2 = new StringBuffer("中华人民共和国");
//        sb2.insert(0,"我爱").insert(9,",你呢？");
//        System.out.println(sb2.toString());
//        //delete(起始索引，结束索引)
//        sb2.delete(9,11);
//        System.out.println(sb2.toString());
//        //删除某个字符（下标）
//        sb.deleteCharAt(0).deleteCharAt(0).deleteCharAt(0);
//        System.out.println(sb.toString());
//        //获取某个字符（下标）
//        System.out.println(sb2.charAt(0));
//        System.out.println(sb2.reverse());//字符串逆序

        String str8 = "";
        //本质上使用StringBuilder拼接, 但是每次循环都会生成一个StringBuilder对象
        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time1 = System.currentTimeMillis();//获取系统的当前时间
        for (int i = 0; i < 5000; i++) {
            str8 = str8 + i;//相当于产生了10000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存 : " + (num1 - num2));
        System.out.println("String占用时间 : " + (time2 - time1));
        /**使用StringBuilder进行字符串的拼接*/
        StringBuilder sb1 = new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            sb1.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用内存 : " + (num3 - num4));
        System.out.println("StringBuilder占用时间 : " + (time4 - time3));



    }
}
