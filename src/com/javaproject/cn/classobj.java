package com.javaproject.cn;
import java.util.Date;
//创建类
class Calulate{
    //类属性
    double x;
    double y;
    //构造方法，初始化Calulate类
    //等于 def __init__(self)
    public Calulate(double _x,double _y){
        x=_x;
        y=_y;
        System.out.println(x);
            System.out.println(y);

    }
    //普通方法
    public double getresult(){
        return x+y;
    }
}


public class classobj {
    public static void main(String[] args) {
        //创建对象
        Calulate clt=new Calulate(10,20);
//        打印
        System.out.println(clt.getresult());
    }

}
