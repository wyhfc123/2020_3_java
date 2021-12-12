package com.javaexercise.cn02;

//接口的使用
//比抽象类更抽象的是接口
//定义的接口必须实现

public class InterfaceUse {
    public static void main(String[] args) {
        Complete c=new Complete();
        c.fly();
        c.height();
        c.dd();
    }

}

//定义飞行接口
interface Fly{
    int Fly_HEIGHT=100;//等价于：public static final int Fly_HEIGHT=100;
    void fly();//等价于：public abstract void fly();
}
interface Big{
    int BIG=20;
    void height();
}
//当继承多个接口时，必须重写多个接口的方法
class Complete implements Fly,Big{
    public void fly(){
        System.out.println("飞机正在天上飞行");
    }
    public void height(){
        System.out.println("那个家伙很重");
    }
    public void dd(){
        System.out.println("哈哈");
    }
}