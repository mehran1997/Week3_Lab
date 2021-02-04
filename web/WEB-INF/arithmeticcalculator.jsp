<%-- 
    Document   : arithmeticcalculator
    Created on : Feb 1, 2021, 12:26:03 PM
    Author     : 842458
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="post" action="arithmetic">
            First: <input type="text" name="no1"> 
            <br>
            Second: <input type="text" name="no2"> 
                <br>
                <input type="submit" value="+"> 
                <input type="submit" value="-"> 
            <input type="submit" value="*"> 
            <input type="submit" value="%"> 
            <p>${message}</p>
            <p>Result: ${result}</p>
            
        </form>
    </body>
</html>
