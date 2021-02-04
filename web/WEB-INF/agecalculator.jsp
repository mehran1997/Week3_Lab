<%-- 
    Document   : agecalculator
    Created on : Jan 27, 2021, 5:05:47 PM
    Author     : 842458
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" id =age">
            <br>
            <p>${message}</p>
            <p>${age_message}</p>
            <input type="submit" value="Age Next Birthday"> 
            
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
