CREATE DATABASE Curso
USE Curso
CREATE TABLE Imagens (
Id INT IDENTITY (1,1) NOT NULL,
Nm_Arquivo VARCHAR(1000) NOT NULL,
Vb_Imagem VARBINARY(MAX) NOT NULL
)

--A melhor maneira de usar imagens em banco de dados é utilizando o varbinary

INSERT INTO Imagens(Nm_Arquivo, Vb_Imagem)
SELECT 'Inserido Via SQL',* FROM OPENROWSET(BULK 'C:\dor\ralsei.jpg', single_blob) imagem

SELECT * FROM Imagens