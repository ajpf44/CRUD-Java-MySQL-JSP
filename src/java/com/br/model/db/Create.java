/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.model.db;

import com.br.database.ConnectDB;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author ajpf
 */
public class Create {
    private String name,about;
    private double price;
    private Timestamp timestamp;
    
    public Create(String name, double price, String about){
        this.name = name;
        this.price = price;
        this.about = about;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }
    
    public void write(){
        try {
            Connection connection = ConnectDB.connect();
            
            String query = "INSERT INTO produtos (nome, preco, descricao, data_cadastro)"
                    + " VALUES(?,?,?,?)";
            
            PreparedStatement ps= connection.prepareStatement(query);
            
            ps.setString(1, this.name);
            ps.setDouble(2, this.price);
            ps.setString(3, this.about);
            ps.setTimestamp(4,this.timestamp);
            
            ps.executeUpdate();
            
            connection.close();
        } catch (SQLException err) {
            System.err.println("Error creating product: " + err.getMessage());
            
            err.printStackTrace();
        }
    }
}
