package com.javaproject.cn;
//封装
public class TestEncapsualtion {
    public static void main(String[] args) {
        Humen humen = new Humen();


    }
}
class Humen{
    private int age;//完全私有化
    void sayAge(){
        System.out.println(age);
    }
}