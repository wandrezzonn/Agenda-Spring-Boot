<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda || Home</title>
</head>
<body>


<c:if test="${not empty msg }">
<div>${msg}</div>
</c:if>



<form action="salvar" method = "post">
<label>Nome</label>
<input type="text" name="nome" id="nome"><br><br>
<label>Telefone</label>
<input type="text" name="telefone" id="telefone"><br>
<input type="submit" value="Salvar"><br><br>
</form>
<h1>Contatos</h1>
<c:forEach items="${contato}" var="ctt">
Nome: <c:out value="${ctt.nome}"></c:out> <br>
Telefone: <c:out value="${ctt.telefone}"></c:out><br>
</c:forEach>
</body>
</html>