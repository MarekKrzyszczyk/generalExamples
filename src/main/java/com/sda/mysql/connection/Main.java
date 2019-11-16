package com.sda.mysql.connection;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/exercises?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC";
        String user = "root";
        String password = "Stasio17!";
        try {
            Connection myConnection = DriverManager.getConnection(url, user, password);
            Statement myStatement = myConnection.createStatement();
            String sql = "Select * from exercises.pracownicy";
            ResultSet rs = myStatement.executeQuery(sql);
//            while(rs.next()){
//                System.out.println(rs.getString("imie")+" " + rs.getString("nazwisko"));
//            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
