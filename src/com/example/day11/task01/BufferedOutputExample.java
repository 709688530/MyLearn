package com.example.day11.task01;

import java.io.*;

public class BufferedOutputExample {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("des.txt")
        );
        int len;
        while ((len = bis.read()) != 1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
