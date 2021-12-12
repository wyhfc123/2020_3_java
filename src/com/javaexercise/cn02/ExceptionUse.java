package com.javaexercise.cn02;


class  IllegalAgeException extends Exception{
    public IllegalAgeException(){

    }
    public IllegalAgeException(String message){
        super(message);
    }
}
public class ExceptionUse {
    //try catch  异常处理
    public static void main(String[] args) {
//        try{
//            System.out.println(1/0);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }finally {
//            System.out.println("哈哈");
//        }

    }
}
