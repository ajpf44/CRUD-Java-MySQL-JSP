<%-- 
    Document   : update
    Created on : Mar 29, 2024, 3:50:42 PM
    Author     : ajpf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "com.br.model.db.Update"%>

<%
    String name = request.getParameter("name");
    String priceStr = request.getParameter("price");
    String about = request.getParameter("about");
    
    double price = Double.parseDouble(priceStr);
    Update up = new Update(name, price, about);
    
    up.update();
%>