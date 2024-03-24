package com.br.database;

import java.sql.*;

public class ConnectDB {
    public static Connection connect(){
        String dbURL = "jdbc:mysql://localhost:3306/ExProduto";
        String username = "root";
        String password = "1234";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Could not find the JDBC driver: " + e.getMessage());
            
            e.printStackTrace(); //To help debbuing our code
        }   
        
        try{
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected to db");
            
            return connection;
        } catch(SQLException err){
            err.printStackTrace();
        }
        
        return null;
    }
    
}

