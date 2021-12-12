package com.javaexercise.cn03;

import java.io.*;

//序列化与反序列化
//Person类实现Serializable接口后，Person对象才能被序列化
class Person implements Serializable {
    private static final long serialVersionUID=1L;
    int age;
    boolean isMan;
    String name;
    //构造器的实现
    public Person(int age, boolean isMan, String name) {
        super();
        this.age = age;
        this.isMan = isMan;
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Person [age=" + age + ", isMan=" + isMan + ", name=" + name + "]";
    }
}
public class TestIoSerialize {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            // 通过ObjectOutputStream将Person对象的数据写入到文件中，即序列化。
            Person person=new Person(18, true, "高淇");
            //序列化好返学序列化是指将输入文件和输出文件转化为ObjectOutputStream
            // 序列化
            fos=new FileOutputStream("b.txt");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.flush();
            // 反序列化
            fis=new FileInputStream("b.txt");
            // 通过ObjectInputStream将文件中二进制数据反序列化成Person对象：
            ois=new ObjectInputStream(fis);
            Person p=(Person)ois.readObject();
            System.out.println(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
