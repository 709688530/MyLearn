package com.example.day12.task02;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        FileWriter writer = new FileWriter("des.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        String str;
        while ((str = bufferedReader.readLine()) != null){
            bw.write(str);
            bw.newLine();
        }
        bufferedReader.close();
        bw.close();
    }
}
