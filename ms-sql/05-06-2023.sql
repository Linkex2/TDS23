--
DECLARE @Valor1 as INT
DECLARE @Valor2 as INT

SET @Valor1 = 10
SET @Valor2 = 20

PRINT 'A SOMA É IGUAL A : '+ CAST((@Valor1 + @Valor2) AS varchar(20))

-- UM NUMERO INTEIRO NATURAL POSITIVO SERÁ INFORMADO EM UMA VARIAVEL
-- EXIBA NA TEL SE ESSE NUMERO É PAR OU IMPAR

-- Exercicio de If/Else, para ver se o numero é par ou impar
DECLARE @Valor3 as INT
SET @Valor3 = 12

IF (@Valor3 % 2) = 0
	BEGIN --é como abrir/fechar chaves no JavaScript, tambem pode usar " ; " no final do comando
		PRINT 'O número ' + Cast(@Valor3 as VarChar(20)) + ' é Par!'
	END
ELSE
	BEGIN
		PRINT 'O número ' + Cast(@Valor3 as VarChar(20)) + ' é Impar!'
	END

-- Estrutura de Repetição
DECLARE @Contador INT = 1
WHILE @Contador <= 100
	BEGIN
		PRINT 'CONTADOR : ' + Cast(@Contador as VarChar(10))
		SET @Contador = @Contador + 1
	END

/*
FAÇA UM PROGRAMA QUE ESCREVA UMA LISTAGEM DE NUMEROS NA TELA DE 1 A 100, POREM
QUANDO UM NUMERO FOR PAR, ESCREVA 'Contador: (Numero) = Par'
QUANDO UM NUMERO FOR IMPAR, ESCREVA 'Contador: (Numero) = Impar'
*/

DECLARE @Contador INT = 1
WHILE @Contador <= 100
	BEGIN
		IF (@Contador % 2) = 0
					PRINT 'O número ' + Cast(@Contador as VarChar(20)) + ' é Par!'
			ELSE
					PRINT 'O número ' + Cast(@Contador as VarChar(20)) + ' é Impar!'
	SET @Contador = @Contador + 1
	END

/*
 LISTA DE NUMEROS NA TELA DE 1 A 100 MOSTRANDO APENAS OS NUMEROS IMPARES, MULTIPLOS DE 3
 MOSTRA O SOMATÓRIO DESTES NUMEROS
*/

DECLARE @Contador as INT = 1
DECLARE @Total as INT = 0

WHILE @Contador <= 100
	BEGIN
		IF (@Contador % 2) = 1 AND (@Contador % 3) = 0
			PRINT 'O número ' + Cast(@Contador as VarChar(20)) + ' é Impar e Multiplo de 3'
			SET @Contador = @Contador + 1
		IF (@Contador % 2) = 1 AND (@Contador % 3) = 0 --Aqui nos lembramos o SQL que está condição existe, porque o programa tem alzeimer
			SET @Total = @Contador + @Total
	END
		PRINT 'A somatoria de tudo é: ' + Cast(@Total as VarChar(20))

/*
MOSTRE UMA LISTAGEM NA TELA DE 233 A 496
POREM ENTRE 300 e 400 OS NUMEROS AUMENTARAM DE 5 EM 5, FORA DISSO, OS NUMEROS AUMENTAM DE 3 EM 3
*/

DECLARE @Contador as INT = 233

WHILE @Contador <= 496
	BEGIN
		IF @Contador >= 300 AND @Contador <= 400
			BEGIN
				PRINT(@Contador)
				SET @Contador = @Contador + 5
			END
		ELSE
			BEGIN
				PRINT(@Contador)
				SET @Contador = @Contador + 3
			END
	END

/*
CRIAR UMA TABELA CHAMADA CAMPANHA QUE DEVE POSSUIR
ID CLIENTE - ID
PRIMEIRO NOME - NOME
EMAIL DO CLIENTE - EMAIL
BASEADO NO JOIN DAS TABELAS Person.Person
*/

SELECT * INTO Campanha FROM
(SELECT Email.BusinessEntityID, FirstName, Name.LastName, Email.EmailAddress
FROM Person.Person as Name
INNER JOIN Person.EmailAddress as Email
ON Name.BusinessEntityID = Email.BusinessEntityID) as Pain

ALTER TABLE Campanha
ADD Situation VarChar(20)
SELECT * FROM Campanha

DECLARE @ContaLinhas AS INT = 1
DECLARE @TotalLinhas AS INT

SELECT @TotalLinhas = COUNT (*) FROM Campanha

WHILE @ContaLinhas <= @TotalLinhas
BEGIN
	UPDATE Campanha
	SET Situation = 'Sent'
	WHERE FirstName like 'E%' and @ContaLinhas = BusinessEntityID
	SET @ContaLinhas += 1
END

Select * From Campanha
WHERE Situation is NULL