package com.br.database;

import java.sql.*;

public class ConnectDB {
    public static void connect(){
        String dbURL = "jdbc:mysql://localhost:3306/ExProduto";
        String username = "root";
        String password = "1234";

        try{
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected to db");
            
            connection.close();
            System.out.println("Connection closed");
        } catch(SQLException err){
            err.printStackTrace();
        }
    }
    
}

