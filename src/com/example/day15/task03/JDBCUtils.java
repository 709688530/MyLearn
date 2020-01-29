package com.example.day15.task03;

import java.sql.*;

public class JDBCUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://192.168.38.129:3306/jdbc";
        String user = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, user, password);
        if (!conn.isClosed()){
            System.out.println("连接成功！");
        }
        return conn;
    }

    public static void release(Statement stmt,Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt = null;
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

    public static void release(ResultSet rs,Statement stmt,Connection conm){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        release(stmt,conm);
    }
}
