<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuario</title>
</head>
<body>
<input type="text" id="usuario" required>
<c:forEach var="listaUsuarios">
	<c:out var="usuario" items="${listaUsuarios}">
	</c:out>
</c:forEach>
<button type="submit">Validar</button>
<% %>
</body>
</html>