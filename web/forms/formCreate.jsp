<%-- Document : formCreate.jsp Created on : Mar 29, 2024, 2:56:19 PM Author : ajpf --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Create</title>
            <link rel="stylesheet" href="../css/style.css">
        </head>

        <body>
            <main>
                <h2> Create</h2>
                <form action="../pages/create.jsp">
                    <div>

                        <div class="input-container">
                            <label for="name">Name: </label>
                            <input type="text" name="name" id="name" required>
                        </div>

                        <div class="input-container">
                            <label for="price">Price</label>
                            <input type="number" name="price" id="price" step="any" required>
                        </div>

                        <div class="input-container">
                            <label for="about">About: </label>
                            <textarea name="about" id="about" cols="30" rows="10"></textarea>
                        </div>

                        <button class="submitButton">Create</button>
                    </div>
                </form>
            </main>
        </body>

        </html>