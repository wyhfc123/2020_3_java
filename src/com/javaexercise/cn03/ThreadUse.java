package com.javaexercise.cn03;

//class TestThreadCiycle implements Runnable{
//
//}
public class ThreadUse implements Runnable{
    //定义线程名字
    String name;
    boolean live=true;//线存活状态
    //构造器
    public ThreadUse(String name){
        super();
        this.name=name;
    }
    public void run(){
        int i = 0;
        //当live的值是true时，继续线程体；false则结束循环，继而终止线程体；
        while (live) {
            System.out.println(name + (i++));
        }
    }
    public void terminate(){
        live=false;
    }
    public static void main(String[] args) {
        ThreadUse ttc = new ThreadUse("线程A:");
        Thread t1=new Thread(ttc);
        t1.start();
        for (int i=0;i<100;i++){
            System.out.println("主线程开启"+i);
        }
        ttc.terminate();
        System.out.println("ttc stop!");

    }

}
