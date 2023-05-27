/* Desafio 26/05 */
USE AdventureWorks2012
SELECT FirstName, Title, MiddleName From Person.Person
WHERE Title LIKE 'Mr.'
AND MiddleName IS NOT NULL
UNION
SELECT FirstName, Title, MiddleName From Person.Person
WHERE MiddleName LIKE 'A'
AND Title IS NOT NULL
--AND MiddleName IS NOT NULL
ORDER BY MiddleName

-- Exercicio de DatePart e Apelidos
USE NorthPiss
SELECT F1.FirstName, F1.HireDate, F2.FirstName, F2.HireDate
FROM Employees as F1, Employees as F2
WHERE DATEPART(YEAR, F1.HireDate) = DatePart(YEAR, F2.HireDate) AND F1.FirstName <> F2.FirstName

-- Exercicio de AVG e DatePart
USE AdventureWorks2012
SELECT AVG(TotalDue) as Media, DatePart(MONTH, OrderDate) as Mês
FROM Sales.SalesOrderHeader
GROUP BY DatePart(MONTH, OrderDate)
ORDER BY Mês

-- Mesmo Exercicio, mas pesquisado por ano
SELECT AVG(TotalDue) as Media, DatePart(YEAR, OrderDate) as Ano
FROM Sales.SalesOrderHeader
GROUP BY DatePart(YEAR, OrderDate)
ORDER BY Ano

-- Exercicio SubSelect
SELECT ProductID, Name, ListPrice FROM Production.Product AS P
WHERE ListPrice > (SELECT AVG(ListPrice) FROM Production.Product)

