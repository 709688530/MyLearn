package com.example.day06.task02;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class SystemClass {
    //System类中常见的方法
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("hello world");
        //System.exit(0);//终止正在运行的Java虚拟机，参数status表示状态码，若非0表示异常终止
        System.gc();//进行垃圾回收
        long currentTimeMillis = System.currentTimeMillis();//返回以毫秒为单位的当前时间
        Properties properties = System.getProperties();//获取当前的系统信息

        String property = System.getProperty("os.name");//获取指定键描述的系统属性
        System.out.println(property);
        System.out.println(properties);

        {//System.arraycopy方法
            int[] fromArray = {1, 2, 3, 4, 5, 6};
            int[] toArray = {7, 8, 9, 10, 11, 12, 16, 17, 18};
            System.arraycopy(fromArray, 2, toArray, 3, 4);
            for (int i = 0; i < toArray.length; i++) {
                System.out.print(toArray[i] + " ");//7 8 9 3 4 5 6 17 18
            }
        }

        {//Runtime类
            Runtime runtime = Runtime.getRuntime();
            System.out.println("处理器的个数："+runtime.availableProcessors());
            System.out.println("空闲内存："+runtime.freeMemory()/1024/1024 + "M");//获得空闲内存大小
            System.out.println("最大可用内存："+runtime.maxMemory()/1024/1024 + "M");
            System.out.println("当前内存："+runtime.totalMemory()/1024/1024 +"M");
            Process process = runtime.exec("notepad.exe");//执行dos命令
            Thread.sleep(3000);
            process.destroy();
        }

        {//Math类的常用方法
            System.out.println("计算绝对值的结果："+Math.abs(-5));
            System.out.println("求大于参数的最小整数："+Math.ceil(5.36));
            System.out.println("求小于参数的最小整数："+Math.floor(9.6));
            System.out.println("四舍五入的结果："+Math.round(-2.1));
            System.out.println("求两个数较大值："+Math.max(5,8));
            System.out.println("求两个数较小值："+Math.min(5.10,2));
            System.out.println("生成一个大于等于0.0小于1.0随机数值："+Math.random());
        }

        {//Random
            Random random = new Random(13);//当Random()中有值时，每次生成的随机数相同。
            for (int i = 0; i <10 ; i++) {
                System.out.print(random.nextInt(100) + " ");
            }
        }

        {//包装类
            int a = 20;
            Integer.parseInt("20");//将字符串转化成int类型
            System.out.println("二进制形式："+Integer.toBinaryString(20));
            System.out.println("十六进制形式："+Integer.toHexString(20));
            System.out.println("八进制形式："+Integer.toOctalString(20));

            System.out.println(Integer.valueOf(20));//返回一个int值得Integer实例
            System.out.println(Integer.valueOf("20"));//返回保存指定的String的值的Integer对象
            System.out.println(Integer.parseInt("20"));//将字符串参数作为有符号的十进制整数进行解析
            
        }


    }

}
