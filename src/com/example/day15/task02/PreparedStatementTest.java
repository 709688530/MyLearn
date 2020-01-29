package com.example.day15.task02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preStmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://192.168.38.129:3306/jdbc";
            String user ="root";
            String pw = "1234";
            conn = DriverManager.getConnection(url, user, pw);
            String sql = "INSERT INTO users(name,password,email,birthday)"+"VALUES(?,?,?,?)";
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1,"zsssl");
            preStmt.setString(2,"123456");
            preStmt.setString(3,"7096@qq.com");
            preStmt.setString(4,"1798-07-08");

            preStmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preStmt != null){
                try {
                    preStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                preStmt = null;
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}
