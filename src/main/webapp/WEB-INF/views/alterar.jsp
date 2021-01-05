<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Contato</title>
</head>
<body>
	<form action="alterar" method="post">
		<input type="hidden" value="${contato.id }" name="id"> <label>Nome</label>
		<input type="text" name="nome" id="nome" value="${contato.nome}">
		<br> <label>Telefone</label> <input type="text" name="telefone"
			id="telefone" value="${contato.telefone}"><br> <input
			type="submit" value="Salvar"> <br>

	</form>
</body>
</html>