<%-- 
    Document   : form
    Created on : Jan 31, 2017, 10:54:37 AM
    Author     : jstra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shape Calculator</title>
        <link href="geometry.css" rel = "stylesheet">
    </head>
    <body>
        <div class="center" id = "main">
            <h1> Rectangle </h1>
            <form id="form1" name="form1" method="POST" action="geometryCalculator">
            
                <table align="center">
                    <tr>
                        <td><input class="center" id="width" type="text" name="width" size="3" value="${width}"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><img src="resources/images/rect.png"</td>
                        <td><input id="length" type="text" name="length" size="3" value="${length}"></td>
                    </tr>
                </table>
                <input id="submit" type="submit" value="Submit"> 
            </form>
                        <h2>  Area = ${area}</h2>
             
        </div>
        
        
        
        
        
        
       
    </body>
</html>
