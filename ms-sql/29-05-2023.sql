-- Seleciona e traz todo o texto da tabela como letra maiuscula ou minuscula
Select UPPER(FirstName), Lower(LastName) From Person.Person

-- Exibe o numero de letras de cada area
SELECT FirstName, LEN(FirstName) FROM Person.Person
Where LEN(FirstName) <= 2 

-- SUBSTRING permite pegar partes de string, nesse caso, começado pelo primeiro (1) caractere, pega as 3 primeiras letras do FirstName
SELECT FirstName, SubString(FirstName, 1, 3) FROM Person.Person

-- REPLACE permite mudar o texto exibido no SELECT
SELECT ProductNumber, REPLACE(ProductNumber,'-','-2023-') FROM PRODUCTION.Product

SELECT * FROM PRODUCTION.Product

-- Cria uma VIEW no banco de dados, um tipo de Mini-Tabela criada apartir de uma tabela real, que pode ter seus proprios SELECTs e pesquisas criadas apartir dela
CREATE OR ALTER VIEW NOME AS
SELECT FirstName, MiddleName, LastName
FROM Person.Person
WHERE Title = 'Mr.'

SELECT * FROM NOME
ORDER BY 3 DESC

-- Cria ou Altera a VIEW de Mails
CREATE OR ALTER VIEW EMAILS AS
SELECT Email.BusinessEntityID, FirstName, Name.LastName, Email.EmailAddress
FROM Person.Person as Name
INNER JOIN Person.EmailAddress as Email
ON Name.BusinessEntityID = Email.BusinessEntityID

-- Faz um SELECT juntando a Tabela Person.Person e a VIEW EMAILS
SELECT Person.Person.*, EMAILS.* FROM Person.Person, EMAILS
WHERE Person.BusinessEntityID = EMAILS.BusinessEntityID

--DROP completamente tira a tabela do banco de dados
SELECT * FROM NOME
DROP VIEW NOME