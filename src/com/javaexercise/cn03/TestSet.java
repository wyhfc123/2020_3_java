package com.javaexercise.cn03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
////        创建Set对象（实际创建Set对象子类HashSet）
//        Set<String> s=new HashSet<>();
//        s.add("aa");
//        s.add("bb");
//        s.add("cc");
//
        //转为迭代器遍历
//        Iterator iter=s.iterator()：创建iter迭代器   iter.hasNext();调用该迭代器下个元素
//        for(Iterator iter=s.iterator();iter.hasNext();){
//            System.out.println((String)iter.next());
//        }
//        System.out.println(s);
//        //由于是二叉树，需要对元素做内部排序。 如果要放入TreeSet中的类没有实现Comparable接口，则会抛出异常：java.lang.ClassCastException。
//        Set<String> s1=new TreeSet<>();
//
//        //迭代器的使用(只有搭配容器才能使用)
//        List<String> aList = new ArrayList <String>();
//        //将容器aList转换为迭代器
//        Iterator<String> iter=aList.iterator();
//        //调用容器中下一个元素
//        iter.hasNext();
//        //删除容器中的元素
//        iter.remove();

//        Map<String, String> map = new HashMap<String, String>();
//        map.put("A", "高淇");
//        map.put("B", "高小七");
//        //map.entrySet():将Map中的键对应其中的值
//        Set<Map.Entry<String, String>> ss = map.entrySet();
//        //[A=高淇, B=高小七]
//        System.out.println(ss);
//        //定义迭代器
//        for (Iterator<Map.Entry<String, String>> iterator = ss.iterator(); iterator.hasNext();) {
//            Map.Entry<String, String> e = iterator.next();
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//            System.out.println(e.getKey() + "--" + e.getValue());
//        }

        List<String> s=new ArrayList<>();
        for (int i=0;i<10;i++){
            s.add("赞"+i);
        }
        Collections.shuffle(s);
        System.out.println(s);
        //对Collection容器元素进行排序
       Collections.sort(s);
        System.out.println(s);
       //翻转Collection容器元素
       Collections.reverse(s);
        System.out.println(s);
        //填充Collection容器元素
        Collections.fill(s,"hello");
        System.out.println(s);
        // 对于顺序的List容器，采用折半查找的方法查找特定对象。
        Collections.binarySearch(s,"hello");
        System.out.println(s);

    }
}
