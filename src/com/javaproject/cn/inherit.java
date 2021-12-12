package com.javaproject.cn;
//继承 使用extends关键字
public class inherit {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu.name);
//        stu.string();
        stu.rest();
    }
}

class  Person{
    String name="张三";
    int height=17;
    public void rest(){
        System.out.println("休息一下");
    }
}
class  Student extends Person{
    String major;

    public void rest(){
        //super获取被子类重写的内容
        super.rest();
        System.out.println("睡一会儿");
    }
}