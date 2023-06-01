Select * FROM EMAILS

-- Cria uma VIEW que busca todos os nomes da tabela PERSON.Person
SELECT * FROM PERSON.Person
CREATE OR ALTER VIEW vNOMES AS 
SELECT FirstName as Nome, MiddleName as NomeDoMeio, LastName as Sobrenome FROM PERSON.Person

-- Cria uma tabela chamada tNOMES apartir da view vNomes
SELECT * INTO tNomes FROM vNOMES
SELECT * FROM tNomes

SELECT FirstName, EmailAddress INTO TabelaTeste FROM EMAILS

SELECT * FROM TabelaTeste
ALTER TABLE TabelaTeste
ADD IdTeste INT PRIMARY KEY IDENTITY

UPDATE TabelaTeste
SET FirstName = 'Maria'

DELETE FROM TabelaTeste
WHERE IdTeste = 1

DROP TABLE TabelaTeste

CREATE TABLE LAELLE(
	Id INT PRIMARY KEY IDENTITY,
	Nome VARCHAR(100) NOT NULL,
	DataIn DATETIME DEFAULT GETDATE()
)
SELECT * FROM LAELLE

INSERT INTO LAELLE(Nome) VALUES('Sena')
INSERT INTO LAELLE(Nome) VALUES('Giovanna')
INSERT INTO LAELLE(Nome) VALUES('Moises')