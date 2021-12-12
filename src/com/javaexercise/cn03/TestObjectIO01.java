package com.javaexercise.cn03;

import java.io.*;
import java.util.Date;

//ObjectInputStream/ObjectOutputStream的使用
public class TestObjectIO01 {

    public static void main(String[] args) {

        write();
        read();

    }
    /**使用对象输出流将数据写入文件*/
    public static void write(){
        // 创建Object输出流，并包装缓冲流，增加缓冲功能
        OutputStream os=null;

        BufferedOutputStream bos=null;
        ObjectOutputStream oos=null;
        try{
                os=new FileOutputStream(new File("a.txt"));
                bos=new BufferedOutputStream(os);
                oos=new ObjectOutputStream(bos);
                oos.writeInt(1);
                oos.writeDouble(2.1);
                oos.writeChar('a');
                oos.writeBoolean(true);
                oos.writeObject(new Date());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//关闭输出流
        if(oos != null){
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(bos != null){
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(os != null){
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void read(){
        InputStream is=null;
        BufferedInputStream bis=null;
        ObjectInputStream ois=null;
        try{
            is=new FileInputStream(new File("a.txt"));
            bis=new BufferedInputStream(is);
            ois=new ObjectInputStream(bis);
            System.out.println(ois.read());
            System.out.println(ois.readChar());
            System.out.println(ois.readDouble());
            System.out.println(ois.readInt());
            System.out.println(ois.readObject());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 关闭Object输入流
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
