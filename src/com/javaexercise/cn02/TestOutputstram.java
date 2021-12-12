package com.javaexercise.cn02;

import java.io.*;

public class TestOutputstram {

    public static void main(String[] args) {
        //创建源
        File f=new File("3.txt");
        //选择流
        OutputStream os=null;
        try{
            //将源传进去
            os=new FileOutputStream(f,true);
            String msg="avchjsdbjhcs";
            //操作，写出
            byte[] b=msg.getBytes();//字符串---->字节数组
            os.write(b,0,b.length);
            os.flush();


        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
