/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.model.db;

import com.br.database.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consult {
    private final Connection connection;
    private final String query;
    private ArrayList<String[]> results = new ArrayList<>();
    public Consult(String query){
        this.connection = ConnectDB.connect();      
        this.query = query;
    }
    
    public ArrayList<String[]> getResults(){
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String[] row = {
                    rs.getString("nome"),
                    rs.getString("preco"),
                    rs.getString("descricao"),
                    rs.getString("data_cadastro"),
                    rs.getString("data_atualizacao")
                };
                
                results.add(row);
            }
            
            
        }catch(SQLException err){
            System.err.println("Error on consulting table: " + err.getMessage());
            
            err.printStackTrace();
        }
        
        return results;
    }
}
