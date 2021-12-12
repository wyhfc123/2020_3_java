package com.javaexercise.cn02;


//定义抽象类（标准）
abstract class Animal01{
    //定义抽象方法
    abstract protected void sout();
}

class Cat extends Animal01 {
    String name;
    protected void sout(){
        System.out.println("猫在睡觉");
    }
    protected void cc(Cat c){
        c.name="哈哈";
        System.out.println(c.name);
        System.out.println("您好");
    }
}
class Dog extends Animal01{
    protected void sout(){
        System.out.println("狗正在吃东西");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Animal01 c=new Cat();
        c.sout();
        String name;
        Cat d=(Cat)c;
        d.cc(d);


    }
}
