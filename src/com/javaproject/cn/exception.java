package com.javaproject.cn;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader=new FileReader("cookies.txt");
        System.out.println();
    }
}
