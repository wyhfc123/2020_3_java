package com.javaexercise.cn01;


class Fly{
    public int age=20;
    public void discrable(){
        System.out.println("有一双翅膀");
    }
}
class Birds extends Fly{
    public int age=30;
    public void discrable(){
        //再方法重写后调用父类的discrable方法
        super.discrable();
        System.out.println(super.age);
        System.out.println(age);
        System.out.println("叫声特别好听");
    }
}
class Planes extends Fly{
    public void discrable(){
        System.out.println("一种会飞的铁疙瘩");
    }
}

public class Testsuper {

    public static void main(String[] args) {
        new Birds().discrable();
//        System.out.println(new Birds().age);

    }
}
