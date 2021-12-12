package com.javaproject.cn;

import java.util.Arrays;

public class Stringclass  {

    public static void main(String[] args) {
        //数组定义:
        //类型[]  变量=new 类型[长度] 创建对象
        //类型[]  变量={元素......}  静态填写对象

        String[] str={"a","b","c","d"};
        String cc=new String("呵呵");
        String dd="11"+2;
        String ee="abc";
        String[] ff=new String[10];
        System.out.println(Arrays.toString(str));
        //二维数组
        String[][] gg=new String[3][];
//        System.out.println(str.equals(ee));
//        System.arraycopy(str,1,ff,3,2   );
//        for (int i=0;i<ff.length;i++){
//            System.out.println(ff[i]);
//        }
    }



}
