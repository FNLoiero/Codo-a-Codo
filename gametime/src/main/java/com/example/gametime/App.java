package com.example.gametime;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.gametime.db.ConnectorDB;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Statement st = ConnectorDB.getSt();
        try {
            ResultSet rs = st.executeQuery("Select * from juegos");
            while (rs.next()) {
                System.out.println(rs.getString("titulo"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
