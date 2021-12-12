package com.javaexercise.cn03;

import java.io.*;


public class TestIO07 {
    public static void main(String[] args) {
//将字符串转变成字节数组
       byte[] b="abcdefg".getBytes();
        test(b);

    }
    public static void test(byte[] b){
        ByteArrayInputStream bais=null;
        StringBuilder sb=new StringBuilder();
        int temp=0;
        int num=0;
        try{
            bais = new ByteArrayInputStream(b);
            while ((temp=bais.read())!=-1){
                sb.append((char)temp);
                num++;
            }
            System.out.println(sb);
            System.out.println("读取的字节数：" + num);
        }finally {
            try {
                if (bais != null) {
                    bais.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
