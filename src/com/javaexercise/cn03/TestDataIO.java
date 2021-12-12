package com.javaexercise.cn03;

//DataInputStream和DataOutputStream

import java.io.*;

public class TestDataIO {
    public static void main(String[] args) {
        DataOutputStream dos=null;
        DataInputStream dis=null;
        FileOutputStream fos=null;
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("a.txt");
            fos=new FileOutputStream("a.txt");
            //使用数据流对缓冲流进行包装，新增缓冲功能
            dos=new DataOutputStream(new BufferedOutputStream(fos));
            dis=new DataInputStream(new BufferedInputStream(fis));
            //将如下数据写入到文件中
            dos.writeChar('a');
            dos.writeInt(10);
            dos.writeDouble(11.0);
            dos.writeBoolean(true);
            dos.writeUTF("哈哈哈");
            //手动刷新缓冲区：将流中数据写入到文件中
            dos.flush();
            System.out.println("char: " + dis.readChar());
            System.out.println("int: " + dis.readInt());
            System.out.println("double: " + dis.readDouble());
            System.out.println("boolean: " + dis.readBoolean());
            System.out.println("String: " + dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
