package com.javaproject.cn;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileReader;
import java.io.IOException;

public class exception02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=null;

        try {
            fileReader = new FileReader("cookies.txt");
            char c1=(char)fileReader.read();
            System.out.println(c1);
        }catch (Exception e){
            //追踪异常
//            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }
}
