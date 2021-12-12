package com.javaexercise.cn03;

import java.io.*;
import java.util.Arrays;

public class TestIO01 {
    public static void main(String[] args) throws IOException {
        //1、创建源
        File src=new File("D:\\JAVAWorkHome\\IdeaProjects\\javaproject\\src\\com\\javaexercise\\cn03\\2.txt");
        InputStream isa=null;
        //选择流
        try {
             isa =new FileInputStream(src);
//            操作数据（读取）
//            分段读取
            byte[] flush=new byte[1024];//缓冲容器
            int len=-1;
            while ((len= isa.read(flush))!=-1){
                System.out.println(Arrays.toString(flush));
                String str=new String(flush,0,len);
                System.out.println(str);
            }
//            int data1=isa.read();
//            System.out.println(data1);
//            //释放资源
//            isa.close();
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            isa.close();
        }
    }
}
