package com.example.day07.task02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class KTVByArrayList {
    public static void main(String[] args) {
        sleep(500);
        System.out.println("=======欢迎来到点歌系统1.0========");
        sleep(500);
        System.out.println("0.添加歌曲至列表");
        sleep(500);
        System.out.println("1.将歌曲置顶");
        sleep(500);
        System.out.println("2.将歌曲前移一位");
        sleep(500);
        System.out.println("3.退出");
        sleep(500);
        ArrayList<Object> list = new ArrayList<>();
       // addMusicList(list);
        while (true){
            System.out.print("请输入要执行的操作序号：");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i){
                case 0:
                    addMusicList(list);
                    break;
                case 1:
                    setTop(list);
                    break;
                case 2:
                    setBefore(list);
                    break;
                case 3:
                    exit();
                    break;
                default:
                    System.out.println("============================");
                    System.out.println("功能选项有误，请输入正确的功能序号！");
                    break;
            }
            System.out.println("当前歌曲列表："+list);
        }
    }

    private static void addMusicList(ArrayList list){
        list.add("黄昏");
        list.add("田野");
        list.add("有一种爱叫放手");
        list.add("双截棍");
        list.add("忐忑");
    }
    private static void addMusic(ArrayList list){
        System.out.print("请输入您要添加的歌曲名称：");
        String s = new Scanner(System.in).nextLine();
        list.add(s);
    }
    private static void setTop(ArrayList list){
        System.out.print("请输入要置顶的歌曲：");
        String MusicName = new Scanner(System.in).nextLine();
        //nextLine()------将此扫描仪扫描到当前行，并返回跳过的输入。
        int i = list.indexOf(MusicName);
        if (i < 0){
            System.out.println("您输入的歌曲不在当前列表中！");
            updating();
            list.add(0,MusicName);
        }else{
            list.remove(MusicName);
            list.add(0,MusicName);
        }
    }
    private static void setBefore(ArrayList list){
        System.out.print("请输入要置前的歌曲名称：");
        String SetTopName = new Scanner(System.in).nextLine();
        int i = list.indexOf(SetTopName);
        if (i<0){
            System.out.println("您输入的歌曲不在当前列表中！");
            updating();
            list.add(SetTopName);
        }else if (i == 0){
            System.out.println("您输入的歌曲已是首曲！");
        }else {
            list.remove(i);
            list.add(i-1,SetTopName);
        }
    }
    private static void exit(){
        System.out.println("============退出中==============");
        System.out.println("您已退出系统！");
        System.exit(0);
    }
    private static void updating(){
        String[] arr = {"正在添加歌曲中。。。。"};
       // char[] arr = {'正','在','添','加','歌','曲','中','.','.','.'};
        for (int j = 0; j <arr.length ; j++) {
            System.out.print(arr[j]);
            sleep(300);
        }
        System.out.println();
    }
    private static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
