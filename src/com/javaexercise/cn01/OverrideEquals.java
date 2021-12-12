package com.javaexercise.cn01;

import java.util.Objects;

class  Person {
    int id;
    String name;
    //构造器
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //判断是否是同一个对象
    @Override
    public boolean equals(Object o) {
        if (o==null){
            return false;
        }else{
            if( o instanceof Person ){
                //强制类型转换
                Person c=(Person)o;
                if (c.id==this.id){
                    return true;
                }
            }
        }
        return false;
    }
}
//重写equals
public class OverrideEquals {
    public static void main(String[] args) {
        Person p=new Person(11,"你好");
        Person p1=new Person(11,"大家好");
        System.out.println(p==p1);//false
        System.out.println(p.equals(p1));

    }
}
