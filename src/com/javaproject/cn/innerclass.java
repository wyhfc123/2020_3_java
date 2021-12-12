package com.javaproject.cn;
//非静态内部类
public class innerclass {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.testInner();
    }
}
class Outer{
    private int age=1;
    public void testOuter(){
        System.out.println("哈哈");
        System.out.println();
    }
    class Inner{
        private int age=20;
        public void testInner(){
            int age=30;
            System.out.println("呵呵");
            System.out.println(Outer.this.age);
            System.out.println(this.age);
            System.out.println(age);
        }
    }
}