<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lISTA DE USUARIOS</title>
</head>
<body>
<%@ page import="com.cadastrousuario.ben.*,com.cadastrousuario.dao.UsuarioDao, java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>lista de Usuários<h1>
<%
List<Usuario> list = UsuarioDao.getAllusuarios();
request.setAttribute("list", list);
%>

<table border =1>
<tr>
<th>id</th>
<th>nome</th>
<th>senha</th>
<th>email</th>
<th>sexo</th>
<th>pais</th>
</tr>
<c:forEach items="${list}" var="usuario">
<tr>
<td>${usuario.getId_usuario()}</td>
<td>${usuario.getNome()}</td>
<td>${usuario.getSexo()}</td>
<td>${usuario.getEmail()}</td>
<td>${usuario.getSenha()}</td>
<td>${usuario.getPais()}</td>
<td><a href="editForm.jsp?id=${usuario.getId_usuario()}">Editar</a></td>
<td>Excluir</td>
</tr>
</c:forEach>
</table>
<a href="">Adicionar Usuario</a>

</body>
</html>