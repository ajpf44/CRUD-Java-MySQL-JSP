package com.br.model.db;
import com.br.database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Update {
    private String name,about;
    private double price;
    private Timestamp timestampUpdate;
    
    public Update(String name, double price, String about){
        this.name = name;
        this.price = price;
        this.about = about;
        this.timestampUpdate = new Timestamp(System.currentTimeMillis());
    }
    
    public void update(){
        try {
            Connection connection = ConnectDB.connect();
            
            String query = "UPDATE produtos SET preco=?,descricao=?,data_atualizacao=? WHERE nome=?";
            
            PreparedStatement ps= connection.prepareStatement(query);
            
            ps.setDouble(1, this.price);
            ps.setString(2, this.about);
            ps.setTimestamp(3,this.timestampUpdate);
            ps.setString(4, this.name);
            
            ps.executeUpdate();
            
            connection.close();
        } catch (SQLException err) {
            System.err.println("Error creating product: " + err.getMessage());
            
            err.printStackTrace();
        }
    }
}
