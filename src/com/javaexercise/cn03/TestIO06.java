package com.javaexercise.cn03;
//缓存字节流
//BufferedReader、BufferedWeater
import java.io.*;


public class TestIO06 {
    public static void main(String[] args) {
//        使用BufferedReader与BufferedWriter实现文本文件的复制
       FileReader fr=null;
       FileWriter fw=null;
        BufferedReader br=null;
        BufferedWriter bf=null;
        String tempstring="";
        try{
            fr=new FileReader("a.txt");
            fw=new FileWriter("e.txt");
            br=new BufferedReader(fr);
            bf=new BufferedWriter(fw);
            while ((tempstring=br.readLine())!=null){
                bf.write(tempstring);
                //下一次在写之前换行
                bf.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                //先关闭BufferedReader与BufferedWriter
                if (bf!=null){
                    bf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if (br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if (fw !=null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }try{
                if (fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
