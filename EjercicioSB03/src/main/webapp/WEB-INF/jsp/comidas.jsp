<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sección de Comida</title>
</head>
<body>

<div>
<p>Introduce un Ingrediente</p>
</div>

<form:form action = "/recetasDeComida">

		<table>
			<tr>
				<td><input name="nombreIngred" type="text" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>



</body>
</html>