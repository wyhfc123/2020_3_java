package com.javaexercise.cn03;



import sun.plugin.javascript.navig.LinkArray;

import java.util.*;

//自定义泛型
// E:表示泛型;
//class MyCollection<E>{
//    Object[] objs=new Object[5];
//    //字符串方法
//    public E get(int index){
//        //返回的每一个值强行转换为字符串
//        return (E) objs[index];
//    }
//    //给数组添加字符串
//    public void set(E e,int index){
//        objs[index]=e;
//    }
//}
class Ainals{
    private int a=100;
    public void cc(){
        System.out.println("aa");
    }
}


public class TestGenerics {
    public static void main(String[] args) {
        //泛型类的使用
        //定义类的类型
//        MyCollection<String> mc=new MyCollection<>();
//        mc.set("123",0);
//        mc.set("456",1);
//        mc.set("111",3);
//        //直接返回字符串，不用强制类型转换
//        System.out.println(mc.get(1));


        // 以下代码中List、Set、Map、Iterator都是与容器相关的接口;

//        List<String> list=new ArrayList<>();
//        Set<Man> mans=new HashSet<>();
//        Map<Integer, Man> maps = new HashMap<Integer, Man>();
//        Iterator<Man> iterator = mans.iterator();
//
//
//
//        集合的使用
        Ainals a=new Ainals();
        //定义泛型为字符串，故只能添加字符串类型的值
//        List<String> list=new ArrayList<>();
//        List<String> list1=new ArrayList<>();
//        list1.add("1");
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        //获得对应索引的值
//        System.out.println(list.get(1));
//        System.out.println(list);
//        //返回布尔值
//        System.out.println(list.remove("2"));
//        System.out.println(list);
//        //判断容器中是否包含该元素
//        System.out.println(list.contains("1"));
//        //返回容器长度
//        System.out.println(list.size());
//        //清空容器
////        list.clear();
//        //判断容器是否为空
//        System.out.println(list.isEmpty());
//        //获得迭代器，用于遍历所有元素
//        System.out.println(list.iterator());
//        //本容器是否包含list1容器中的所有元素
//        System.out.println(list.containsAll(list1));
//        //将容器list1中的所有元素添加list容器中
//        System.out.println(list.addAll(list1));
//        //移除list容器中所有list1的元素
//        System.out.println(list.removeAll(list1));
//        //去除容器list和list1中都包含的元素，移除非交集元素
//        System.out.println(list.retainAll(list1));
//        list.toArray();


        //  1. 需要线程安全时，用Vector。
        Vector<String> vt =new Vector<>();
        //  不存在线程安全问题时，并且查找较多用ArrayList(一般使用它)
        ArrayList<String> al=new ArrayList<>();
        // 不存在线程安全问题时，增加或删除元素较多用LinkedList。
        LinkedList<String>ll=new LinkedList<>();


    }
}
