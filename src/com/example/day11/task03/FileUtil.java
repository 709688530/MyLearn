package com.example.day11.task03;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {
    public static final String SEPARATE_FIELD = ",";
    public static final String SEPARATE_LINE = "\r\n";

    public static void saveBooks(Books books){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String name = "销售记录"+format.format(date)+".csv";
        InputStream in = null;
        try {
            in = new FileInputStream(name);
            if(in != null){
                in.close();
                creatFile(name,true,books);
            }
        } catch (FileNotFoundException e) {
            creatFile(name,false,books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void creatFile(String name,boolean label,Books books){
        BufferedOutputStream out = null;
        StringBuffer sbf = new StringBuffer();

        try {
            if(label){
                out = new BufferedOutputStream(new FileOutputStream(name,true));
            }else {
                out = new BufferedOutputStream(new FileOutputStream(name));
                String[] fieldSort = {"图书编号", "图书名称", "购买数量", "单价", "总价", "出版社"};

                for (String fieldKey:fieldSort
                     ) {
                    sbf.append(fieldKey).append(SEPARATE_FIELD);
                }
            }
            sbf.append(SEPARATE_LINE);
            sbf.append(books.id).append(SEPARATE_FIELD);
            sbf.append(books.name).append(SEPARATE_FIELD);
            sbf.append(books.number).append(SEPARATE_FIELD);
            sbf.append(books.price).append(SEPARATE_FIELD);
            sbf.append(books.money).append(SEPARATE_FIELD);
            sbf.append(books.Publish).append(SEPARATE_FIELD);
            String str = sbf.toString();
            byte[] b = str.getBytes();
            for (int i = 0; i < b.length; i++) {
                out.write(b[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
