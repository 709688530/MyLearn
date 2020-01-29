package com.example.day12.task02;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src.txt");
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream out = new FileOutputStream("des.txt");
        OutputStreamWriter osw = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(osw);
        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
        }
        br.close();
        bw.close();
    }
}
