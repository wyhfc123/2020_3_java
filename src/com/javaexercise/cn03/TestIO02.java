package com.javaexercise.cn03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO02 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        String string="哈哈哈";
        try{
            //写入a.txt文件中，追加
            fos=new FileOutputStream("a.txt",true);
            //调用write方法写入  string.getBytes():将字符串转为Bytes数组
            fos.write(string.getBytes());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos!=null){
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
