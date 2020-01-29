package com.example.day10.task03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("source\\祁隆 - 放下所有放不下你.mp3");
        FileOutputStream out = new FileOutputStream("target\\祁隆 - 放下所有放不下你.mp3");

        int len;
        long l = System.currentTimeMillis();
        while ((len = in.read()) != -1 ){
            out.write(len);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("拷贝文件所消耗的时间是："+(endTime - l)/100 +"秒");
        in.close();
        out.close();
    }
}
