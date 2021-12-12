package com.javaexercise.cn01;
//总结：类方法只能调用类属性,且类可以调用类方法和类属性
//对象可以调用对象方法、对象属性、类方法和类属性。
//对象可以调用一切，类不可以调用一切
import static java.lang.Math.*;
public class static_initial {
    //静态方法初始化
    //对象属性
    int id=2;
    String name="张三";
    //static声明的为类属性，无static声明的为对象属性
    static String compony;
    //设置静态属性（类属性）
    static {
        System.out.println("执行静态方法初始化操作");
        compony="aa";
        cc();
    }
    static void cc(){
        System.out.println(compony);
        System.out.println("15");
    }

    public static void main(String[] args) {
        static_initial si=new static_initial();
        si.cc();
        static_initial.cc();
    }
}
