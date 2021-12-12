package com.javaexercise.cn03;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
//HashMap: 线程不安全，效率高。允许key或value为null。
//HashTable: 线程安全，效率低。不允许key或value为null。
//在需要排序的Map时才选用TreeMap

//Map类似Python字典
public class TestMap {
    public static void main(String[] args) {
        //定义Map映射键值类型（定义泛型）
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        HashMap<Integer,String> hm1=new HashMap<Integer,String>();
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
        //存放键值对
        hm1.put(1,"哈哈");
        hm.put(1,"你好");
        hm.put(2,"aa");
        hm.put(3,"bb");
        hm.put(4,"cc");
        hm.put(5,"dd");
        //获取Map长度
        System.out.println(hm.size());
        //通过键查找多赢的值对象
        System.out.println(hm.get(1));
        //删除键对应的值
        System.out.println(hm.remove(4));
        //Map容器中是否包含键对象对应的键值对
        System.out.println(hm.containsKey(2));
        //Map容器中是否包含值对象对应的键值对
        System.out.println(hm.containsValue("cc"));
        //判断Map是否为空
        System.out.println(hm.isEmpty());
        //将hm1中所有键值对放入hm中
        hm.putAll(hm1);
        //清除Map
        hm.clear();


    }
}
