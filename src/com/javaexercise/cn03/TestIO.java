package com.javaexercise.cn03;

import java.io.*;
import java.sql.Connection;
public class TestIO {
    public static void main(String[] args) {
        try{
            InputStream ist=new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };
            System.out.println(ist.read());
            File f=new File("1.txt");
            System.out.println(f.listFiles());
            System.out.println(f.list());
            System.out.println(f.getName());
            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.exists());
            System.out.println(f.isDirectory());
            System.out.println(f.isFile());
            System.out.println(f.isAbsolute());

//            FileInputStream fis=new FileInputStream("D:\\JAVAWorkHome\\IdeaProjects\\javaproject\\src\\com\\javaexercise\\cn03\\1.txt");
//            int s1=fis.read();
//            System.out.println(s1);
//            fis.close();
        }catch (Exception e
        ){e.printStackTrace();
        }
    }
}
