package com.javaproject.cn;



//定义接口（规范:子类实现父类方法）
public interface MyInterface {
    //接口里面只能定义常量

    /* 默认添加 public static final */ int MAXAGE=10;
    /* 默认添加 public abstract */void test01();
}

//子类继承接口
class MyClass implements MyInterface{
    //子类重写父类方法
    @Override
public void test01(){
    System.out.println(MAXAGE);
}

}