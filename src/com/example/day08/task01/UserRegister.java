package com.example.day08.task01;

import com.example.day05.task05.Phone;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class UserRegister {
    public static HashSet<User> USER_DATA = new HashSet<User>();

    public static void main(String[] args) {
        initData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scanner.nextLine();
        System.out.print("请输入密码：");
        String password = scanner.nextLine();
        System.out.print("请重复密码：");
        String repassword = scanner.nextLine();
        System.out.print("请输入出生日期：");
        String birthday = scanner.nextLine();
        System.out.print("手机号码：");
        String telNumber = scanner.nextLine();
        System.out.print("电子邮箱：");
        String email = scanner.nextLine();

        CheckInfo checkInfo = new CheckInfo(USER_DATA);

        String result = checkInfo.checkAction(userName, password, repassword, birthday, telNumber, email);
        System.out.println("注册结果："+result);

    }
    private static void initData(){
        User user = new User("张三", "123", new Date(), "15352058999", "7096@qq.com");
        User user2 = new User("李四", "1233", new Date(), "15352058999", "7096@qq.com");
        USER_DATA.add(user);
        USER_DATA.add(user2);
    }
}
