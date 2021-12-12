package com.javaexercise.cn03;

import java.io.*;
//缓存流
//使用InputStreamReader接收用户的输入，并输出到控制台
public class TestBuffer {
    public static void main(String[] args) {
        // 创建字符输入和输出流:使用转换流将字节流转换成字符流
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            bw=new BufferedWriter(new OutputStreamWriter(System.out));
            String str=br.readLine();
            while(!"exit".equals(str)){
                // 写到控制台
                bw.write(str);
                bw.newLine();// 写一行后换行
                bw.flush();// 手动刷新
                str=br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 关闭字符输入和输出流
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
