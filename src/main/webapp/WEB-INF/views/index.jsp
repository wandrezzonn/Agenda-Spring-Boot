<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda || Home</title>
</head>
<body>
<div class="msg">
<c:if test="${not empty mensagem }">
<c:out value="${mensagem}"></c:out>
</c:if>
</div>

	<form action="salvar" method="post">
		<label>Nome</label> <input type="text" name="nome" id="nome" >
		<br> <label>Telefone</label> <input type="text" name="telefone"
			id="telefone"><br> <input type="submit" value="Salvar">
		<br>
	</form>

	<h1>Contatos</h1>
	<table border=1>
		<thead>
			<tr>
				<th scope="col">Nome</th>
				<th scope="col">Telefone</th>
				<th scope="col">Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contato}" var="ctt">
				<tr>
					<td>${ctt.nome}</td>
					<td>${ctt.telefone}</td>
					<td><a href="">Deletar</a> || <a href="">Alterar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>