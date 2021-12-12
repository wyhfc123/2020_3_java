package com.javaexercise.cn02;
class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) throws IllegalAgeException{
        if (age<0){
            throw new IllegalAgeException("人的年龄不应该是负数");
        }
        this.age=age;
    }
    public String toSting(){
        return "name is"+name+"and age is"+age;
    }
}
public class TestMyException {

    public static void main(String[] args) {

        Person p=new Person();
        try{
            p.setName("张三");
            p.setAge(-1);
        }catch (IllegalAgeException e){
            e.printStackTrace();
            System.exit(-1);

        }
        System.out.println(p);
    }

}
