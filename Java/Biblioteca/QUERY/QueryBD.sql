CREATE DATABASE db_Biblioteca

select * from db_Biblioteca

USE db_Biblioteca;
CREATE TABLE LIVRO
(codLivro int not null PRIMARY KEY IDENTITY,
titulo VARCHAR (50) NOT NULL,
autor VARCHAR (50) NOT NULL,
editora VARCHAR (50) NOT NULL,
numeroPa INT NOT NULL)

CREATE TABLE cd
(codCd int not null PRIMARY KEY IDENTITY,
titulo VARCHAR (50) NOT NULL,
artista VARCHAR (50) NOT NULL,
gravadora VARCHAR (50) NOT NULL,
numeroFaixa INT NOT NULL)