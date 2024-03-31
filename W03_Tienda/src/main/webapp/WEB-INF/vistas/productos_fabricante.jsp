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
<title>Tienda</title>
<link rel="stylesheet" href="css/index.css" >

<script type="text/javascript">
	window.onload = function(){
		document.getElementById("idFabricante").addEventListener("change", 
			function(){
				this.form.submit();
			});
		};
</script>

</head>
<body>
	<div class="cabecera">
		<h2>Productos del fabricante</h2>
	</div>
	<div id="contPrincipal">
		<form action="productos_fabricante" method="post">
			
			<select id="idFabricante" name="idFabricante">
				<c:if test= "${empty fab_actual}">
					<option>Seleccione Fabricante</option>
				</c:if>
				<c:forEach var="fab" items="${fabs}">
					<option value="${fab.idFabricante}" ${fab_actual.idFabricante == fab.idFabricante?'selected':''}>
					${fab.fabricante}</option>
				</c:forEach>
			</select>
		</form>
		
		<c:if test="${not empty prods}">
			
				<table id="tabla_datos" class="datos">
					<thead>
						<tr>
							<th>Descripcion</th>
							<th>Precio</th>
							<th>Fabricante</th>							
						</tr>
					</thead>
					<tbody>
						<c:forEach var="prod" items="${prods}">
							<tr>
								<td>${prod.producto}</td>
								<td>${prod.precio}</td>
								<td>${prod.fabricante.fabricante}</td>							
							</tr>
						</c:forEach>
					</tbody>
				</table>
		</c:if>
		<a href="home"><button>Volver</button></a>
	</div>
	</div>
</body>
</html>