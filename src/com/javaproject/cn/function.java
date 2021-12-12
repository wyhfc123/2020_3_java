package com.javaproject.cn;

public class function {
    public static void main(String[] args) {
        //创建对象
        function fun=new function();
        //调用prnt方法
//        fun.prnt();
//        System.out.println(fun.add(10,20,30));
//        System.out.println(fun.add(2,3));
        System.out.println(aas(100));

    }
//    void prnt(){
//        System.out.println("呵呵");
//    }
    //重载：方法名一样，而类型不一样
// int add(int a,int b,int c){
//     System.out.println(a);
//     System.out.println(b);
//     System.out.println(c);
//     return a;
// }
// double add(int a,int b){
//     System.out.println(10);
//        return a;
// }
    //递归
    static int aas(int a){
        if (a==1){
            return 1;
        }else{
            return a+aas(a-1);
        }
    }

}

