<%@ page language="java" contentType="text/html; text/css; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Busca de Aluno</title>
	<link rel="stylesheet" href="styles.css" type="text/css">
</head>

<body>
<header>
<h1>Buscar Aluno</h1>
</header>
    <nav>
        <a href="index.jsp">Página Inicial</a>
        <a href="CadastroAluno.jsp">Cadastro de Aluno</a>
        <a href="BuscarAluno.jsp" class="selected">Buscar Aluno</a>
    </nav>
<img class="bob" src="imagens/Untitled.jpg">
	<div>
		<form method="post" action="AlunoServlet">
			<fieldset>
			<legend>Busca de Aluno</legend>
			<label>Matricula: </label><input value="" id="matricula" name="matricula" value="${aluno.matricula}" placeholder="Digite sua Matricula."><br>
			
			<label>Escolha uma ação: </label>
				<select name="acao" value="consultar" required>
				<option selected value = "consultar">Consultar</option>
				</select>
			<input type="submit" value="Enviar">
			<input type="reset" value="Limpar"><br>
			
			</fieldset>
		</form>
	</div>
<br>
<br>
<br>
<a class="pepperoni" href="https://www.youtube.com/watch?v=dQw4w9WgXcQ">Aluno Especial</a>
</body>
</html>