package com.javaexercise.cn01;

class Computer{
    String brand;
}



public class capture_three_exercise {
    int id;
    String name;
    int age;
    //comp类名
    Computer comp;
    void Study(){
        System.out.println(comp.brand);
    }


    public static void main(String[] args) {
//        Student s=new Student("1号楼");
//        s.Study();

        //模拟学生使用电脑学习
        capture_three_exercise cte=new capture_three_exercise();
        cte.name="小明";
        Computer comp1=new Computer();
        comp1.brand="联想";
        //将comp1类赋值给capture_three_exercise的comp值
        //相当于组合
        cte.comp=comp1;
        cte.Study();


    }

}
//class Student{
//
//    //类属性
//    int id=1;
//    String name="张三";
//    int age=18;
//    //构造方法
//    Student(String classroom){
////        this.classroom=classroom;
//    }
//    void Study(){
//        System.out.println(this.id);
//        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println("小明正在学习");
//    }
//}
