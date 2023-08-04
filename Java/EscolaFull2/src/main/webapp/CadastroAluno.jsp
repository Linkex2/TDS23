<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Aluno</title>
</head>
<body>
<div>
<form method="post" action="AlunoServlet">
<fieldset>
<legend>Cadastro Aluno</legend>
<label>Matricula: </label><input value="text" id="matricula" name="matricula" value="${aluno.matricula}" placeholder="Digite sua Matricula."><br>
<label>Nome: </label><input value="text" id="nome" name="nome" value="${aluno.nome}" placeholder="Digite seu Nome."><br>
<label>E-mail: </label><input value="text" id="email" name="email" value="${aluno.email}" placeholder="Digite seu E-mail."><br>
<label>Telefone: </label><input value="text" id="telefone" name="telefone" value="${aluno.telefone}" placeholder="Digite seu Telefone."><br>
<label>Data: </label><input value="text" id="Data" name="Data" value="${aluno.Data}" placeholder="Digite a Data."><br>

<label>Escolha uma ação</label>
<select name="acao" required>
<option selected value = "incluir">Incluir</option>
<option selected value = "alterar">Alterar</option>
<option selected value = "excluir">Excluir</option>
<option selected value = "consultar">Consultar</option>
</select>
<input type="submit" value="Enviar">
<input type="reset" value="Limpar"></br>

</fieldset>
</form>
</div>

</body>
</html>