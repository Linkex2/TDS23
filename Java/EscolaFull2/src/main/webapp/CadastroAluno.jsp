<%@ page language="java" contentType="text/html; text/css; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="styles.css" type="text/css">
	<title>Cadastro Aluno</title>
</head>
<body>
<header>
<h1>Cadastro de Aluno</h1>
</header>
    <nav>
        <a href="index.jsp">Página Inicial</a>
        <a href="CadastroAluno.jsp" class="selected">Cadastro de Aluno</a>
        <a href="BuscarAluno.jsp">Buscar Aluno</a>
    </nav>
    <br>
	<div>
		<form method="post" action="AlunoServlet">
			<fieldset>
			<legend>Cadastro Aluno</legend>
			<div>
			<label>Nome: </label><input value="" id="nome" name="nome" value="${aluno.nome}" placeholder="Digite seu Nome."><br>
			<label>E-mail: </label><input value="" id="email" name="email" value="${aluno.email}" placeholder="Digite seu E-mail."><br>
			<label>Telefone: </label><input value="" class="telefone" id="telefone" name="telefone" value="${aluno.telefone}" placeholder="Digite seu Telefone."><br>
			<label>Data: </label><input value="" id="Data" class="data" name="Data" value="${aluno.Data}" placeholder="Digite a Data."><br>
			</div>
			<label>Escolha uma ação: </label>
			
				<select name="acao" required>
				<option selected value = "incluir">Incluir</option>
				<option selected value = "alterar">Alterar</option>
				<option selected value = "excluir">Excluir</option>
				<option selected value = "consultar">Consultar</option>
				</select>
			<input type="submit" value="Enviar">
			<input type="reset" value="Limpar"><br>
			
			</fieldset>
		</form>
	</div>

</body>
</html>