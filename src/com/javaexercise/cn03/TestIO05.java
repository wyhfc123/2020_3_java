package com.javaexercise.cn03;
//缓存字节流

import java.io.*;

//FileReader  FileWriter  对字符流进行的处理
public class TestIO05 {
    public static void main(String[] args) throws IOException {
        // 使用缓冲字节流实现复制
        long time1=System.currentTimeMillis();
        CopyFile1("a.txt","d.txt");
    }
    /**缓冲字节流实现的文件复制的方法*/
    static void CopyFile1(String src,String dec){
        FileInputStream fis=null;
        BufferedInputStream bfis=null;
        FileOutputStream fos=null;
        BufferedOutputStream bfos=null;
        int temp=0;
        try{
            fis=new FileInputStream(src);
            fos = new FileOutputStream(dec);
            //缓存输入流直接使用文件输入流（此方法将不再需要缓存数组）
            bfis=new BufferedInputStream(fis);
                bfos=new BufferedOutputStream(fos);

                while ((temp=bfis.read())!=-1){
                    bfos.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
         try{
             //后开先关闭
                if (bfis!=null){
                    bfis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }try{
                if (bfos!=null){
                    bfos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if (fis !=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }try{
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
