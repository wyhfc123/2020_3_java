package com.javaexercise.cn01;
//构造方法重载
class User{
    //构造方法
    int id;
    String name;
    int age;
    //构造器不加void
    //第一个构造器
    public  User(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("第一个构造器");
    }
    //第二个构造器
    public  User(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
        System.out.println("第二个构造器");
    }
    //第三个构造方法
    public  User(String name ,int age){
        this.name=name;
        this.age=age;
        System.out.println("第三个构造器");
    }
    void Infomation(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }

}


public class capture_three_constractor_overide {
    public static void main(String[] args) {
        User u=new User(1,"张三");
        u.Infomation();
        User u1=new User(1,"李四",18);
        u1.Infomation();
        User u2=new User("赵六",21);
        u2.Infomation();
    }
}
