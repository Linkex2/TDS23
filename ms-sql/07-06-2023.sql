USE AdventureWorks2012
GO

CREATE OR ALTER PROCEDURE VoltaNome @NumID INT,
									@NomeCompleto nVarChar(2000) OUTPUT

AS
BEGIN
	SET @NomeCompleto = (Select (FirstName + ' ' + LastName) AS FullName
							FROM Person.Person
							WHERE BusinessEntityID = @NumID
						)
	RETURN
END
GO

--Executando a Procedure

DECLARE @NomeCompleto nVarChar(2000)
EXEC VoltaNome @NumID = 16, @NomeCompleto = @NomeCompleto OUTPUT

PRINT @NomeCompleto