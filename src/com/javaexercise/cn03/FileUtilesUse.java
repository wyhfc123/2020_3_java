package com.javaexercise.cn03;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtilesUse {
    public static void main(String[] args) throws IOException {

        //读取文件
        String content = FileUtils.readFileToString(new File("d.txt"), "UTF-8");
        System.out.println(content);
//        String content= IOUtils.toString(new FileInputStream("d.txt"),"UTF-8");
//        System.out.println(content);
    }
}
