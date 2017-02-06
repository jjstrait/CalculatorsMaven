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
            <form id="form1" name="formRect" method="POST" action="geometryCalculator?shapeType=rect">
            
                <table align="center">
                    <tr>
                        <td>W=<input class="" id="widthRect" type="text" name="widthRect" size="3" value="${widthRect}"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><img src="resources/images/rect.png"</td>
                        <td>L=<input id="lengthRect" type="text" name="lengthRect" size="3" value="${lengthRect}"></td>
                    </tr>
                </table>
                <input id="submit" type="submit" value="Submit"> 
            </form>
                        <h2>  Area L*W = ${areaRect}</h2>
             
            <h1> Circle </h1>
            <form id="form2" name="form2" method="POST" action="geometryCalculator?shapeType=circle">
            
                <table align="center">
                    
                    <tr>
                        <td><img src="resources/images/circle.png"</td>
                        <td>r=<input id="radius" type="text" name="radius" size="3" value="${radius}"></td>
                    </tr>
                </table>
                <input id="submit" type="submit" value="Submit"> 
            </form>
                        <h2>  Area &pi;*r<sup>2</sup> = ${areaCircle}</h2>
                        
            
            <h1> Triangle </h1>
            <form id="form3" name="form3" method="POST" action="geometryCalculator?shapeType=triangle">
            
                <table align="center">
                     
                    <tr>
                        <td>a=<input class="" id="a" type="text" name="a" size="3" value="${a}"></td>
                        <td><img src="resources/images/triangle.gif"></td>
                       
                    </tr>
                    <tr>
                        <td></td>
                        <td>b=<input class="" id="b" type="text" name="b" size="3" value="${b}"></td>
   
                    </tr>
                </table>
                <input id="submit" type="submit" value="Submit"> 
            </form>
                        <h2>  a<sup>2</sup>+b<sup>2</sup> = c<sup>2</sup> = ${hypotenuse}</h2>
        </div>
     
    </body>
</html>
