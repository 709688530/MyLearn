package com.example.day08.task01;

import com.sun.source.tree.IfTree;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class CheckInfo {
    public static HashSet<User> USER_DATA = new HashSet<User>();
    public CheckInfo(HashSet<User> USER_DATA){
        this.USER_DATA = USER_DATA;
    }
    public String checkAction(String userName,String password,String rePassword,String birthday,String phone,String email){
        StringBuilder builder = new StringBuilder();
        int state = 1;
        if (!password.equals(rePassword)){
            builder.append("两次输入的密码不一致！");
            state = 2;
        }

        if (birthday.length() != 10){
            builder.append("生日格式不正确！");
            state = 2;
        }else {
            for (int i = 0; i < birthday.length(); i++) {
                char c = birthday.charAt(i);
                if (i ==4 || i ==7){
                    if (!(c =='-')){
                        builder.append("生日格式不正确！");
                        state = 2;
                    }
                }else {
                    if (!(Character.isDigit(c))){
                        builder.append("生日格式不正确！");
                        state = 2;
                    }
                }
            }
        }
        if (phone.length() != 11){
            builder.append("手机号码不正确！");
            state =2;
       }else if (!(phone.startsWith("13")||phone.startsWith("15")||phone.startsWith("17")||phone.startsWith("18"))){
            builder.append("手机号码不正确！");
            state = 2;
        }
        if (state ==1){
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date dateBirthday = null;
            try {
                dateBirthday = format.parse(birthday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            User newUser = new User(userName, rePassword, dateBirthday, phone, email);
            if (!USER_DATA.add(newUser)){
                builder.append("用户重复！");
                state = 2;
            }
            if (state == 1){
                builder.append("注册成功！");
            }
        }
        return builder.toString();
    }

}
