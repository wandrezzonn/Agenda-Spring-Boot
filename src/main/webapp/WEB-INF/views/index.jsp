<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<script type="text/javascript" src="scrpit.js">

</script>
<meta charset="ISO-8859-1">
<title>Agenda || Home</title>
</head>
<body>
	<div class="container">


		<form action="salvar2" method="post">
			<label>Nome</label> <input type="text" name="nome" id="nome">
			<br> <label>Telefone</label> <input type="text" name="telefone"
				id="telefone"><br> <input type="submit" value="Salvar">
			<br>
			<div class="msg">
				<c:if test="${not empty mensagem  }">
                   ${mensagem}
                 </c:if>
			</div>
		</form>

		<h1>Contatos</h1>
		<table class="tabela" border=1>
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
						<td><a href="javascript:confirmar(${ctt.id})">Deletar</a> || <a href="alterar/${ctt.id}">Alterar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>