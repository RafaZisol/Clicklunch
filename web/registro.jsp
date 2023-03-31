<%-- 
    Document   : registro.jsp
    Created on : 30 mar 2023, 00:21:37
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/style.css">
        <script src="./js/valid.js"></script>
    </head>
    <body>
        <label><h1>Registrar</h1></label>
    <form action="SvCliente" method="post">
            <label for="usuario" class="Usu">Usuario</label>
            <br><br>
            <input type="text" value="" id="inputusuario" name="nombre">
            <br><br>
            <label for="correo" class="Corre">Correo</label>
            <br><br>
            <input type="email" value="" id="inputcorreo" name="correo">
            <br><br>
            <label for="contra" class="Contra">Contraseña</label>
            <br><br>
            <input type="password" value="" id="inputcontra" name="contra">
            <br><br>
            <label for="contra1" class="Contra2">Confirmar contraseña</label>
            <br><br>
            <input type="password" value="" id="inputcontra1" name="contra1">
            <br><br>
            <div>
                <input type="submit" id="boton1" value="Registrarse" onclick="contras()"/>
            </div>
            
            <br>
    </form>
        <p><a href="./iniciar.jsp">¿Ya tienes cuenta? Inicia sesión</a></p>
    </body>
</html>
