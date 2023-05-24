Select * From Person.Person
Where BusinessEntityID = 5
OR BusinessEntityID = 111
OR BusinessEntityID = 23

/*
AND - E (Diferente do OR, ele for�a o resultado a ter tudo, se n�o ele falha, Falso ou Verdadeiro)
OR - OU
NOT - N�o � (acompanhado do comandos como LIKE)

=
>
<
!=

*/

SELECT * FROM Production.Product
WHERE Weight > 500 AND Weight <= 700

-- Outra Maneira (Weight)

SELECT * FROM Production.Product
WHERE Weight BETWEEN 500 AND 700

-- Achando os empregados que est�o casados e salareados
SELECT * FROM HumanResources.Employee
WHERE MaritalStatus = 'M' and SalariedFlag = 1

-- Traz apenas os empregados que a diferen�a da data de nascimento e ano atual � maior ou igual a 40
SELECT * FROM HumanResources.Employee
WHERE DateDiff(YY, BirthDate, GETDATE()) >= 40

-- Traz o usuario da tabela Person.Person que o nome � o especificado
SELECT * FROM Person.Person
Where FirstName = 'Peter' and LastName = 'Krebs'

-- Ap�s descobrir o ID do usuario, usamos ele para descobrir que o email deste contratado em especifico.
Select * From Person.EmailAddress
WHERE BusinessEntityID = 26

-- Agora fazemos uma continha muito legal diretamente do inferno para exibir o nome do Peterzinho junto ao seu E-Mail. 
Select Person.FirstName, Person.LastName, Person.EmailAddress.EmailAddress
FROM Person.Person,PERSON.EmailAddress
WHERE Person.BusinessEntityID = EmailAddress.BusinessEntityID
AND Person.BusinessEntityID = 26

SELECT Count(Title) FROM Person.Person WHERE Title ='Ms.'
Select Distinct Title From PErson.Person

-- Exemplos Between 2
Select * From Production.Product
Where ListPrice >= 1000
AND ListPrice <= 1500

SELECT ListPrice FROM Production.Product
WHERE ListPrice BETWEEN 1000 AND 1500

SELECT * FROM HumanResources.Employee
WHERE HireDate Between '2009' and '2010'

-- O comando IN reduz a repeti��o de dados, permitindo a inser��o rapidas de dados inseridos com o comando "or"
SELECT * FROM Person.Person
WHERE BusinessEntityID IN (5, 111, 23)

-- Pesquisa todos os cadastros da tabela Person.Person que come�am com 'Ro' (a porcentagem � um wildcard)
Select * From Person.Person
WHERE FirstName LIKE 'Ro%'

--Quantos produtos temos no BD acima de 1500$ (Pre�o)

SELECT Count(ListPrice) From Production.Product
WHERE ListPrice > 1500

-- Quantas Pessoas tem o sobrenome que come�a com a letra P
SELECT Count(FirstName), LastName From Person.Person
WHERE FirstName LIKE 'P%'

-- Em Quantas cidades unicas estao as pessoas/clientes
SELECT Count(DISTINCT  City) From Person.Address

