<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="nombre" content="contenido">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registro</title>
<link rel="stylesheet" href="css/login.css" >
</head>
<body>
	<div class="cabecera">
		<h2>Acceso Usuarios</h2>
	</div>
	<div class="cuerpo">
		<form action="login" method="post">
			<input id="usr" name="usuario" placeholder="Usuario" />
			<input id="pwd" name="password" placeholder="Password" type="password" />
			<input type="submit" value="Login">
		</form>
	</div>
	<div>
		<p id="error">
			<c:if test ="${error eq 'usr'}">
				El usuario no existe
			</c:if>
			<c:if test ="${error eq 'pass'}">
				Contraseña incorrecta
			</c:if>
		</p>
	</div>
</body>
</html>