/*Variaveis em T-SQL
Aqui est� um eemplo de declara��o de vari�vel em T-SQL:

DECLARE @nomeVariavel tipoDado;

Por exemplo, para declarar uma vari�vel chamada "idade" do tipo inteiro,
voc� pode usar:

DECLARE @idade INT;

Uma vez declarada voc� pode atribuir um valor � variavel usando a instru��o SET:
SET Idade = 30;*/

USE AdventureWorks2012

DECLARE @NomeTeste varchar(20)

SET @NomeTeste = 'MARCOS NUNES'

print 'nome do aluno que sempre est� presente' + @NomeTeste

DECLARE @Numero1 int
DECLARE @Numero2 INT

Set @Numero1 = 5
SET @Numero2 = 9

PRINT @Numero1 + @Numero2

DECLARE @NomeBased varchar(20)
DECLARE @SobrenomeBased varchar(20)

SET @NomeBased = 'Mateus'
SET @SobrenomeBased =  'Netzzi'

Print 'The poggest person of the month: ' + @NomeBased + ' ' + @SobrenomeBased

/*CONVERS�O DE DADOS (CAST)
A fun��o CAST() em T-SQL (Transact-SQL) � uada para converter um valor de um tipo de dados para outro tipo de dados especificado

Alguns exemplos de CAST*/
DECLARE @Numero INT=10;
DECLARE @Texto VARCHAR(10);

SET @texto = CAST(@Numero AS VARCHAR(10)); --Converte o valor INT para VARCHAR
SELECT CAST('2021-01-01' AS DATE); --Converte uma string para o tipo de dados DATE
SELECT CAST (3.14159 AS DECIMAL(5,2)); --Converte um valor decimal para DECIMAL(5, 2)

DECLARE @valor1 INT
DECLARE @valor2 INT

SET @valor1 = 10
SET @valor2 = 20

--SELECT @valor1+@valor2

PRINT 'RESULTADO DA SOMA DE VALOR = '
+CAST(@valor1 AS VARCHAR(10))
+  'mais o valor 2 = '+CAST(@valor2 AS VARCHAR(10))+ ' RESULTADO = '
+CAST((@valor1+@valor2) AS VARCHAR(10))


--Problema teste
-- Colocar o Nome de um turista americano de uma variavel
-- colocar a temperatura em graus celcius em outra variavel
-- exiba o nome do turista ea temperatura em gaus farenheight pois pe padr�o americano

--INICIO
	--VARIAVEIS
	DECLARE @Turista VARCHAR(20)
	DECLARE @TempCelsus DECIMAL(20)
	DECLARE @TempFaren DECIMAL(20) --Como � um numero quebrado, usaremos o DECIMAL aqui, e o converteremos em VARCHAR depois.
	
	-- Onde os dados s�o inseridos
	SET @Turista = 'John'
	SET @TempCelsus = 18.00
	-- Processamento dos dados, aka onde o calculo acontece
	SET @TempFaren = ((@TempCelsus * 1.8) + 32)
	PRINT 'Bom Dia' + @Turista + ': a temperatura atual de Osasco em Farenheight � ' + CAST(@TempFaren AS VARCHAR) + '�'

-- INdentifique os dias totaisaproximados de uma pessoa baseado na idade que ela tem
--considerando o ano comercial (365)
-- Exemplo: 30 Anos
-- Cada ano tem 365 dias
-- Dias totais dessa pessoa: 30 * 365 = 10950
-- OI, [NOME DA PESSOA] Seus dias na terra s�o 10950

DECLARE @Idade as Numeric
DECLARE @Nome as Varchar(20)

SET @Idade = 20
SET @Nome = 'Jo�o'

PRINT @Nome + ', seus dias na terra s�o ' + CAST((@Idade * 365) as VarChar(10))

/* TESTE 2
Fa�a o inverso, usando M�s coerical 30 dias, ano comercial 365 dias apos receber a idade
da pessoa, em dias totais moeste a mesma em anos, meses, dias - exemplo:

-- DIAS TOTAIS : 45532
-- ANOS: 0
-- MESES: 0
-- DIAS: 0


-- PROCEDURES
	CREATE OR ALTER PROCEDURE Person.usp_GetPersonName @NamePrefix char(1)
	AS
		BEGIN
			SELECT BusinessEntityID, FirstName, LastName
			FROM Person.Person
			WHERE FirstName LIKE @NamePrefix + '%'
			ORDER BY FirstName
		END;
	GO




