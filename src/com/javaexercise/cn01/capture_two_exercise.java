package com.javaexercise.cn01;

import java.util.Scanner;

public class capture_two_exercise {
    public static void main(String[] args) {
        //分支
        //if单分支结构
//        int c=1;
//        if (c==1){
//            System.out.println("你真美");
//        }

        //if-else分支
//        int a=2;
//        if (a==1){
//            System.out.println("你真美");
//        }else{
//            System.out.println("长得还行");
//        }
//        if-else if-else
//        Scanner s=new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        int a=s.nextInt();
//        if (a==1){
//            System.out.println("你太漂亮了");
//        }else if (a==2){
//            System.out.println("你长得挺美");
//        }else{
//            System.out.println("你长得还行");
//        }
//    switch 多选择分支
//        Scanner s=new Scanner(System.in);
//        System.out.println("请输入一个数");
//        int a=s.nextInt();
//        //传入条件
//        switch (a){
//            //满足条件1打印
//            case 1:
//                System.out.println("第一");
//                break;
//            //满足条件2打印
//            case 2:
//                System.out.println("第二");
//                break;
//            //满足条件3打印
//            case 3:
//                System.out.println("第三");
//                break;
//            //否则默认
//            default:
//                System.out.println("你最后");
//                break;
//        }
        //for循环
//        int a=7;
//        for (int b=0;b<a;b++){
//            System.out.println(b);
//        }
//        while循环
//        int a=7;
//        int b=0;
//        //当b小于a时 b++
//        while (b<a){
//            b++;
//            System.out.println(b);
//
//        }
//        do while循环
//        int a=7;
//        int b=0;
//        //不管while天剑是否满足,do至少做一次
//        do{
//            b+=1;
//            System.out.println(b);
//            System.out.println("哈哈");
//        }while (b<a);
        //while与do-while的区别
        //while循环：先判断再执行  do-while循环：先执行再判断
        //带标签的break和continue
        int a=3;
        //给for循环定义名字
//        outer:for (int i=0;i<a;i++){
//            for (int j=0;j<i;j++){
//                if (j==2){
////                    continue outer;
//                    //结束哪个循环
//                    break outer;
//                }
//                System.out.println(j);
//            }
//        }
//        {
            //语句块
//            a=1;

//        }



        //方法
//        int sum=add(3);
//        System.out.println(sum);
//        重载
//         int sum=add(1);
//        System.out.println(sum);
//         String sums=add("哈哈","呵呵");
//        System.out.println(sums);
        //递归
//        int sum=add(10);
//        System.out.println(sum);
//        int sum=0;
//        for(int i=1;i<10;i++){
//            System.out.print(i);
//            System.out.println("   115");
//            do{
//                i++;
//
//                System.out.print(i);
//                System.out.println("   116");
//
//                if(i%2!=0)
//                    sum+=i;
//
//            }while(i<6);
//        }
//        System.out.println(sum);

    }
    //int add:定义方法类型  int a：定义形参类型
//    public static int add( int a){
//        return a;
//    };
    //方法重载
    //方法名相同，但类型和形参个数必须不相同
//    public static int add(int a){
//        return a;
//    }
//    public static String add(String a,String b){
//        return a+b;
//    }
    //求10以内的阶乘
//    public static int add(int a){
//        if (a==1){
//            return 1;
//        }
//        return a*add(a-1);
//    }

}
