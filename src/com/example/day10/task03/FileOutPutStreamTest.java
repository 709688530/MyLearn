package com.example.day10.task03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("example.txt",true);
        String str = "\n欢迎你！";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();
    }
}
