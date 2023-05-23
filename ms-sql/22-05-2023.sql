USE pubs

select * FROM sys.tables

Select * From dbo.authors

Select au_fname,
	   phone
FROM dbo.authors ORDER BY au_fname DESC

SELECT TOP(5)qty FROM dbo.sales ORDER BY qty DESC

SELECT * FROM DBO.authors
WHERE state = 'CA' and contract = 0
ORDER BY city

SELECT SUM(qty) as 'Total Sales' --Mostra um agregador de todos os valores, com o nome Total Sales
FROM dbo.sales

SELECT au_lname, au_fname, phone FROM authors

SELECT * FROM authors WHERE au_fname LIKE 'a%' --Mostra a tabela autores, onde os nomes começãm com A

Select authors.*,titleauthor.*
FROM authors, titleauthor
WHERE authors.au_id = titleauthor.au_id

SELECT * FROM authors
SELECT * FROM titleauthor

SELECT DISTINCT au_id from titleauthor

INSERT INTO authors(au_id,au_lname,au_fname,phone,address,city,state,zip,contract)
			 VALUES('99-55-7771','Mateus','Nezzi','535-523-2456','67 Rua Bondinho da Massa','2Fort','TF2','15326',1) --não sei porque não funciona

UPDATE authors SET au_fname = 'Nezzi' WHERE au_id = '172-32-1176'; --altera o primeiro nome do autor para nezzi, o qual tem o id 172-32-1176

