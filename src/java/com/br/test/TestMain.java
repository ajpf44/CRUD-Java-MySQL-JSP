/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.test;

import com.br.database.ConnectDB;
import com.br.model.db.Read;
import com.br.model.db.Create;

public class TestMain {
    public static void main(String[] args){
        testCreate();
        testConsult();
    }
    public static void testCreate(){
        Create create = new Create("Pear Phone",200.0,"Um telefone chines vagabundo");
        
        create.write();
    }
    public static void testConsult(){
        String query = "SELECT * from produtos";
        
        Read consult = new Read(query);
        
        for(String[] row: consult.getResults()){
            System.out.println("============================");
            System.out.println("Nome: " + row[0]);
            System.out.println("Preço: " + row[1]);
            System.out.println("Descrição: " + row[2]);
            System.out.println("Data de Cadastro: " + row[3]);
            System.out.println("Data de Atualização: " + row[4]);
        }
    }
}
