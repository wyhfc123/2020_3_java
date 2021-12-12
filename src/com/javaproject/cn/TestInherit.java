package com.javaproject.cn;

public class TestInherit {
    public static void main(String[] args) {
        Students stu=new Students();
        stu.introduce();
        stu.intro();


    }
}
class School{
    String name="山海一种";
    public void introduce(){
        System.out.println(this.name);
    }

}

class Students extends School{
    String name="张三";
    int age=17;
    public void intro(){
        System.out.println(name);
        System.out.println(age);
    }


}