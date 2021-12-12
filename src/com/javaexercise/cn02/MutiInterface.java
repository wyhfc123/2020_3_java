package com.javaexercise.cn02;

import com.javaproject.cn.TestArray;

//接口多继承实现
interface A{
    void aa();
}
interface B{
    void bb();
}
interface C extends A,B{
    void cc();
}
interface D extends C{
    void dd();
}
class Test implements D{
    public void dd(){
        System.out.println("dd");
    }
    public void cc(){
        System.out.println("cc");
    }
    public void bb(){
        System.out.println("bb");
    }
    public void aa(){
        System.out.println("aa");
    }
}
public class MutiInterface {
    public static void main(String[] args) {
        Test t=new Test();
        t.aa();
        t.bb();
        t.cc();
        t.dd();
    }
}

