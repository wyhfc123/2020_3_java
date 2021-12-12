package com.javaexercise.cn02;



import java.util.Arrays;

//数组元素是引用类型的排序（Comparable接口的应用）
class Mans implements Comparable{
            int age;
            int id;
            String name;
    public Mans(int age,String name){
                super();
                this.age=age;
                this.name=name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {


        Mans Mans=(Mans) o;
        System.out.println("25行"+Mans.age);
        if (this.age<Mans.age){
            return -1;
        }
        if (this.age>Mans.age){
            return 1;
        }
        return 0;
    }
}
public class ArrayTest {
    public static void main(String[] args) {
//        Mans[] msMans = { new Mans(3, "a"), new Mans(60, "b"), new Mans(2, "c") };
//        Arrays.sort(msMans);
//        System.out.println(Arrays.toString(msMans));
        //二分查找
        int[] a= {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));
        //排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //binarySearch(要查找的数组,查找的值)：二分查找，获取对应索引
        System.out.println("改位置索引："+Arrays.binarySearch(a,12));
//        批量填充
//        fill(要填充的数组,起始索引，结束索引，填充值)
        Arrays.fill(a,2,4,100);
        System.out.println(Arrays.toString(a));

    }
}
