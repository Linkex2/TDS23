/*SE SALARIO
<= 2.500 = ISENTO
Caso for > 2.500
 25% -- Calculo de % � igual � VALOR * 0.25*/

 DECLARE @Valor as INT
 SET @Valor = 10000

 IF (@Valor) <= 2.500
	PRINT 'Voc� est� insento'
ELSE
	BEGIN
		PRINT '25% de Imposto = ' +CAST((@Valor * 0.25) AS VarChar(10))
		PRINT 'Salario Liquido = ' +CAST((@Valor - (@Valor * 0.25)) AS VarChar(10))
	END

DECLARE @Contador  INT = 1
DECLARE @Numero  INT = 0
DECLARE @Total  INT = 0
SET @Numero = 100

WHILE @Contador < @Numero
BEGIN
-- A primeira condi��o deste IF filtra os numeros por Impar (multiplos de 2 que, enquanto a segundas filtra os multiplos de 3
	IF (@Contador % 2) = 1 AND (@Contador % 3) = 0
		BEGIN
			PRINT @Contador
		END
	IF (@Contador % 2) = 0
		BEGIN
			SET @Total = @Total + @Contador
		END
	
	SET @Contador = @Contador + 1
END
	PRINT 'O Total �: ' + CAST(@Total as VarChar(10))

-- Procedures s�o 
USE AdventureWorks2012
CREATE OR ALTER PROCEDURE AcharNome @Letra Char(1)
AS
	BEGIN
		SELECT BusinessEntityID, FirstName, LastName
		FROM Person.Person
		WHERE FirstName Like @Letra + '%'
		ORDER BY FirstName
	END
GO

Exec AcharNome 'B'

CREATE OR ALTER PROCEDURE FindID @ID as INT
AS
	BEGIN
	SELECT A.BusinessEntityID, A.FirstName, B.EmailAddress
		FROM Person.Person as A
		INNER JOIN Person.EmailAddress as B
		ON A.BusinessEntityID = B.BusinessEntityID
	WHERE A.BusinessEntityID = @ID
END

EXEC FindID 100