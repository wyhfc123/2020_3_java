package com.javaexercise.cn03;

//利用文件流实现文件的复制
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestIO03 {
    public static void main(String[] args) {
        CopyFile("a.txt","b.txt");


    }
    static void CopyFile(String src,String dec){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        //为了提高效率，设置缓存数组！（读取的字节数据会暂存放到该字节数组中）
        byte[] buffer=new byte[1024];
        int temp=0;
        try{
            //要拷贝的文件，输入流
         fis=new FileInputStream(src);
            //对应拷贝的文件，输出流
         fos=new FileOutputStream(dec);
        //边读边写
        //temp指的是本次读取的真实长度，temp等于-1时表示读取结束
            //从缓存数组中读取固定长度的数据
            while ((temp=fis.read(buffer))!=-1){
                fos.write(buffer,0,temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //两个流需要分别关闭
            try{
                //只有不为空的时候关
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }try{
                //只有不为空的时候关
                if (fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
