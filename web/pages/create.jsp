<%-- 
    Document   : create
    Created on : Mar 29, 2024, 3:17:27 PM
    Author     : ajpf
--%>

<%@page import="com.br.model.db.Create"%>
<%@page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%
    String name = request.getParameter("name");
    String priceStr = request.getParameter("price");
    String about = request.getParameter("about");
    
    double price = Double.parseDouble(priceStr);
    
    Create create =  new Create(name, price, about);
    create.write();
    
    response.sendRedirect("read.jsp");
%>