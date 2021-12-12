package com.javaproject.cn;
//匿名内部类
public class anonomaousclass {
    public static  void test01(A a){
        a.aa();
    }

    public static void main(String[] args) {
        anonomaousclass.test01(new A(){
            public void aa(){
                System.out.println("哈哈");
            }
        });
    }

}

interface A{
    void aa();
}
