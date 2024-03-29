<%-- 
    Document   : delete.jsp
    Created on : Mar 29, 2024, 3:43:54 PM
    Author     : ajpf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "com.br.model.db.Delete"%>
<%
    String name = request.getParameter("name");
    Delete del =  new Delete(name);
    del.delete();
    
    response.sendRedirect("read.jsp");
%>
