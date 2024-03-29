<%-- 
    Document   : formCreate.jsp
    Created on : Mar 29, 2024, 2:56:19 PM
    Author     : ajpf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>
        <main>
            <h2>Update</h2>
            <form action="../pages/update.jsp">
                <div>
                    <div class="input-container">
                        <label for="name">Name: </label>
                        <input type="text" name="name" id="name">
                    </div>

                    <div class="input-container">
                        <label for="price">Price</label>
                        <input type="number" name="price" id="price">
                    </div>

                    <div class="input-container">
                        <label for="about">About: </label>
                        <textarea name="about" id="about" cols="30" rows="10"></textarea>
                    </div>

                    <button class="submitButton">Update</button> 
                </div>
            </form>
        </main> 
    </body>
</html>
