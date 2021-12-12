package com.javaexercise.cn01;
//方法重写
class Vehicle{
    public void run(){
        System.out.println("汽车正在跑");
    }
    public void stop(){
        System.out.println("汽车已经停下来了");
    }
}
class Horse extends Vehicle{
    public void run(){
        System.out.println("马正在寻找食物");
    }
    public void stop(){
        System.out.println("马已经睡觉了");
    }
}
class Plane extends Vehicle{
    String name="歼7";

    public void run(){
        System.out.println("飞机正在天上飞");
    }
    public void stop(){
        System.out.println("飞机停在机场");
    }
    //重写toString方法
    @Override
    public String toString() {
        return "战斗机中的"+this.name;
    }
}
public class TestOverride {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        Horse v2=new Horse();
        Plane v3=new Plane();
        //打印对象，自动执行toString方法
        System.out.println(v3);
        v1.run();
        v2.run();
        v3.run();
        v1.stop();
        v2.stop();
        v3.stop();
    }


}
