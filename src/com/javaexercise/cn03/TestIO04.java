package com.javaexercise.cn03;

//利用文件流实现文件的复制
//主要为字符
import java.io.*;
//FileReader  FileWriter  对字符流进行的处理
public class TestIO04 {
    public static void main(String[] args) throws IOException {
        FileReader fr=null;
        FileWriter fw=null;
        int len=0;
        try{
            fr=new FileReader("a.txt");
            fw=new FileWriter("c.txt",true);
            //设置缓存队列
            char[] buffer=new char[1024];
            //边读编写
            while ((len=fr.read(buffer))!=-1){
                fw.write(buffer,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (fw!=null){
                    fw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try{
                if(fr!=null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
