package com.javaproject.cn;

public class TestArray {
    public static void main(String[] args) {
        //定义数组及固定长度

        //默认初始化数组
        int[] arr01=new int[10];
        String[] arr02=new String[5];

        //静态初始化数组
        int[] arr03={1,3,5};

        //动态初始化数组
        arr02[0]="a";
        arr01[1]=1;
        for(int i=0;i<arr01.length;i++){
            arr01[i]=10*i;
        }
        //foreach循环:用于读取数组元素的值，不能修改元素的值
        for (int m:arr01) {
            System.out.println(m);
        }

    }


}
