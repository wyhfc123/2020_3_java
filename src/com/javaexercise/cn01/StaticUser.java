package com.javaexercise.cn01;

import javax.sound.sampled.Line;

//static：将对象方法转化为类方法 相当于Python @classmethod
//用static声明的方法不能调用对象属性和方法
public class StaticUser {
    int id =1;
    String name="张三";
    //对象方法
    void Info(){
        System.out.println(id);
        System.out.println(name);
    }
     static void cc(){
//         Info()//类方法不能调用对象方法
         System.out.println("你好");
//         StaticUser su=new StaticUser();
//         su.Info();
        dd();
    }
    static void dd(){
        System.out.println("hehe ");
    }
    public static void main(String[] args) {
        StaticUser su=new StaticUser();
        su.Info();
        //对象可以调用类方法
        su.cc();
        //类调用类方法
        StaticUser.cc();
        //类不可以调用对象方法
//        StaticUser.info();
}
}
