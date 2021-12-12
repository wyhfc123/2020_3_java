package com.javaexercise.cn01;
//costractor构造器

class Point{
    double x,y;
    //构造器  相当于python def __init__(self)
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double Getinstance(Point p){
//        p：Point类
        return Math.abs(this.x+p.x)+Math.abs(this.y);
    }
}
public class capture_three_constractor_exercise {
    public static void main(String[] args) {
        Point p =new Point(20,30);
        double c=p.Getinstance(p);
        System.out.println(c);



    }


}
