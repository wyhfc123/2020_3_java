package com.javaexercise.cn03;

//线程使用，继承Thread类
//class TestThreads extends Thread{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println(this.getName() + ":" + i);//getName()方法是返回线程名称
//        }
//    }
//    }
//通过Runnable接口实现多线程
class TestThreads02 implements Runnable{//自定义类实现Runnable接口；
    //run()方法里是线程体；
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
//        TestThreads thread1 = new TestThreads();//创建线程对象
//        thread1.start();//启动线程
//        TestThreads thread2 = new TestThreads();//创建线程对象
//        thread2.start();
        //创建线程对象，把实现了Runnable接口的对象作为参数传入；
        Thread thread1 = new Thread(new TestThreads02());
        thread1.start();//启动线程；
        Thread thread2 = new Thread(new TestThreads02());
        thread2.start();
    }
}
