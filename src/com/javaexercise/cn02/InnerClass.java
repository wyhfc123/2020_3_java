package com.javaexercise.cn02;


//内部类的使用

import java.awt.event.WindowAdapter;

//定义外部类
class Outer{
    private int num=200;
    public void show(){

        System.out.println(num);

    }
    //内部类书写
//    public class Inner{
//        private int num=30;
//        int number=30;
//        public void show(){
//            System.out.println(num);
//            System.out.println(this.number);
//            //内部类可以使用外部类的变量，但外部类不能使用内部类的变量
//            System.out.println(Outer.this.num);
//        }
//    }
//    静态内部类
//    static class Inner{
//        private int num=200;
//        public void show(){
//            System.out.println(this.num);
//            //静态内部类不可以调用外部类方法
////            System.out.println(Outer.this.num);
//        }
//
//    }

    //匿名类

    //局部内部类

}

public class InnerClass {
    public static void main(String[] args) {
        //非静态内部类new Outer().new Inner();
//        Outer o=new Outer();
//        o.show();
//        Outer.Inner i =o.new Inner();
//        i.show();
//        Outer.Inner i=new Outer().new Inner();
//        i.show();


        //静态内部类 new Outer.Inner();
//        Outer.Inner i= new Outer.Inner();
//        i.show();
        //匿名类


    }
}
