package com.javaexercise.cn01;

class Animal{
    String name="动物科";
    public void action(){
        System.out.println("动物正在睡觉");
    }
}
class Dog extends Animal{
    String name="狗";
    public void action(){
        System.out.println("狗正在睡觉");

    }
}



public class inharitent {
    public static void main(String[] args) {
        Animal d=new Dog();
        d.action();
        //判断对象d是否是由Dog类创建而来，是返回true，不是返回false
//        System.out.println(d instanceof Dog);
//        //默认找父类
//        System.out.println(d instanceof Animal);

    }
}
