<%-- 
    Document   : read
    Created on : Mar 25, 2024, 4:17:14 PM
    Author     : ajpf
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.br.model.db.Read"%>
<%@page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<head>
    <link rel="stylesheet" href="../css/style.css">
</head>
<nav>
        <a href="read.jsp">Read</a>
        <a href="../forms/formCreate.jsp">Create</a>
        <a href="../forms/formUpdate.jsp">Update</a>
        <a href="../forms/formDelete.jsp">Delete</a>
</nav>
<hr>
<h2>Read</h2>
<%
    
    
    Read read = new Read("SELECT * from produtos");
    ArrayList<String[]> results = read.getResults();
    
    for(String[] row: results){
        
        out.println("============================<br>");
        out.println("Nome: " + row[0] + "<br>");
        out.println("Preço: " + row[1] + "<br>");
        out.println("Descrição: " + row[2] + "<br>");
        out.println("Data de Cadastro: " + row[3] + "<br>");
        String dataAtualizacao = row[4]==null?"":row[4];
        out.println("Data de Atualização: " + dataAtualizacao + "<br>");
    }
%>
