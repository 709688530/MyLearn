package com.example.day15.task03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class AdminDao {
    public ArrayList<FruitItem> queryAllData(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        ArrayList<FruitItem> list = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from fruit";
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                FruitItem fruitItem = new FruitItem();
                fruitItem.setNumber(rs.getString("number"));
                fruitItem.setName(rs.getString("fruitname"));
                fruitItem.setPrice(rs.getDouble("price"));
                fruitItem.setUnit(rs.getString("unit"));
                list.add(fruitItem);
            }
            Iterator<FruitItem> iterator = list.iterator();
            while (iterator.hasNext()){
                FruitItem next = iterator.next();
                System.out.println(next.number+"  "+next.name+"  "+next.price+"  "+next.unit);
            }
            return list ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs,stmt,conn);
        }
        return null;
    }
}
