USE AdventureWorks2012

SELECT COUNT(*) AS 'Produtos Vermelhos' From Production.Product 
WHERE Color = 'RED' and ListPrice Between 500 and 1000

-- NUMERO DE PRODUTOS QUE POSSUI "ROAD" EM ALGUM LUGAR DO NO NOME

SELECT COUNT(NAME) AS 'Nomes com ROAD' FROM Production.Product
WHERE NAME LIKE '%ROAD%'



SELECT * FROM SALES.SalesOrderDetail

-- Top traz os primeiros resultados pedidos, não necessariamente os maiores ou menos, mas os primeiros especificados
SELECT TOP 10 * FROM SALES.SalesOrderDetail ORDER BY LineTotal ASC
SELECT * FROM SALES.SalesOrderDetail

-- SUM faz a soma de todos os numeros de uma tabela
SELECT SUM(LINETOTAL) AS 'TOTAL DE VENDAS' FROM SALES.SalesOrderDetail

-- MAX traz o maior valor da uma coluna
SELECT MAX(LINETOTAL) AS 'MAIOR VENDA' FROM SALES.SalesOrderDetail

-- MIN traz o menor valor de uma coluna
SELECT MIN(LINETOTAL) AS 'MAIOR VENDA' FROM SALES.SalesOrderDetail

-- AVG traz uma media de todos os valores de uma coluna
SELECT AVG(LINETOTAL) AS 'MAIOR VENDA' FROM SALES.SalesOrderDetail

-- GROUP BY permite você agrupar coias por uma coluna, por exemplo, ele exibira os nomes nesse comando, alem de usa-los para contar a quantidade
SELECT FirstName, Count(FirstName) FROM PERSON.Person
GROUP BY FirstName

--
SELECT SpecialOfferID, SUM(UnitPrice) FROM SALES.SalesOrderDetail
GROUP BY SpecialOfferID
ORDER BY SUM(UnitPrice) DESC

-- Quantos produtos foram vendidos 

Select ProductID, Count(ProductID) AS 'Quantidade Produtos até hoje' FROM SALES.SalesOrderDetail
GROUP BY ProductID

Select COLOR, AVG(ListPrice) FROM Production.Product
WHERE Color = 'Silver'
GROUP BY Color -- PS: GROUP BY só pode acontecer após um WHERE


-- Quantas pessoas tem o mesmo MiddleName, Agrupado pelo MiddleName
Select MiddleName,Count(MiddleName) AS Quantidade From Person.Person
Group By MiddleName


-- 1 - Qual a Media que cada produto é vendido
Select ProductID, AVG(OrderQty) AS Media From Sales.SalesOrderDetail
GROUP BY ProductID

-- 2 - Quais os 10 produtos que no total tiveram os maiores valores de venda
-- os maiores valores de venda agrupados por produto do maior para o menor
Select Top 10 ProductID, SUM(LineTotal) From Sales.SalesOrderDetail
Group By ProductID
Order By SUM(LineTotal) DESC

-- 3 - Quantos produtos e qual a Quantidade media de produtos temos cadastrados
-- nas ordens de serviço (WorkOrder) - Agrupar elo ID do Produto [Production.WorkOrder]
SELECT ProductID, COUNT(ProductID) AS QTDE, AVG(OrderQty) AS Media
FROM Production.WorkOrder
GROUP BY ProductID

-- Exercicio Having
SELECT FirstName, Count(FirstName)
FROM Person.Person
WHERE FirstName LIKE 'A%'
GROUP BY FirstName
HAVING Count(FirstName) > 10

Select ProductID, Sum(LineTotal) AS 'TOTAL DE VENDAS'
From SALES.SalesOrderDetail
Group By ProductID
HAVING SUM(LineTotal) Between 162000 and 500000

-- Quais Produtos não estão trazendo em media vendas de um milhão no total
Select ProductID, AVG(LineTotal) From Sales.SalesOrderDetail
GROUP BY ProductID
HAVING AVG(LineTotal) < 100000