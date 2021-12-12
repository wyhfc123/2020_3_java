package com.javaexercise.cn02;
//组合
class AA{
    public void run(){
        System.out.println("run");
    }
}
class BB{
    public void store(){
        System.out.println("store");
    }
}
class CC{
    public void connent(){
        System.out.println("connent");
    }
}
class SS{
    AA a;
    BB b;
    CC c;
    public void work(){
        a.run();
        b.store();
        c.connent();
    }
}



public class CombinationClass {

    public static void main(String[] args) {
        SS s=new SS();
        s.a=new AA();
        s.b=new BB();
        s.c=new CC();
        s.work();
    }
}
