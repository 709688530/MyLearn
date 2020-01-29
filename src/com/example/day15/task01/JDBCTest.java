package com.example.day15.task01;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url="jdbc:mysql://192.168.38.129:3306/jdbc";
        String user ="root";
        String passwd = "1234";
        Connection connection = DriverManager.getConnection(url, user, passwd);
        if (!connection.isClosed()){
            System.out.println("连接成功！");
        }
        Statement statement = connection.createStatement();
        String sql ="select  * from users";
        ResultSet rs = statement.executeQuery(sql);
        System.out.println("id | name | password"+"| email | birthday");
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String password = rs.getString("password");
            String email = rs.getString("email");
            Date birthday = rs.getDate("birthday");
            System.out.println(id +"  | "+ name +"   | "+ password+"     | "+ email +"   | "+ birthday);
        }
        rs.close();
        statement.close();
        connection.close();

    }
}
