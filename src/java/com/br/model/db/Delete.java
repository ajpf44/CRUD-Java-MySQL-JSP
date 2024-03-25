/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.model.db;

import com.br.database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    private String name;
    private final String query = "DELETE FROM produtos WHERE nome=?";
    public Delete(String name){
        this.name = name;
    }
    
    public void delete(){
        try {
            Connection connection = ConnectDB.connect();
        
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,this.name);
        
            ps.executeUpdate();
            
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error deleting: " + e.getMessage());
            
            e.printStackTrace();
        }
    }
}
