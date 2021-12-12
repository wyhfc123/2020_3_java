package com.javaexercise.cn02;
import java.util.Arrays;
//创建一维引用数组
class Man{
    private int id;
    private int age;
    public Man(int id,int age){
        this.id=id;
        this.age=age;
    }
}



//数组使用
public class ArrayExercise {
    public static void main(String[] args) {
//        //声明数组(默认为null)
//        int[] s=null;
//        //定义数组长度为10
//        s=new int[10];
//        //定义一位数组
//        int [] a=new int[20];
//        a[1]=2;
//        System.out.println(a.getClass());
//        for (int i=0;i<10;i++){
//            s[i]=2*i+1;
////            System.out.println(s[i]);
//        }
// int[]
        //创建引用类型一维数组
        //创建对象
//
//        创建一个Man对象数组,数组里面只能存储Man对象
//        Man[] mans;
//        //Man对象数组长度为10
//        mans=new Man[10];
//        Man m=new Man(17,21);
//        Man m1=new Man(21,30);
//        mans[0]=m;;//给引用类型数组元素赋值；
//        mans[1]=m1;;//给引用类型数组元素赋值；
//        System.out.println(mans[0]);
//        for (Man s:mans) {
//            System.out.println(s);
//
//        }

        //静态初始化数组
//        int[] a={1,2,3};
//        Man[] mans={new Man(10,21),new Man(20,21)};
//        System.out.println(mans[0]);
        //动态初始化数组
//        int[] a=new int[10];
//        a[1]=1;
//        a[2]=2;
//        System.out.println(a[1]);
//        int a2[] = new int[2]; // 默认值：0,0
//        boolean[] b = new boolean[2]; // 默认值：false,false
//        String[] s = new String[2]; // 默认值：null, null

        //数组的遍历
//        int[] a=new int[10];
//        for (int i=0;i<10;i++){
//            a[i]=100*i;
//        }
//        for (int k=0;k<a.length;k++){
//            System.out.println(a[k]);
//        }
        //foreach循环
//        String[] ss={"aa","bb","cc","dd"};
//        //for(遍历结果类型  结果变量:遍历的变量)
//        for (String temp:ss) {
//            System.out.println(temp);
//        }
        //数组拷贝
//        String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
//        String[] s1=new String[6];
        //src原始数组 srcPos:从第几个下标开始拷贝
        //dest 目标数组 destPos:要拷贝到目标数组那个位置
        //length:拷贝几个
//        System.arraycopy(s,2,s1,0,3);
//        for (String s0:s1
//             ) {
//            System.out.println(s0);
//
//        }
//        int[] s={12,2,322,11,25};
//        System.out.println(s);// 打印数组引用的值；
//        //调用Arrays对象的toString方法打印具体内容
//        System.out.println(Arrays.toString(s)); // 打印数组元素的值；具体的值
//        //排序(从小到大)
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));


    }


}
