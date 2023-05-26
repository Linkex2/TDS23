Create Database AulaJoin

USE AulaJoin

CREATE TABLE TabelaA (
	Id int,
	Nome varchar(10)
)

CREATE TABLE TabelaB (
	Id int,
	Nome varchar(10)
)

INSERT INTO TabelaA (Id, Nome) VALUES (1, 'Robo')
INSERT INTO TabelaA (Id, Nome) VALUES (2, 'Macaco')
INSERT INTO TabelaA (Id, Nome) VALUES (3, 'Samurai')
INSERT INTO TabelaA (Id, Nome) VALUES (4, 'Monitor')

INSERT INTO TabelaB (Id, Nome) VALUES (1, 'Espada')
INSERT INTO TabelaB (Id, Nome) VALUES (2, 'Robo')
INSERT INTO TabelaB (Id, Nome) VALUES (3, 'Mario')
INSERT INTO TabelaB (Id, Nome) VALUES (4, 'Samurai')

SELECT * FROM TabelaA
SELECT * FROM TabelaB


-- Seleciona tudo da tabela A e B, unindoas pelo INNER JOIN, e traz tudo que está identico na coluna Nome (as tabelas tambem estão apelidadas como A e B)
SELECT * FROM TabelaA as A
INNER JOIN TabelaB as B
ON A.Nome = B.Nome

-- Traz uma intercenção na tabela inteira, mesmo oque não é identico entre tabelas
SELECT * FROM TabelaA
FULL OUTER JOIN TabelaB
ON TabelaA.Nome = TabelaB.Nome

-- Traz informações que compara a TabelaA contra a TabelaB, como algo
SELECT * FROM TabelaA as A
LEFT JOIN TabelaB as B
ON A.Nome = B.Nome
WHERE B.Nome IS NULL

-- Faz 2 Selects ao mesmo tempo, e os liga atravez do comando UNION
USE AdventureWorks2012
SELECT ProductID, Name, ProductNumber FROM Production.Product
WHERE Name LIKE '%CHAI%'
UNION
SELECT ProductID, Name, ProductNumber FROM Production.Product
WHERE Name LIKE '%DECAL%'
ORDER BY Name DESC

-- Exercicios JOIN
-- PERSON.PERSON
-- Traga o BusinessID, FirstName, LastName e Email no mesmo Select
SELECT Person.BusinessEntityID, Person.FirstName, Person.LastName, Email.EmailAddress
FROM PERSON.Person AS Person
INNER JOIN Person.EmailAddress AS Email
ON Person.BusinessEntityID = Email.BusinessEntityID
-- Quando adicionada ao SELECT, buscará tudos os contratados que estão no RH, com o comando WHERE buscando a sequencia e letras DESI
INNER JOIN HumanResources.Employee AS HR
ON Person.BusinessEntityID = HR.BusinessEntityID
WHERE HR.JobTitle LIKE '%DESI%'

Select Product.ListPrice, Product.Name, Category.Name
FROM Production.Product AS Product
INNER JOIN Production.ProductSubcategory AS Category
ON Product.ProductSubcategoryID = Category.ProductSubcategoryID

-- Trazer o ID do Cliente, Primeiro Nome, Ultimo Nome, Numero de Telefone, Tipo de Telefone e o ID do Telefone 
Select Person.BusinessEntityID, Person.FirstName, Person.LastName, Phone.PhoneNumber, Type.Name, Phone.PhoneNumberTypeID
From Person.Person AS Person
INNER JOIN Person.PersonPhone AS Phone
ON Person.BusinessEntityID = Phone.BusinessEntityID
INNER JOIN Person.PhoneNumberType AS Type
ON Phone.PhoneNumberTypeID = Type.PhoneNumberTypeID

-- Preciso das pessoas com cartão de credito registrado
-- e preciso de pessoas que NÃO tem cartão de credito registrado
-- Tabelas Person, EmailAdress, Sales.PersonCreditCard
SELECT Person.FirstName, Person.LastName, Email.EmailAddress, Credit.CreditCardID FROM Person.Person as Person
INNER JOIN Person.EmailAddress AS Email
ON Person.BusinessEntityID = Email.BusinessEntityID
LEFT JOIN Sales.PersonCreditCard as Credit
ON Person.BusinessEntityID = Credit.BusinessEntityID
-- Para mostrar que NÃO tem registro, use essa função WHERE
WHERE Credit.CreditCardID IS NULL
AND Email.EmailAddress IS NOT NULL

-- Usando um Select dentro de outro Select (Sub-Select)
SELECT ProductID, ListPrice FROM Production.Product
WHERE ListPrice > (SELECT AVG(ListPrice) FROM Production.Product as Average)

-- Exemplo de Sub-Select 2 (Usando um Where dentro de um Where)
SELECT FirstName FROM Person.Person
WHERE BusinessEntityID IN (Select BusinessEntityID FROM HumanResources.Employee 
WHERE JobTitle = 'DESIGN ENGINEER')