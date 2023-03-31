<%-- 
    Document   : iniciar.jsp
    Created on : 30 mar 2023, 00:21:10
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/style.css">
    </head>
    <body>
        <form action="SvInicio" method="post">
        <label class="titu">Iniciar sesión</label>
        <br><br>
        <label for="usuario" Class="Usu">Usuario</label>
        <br>
        <input type="text" value="" id="inputusuario" name="usuario">
        <br><br>
        <label for="correo" class="Corre">Numero de cuenta</label>
        <br>
        <input type="text" value="" id="inputcorreo" name="nocuenta">
        <br><br>
        <label for="contra" class="Contra" pattern="[a-zA-Z0-9!#$%&'/=?^_`{|}~+-]([.]?[a-zA-Z0-9!#$%&'/=?^_`{|}~+-])+@[a-zA-Z0-9]([^@&%$/()=?¿!.,:;]|\d)+[a-zA-Z0-9][.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?" required>Contraseña</label>
        <br>
        <input type="password" value="" id="inputcontra" name="contra1">
        <br><br>        
        <input type="submit" id="boton2" value="Iniciar Sesión">
        <br>
        <p class="link"><a href="./registrar.html">¿No tienes cuenta? Regístrate</a></p>
        </form>
    </body>
</html>
