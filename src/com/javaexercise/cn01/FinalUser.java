package com.javaexercise.cn01;

public class FinalUser {
    final  int a=17;
//    public void  modify(){
//        this.a=18;//final定义后的内容不允许修改
//    }
    final void cc(){//final最后定义的方法不允许被子类重写
        System.out.println("哈哈");
    }

    public static void main(String[] args) {
        FinalUser fu =new FinalUser();
        fu.cc();
    }
}
