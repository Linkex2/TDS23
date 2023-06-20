programa
{
	
	funcao inicio()
	{
	cadeia Nome
	inteiro AnoNascimento = 0
	inteiro Ano = 0
	escreva("\nPor favor, insira seu nome: ")
	leia(Nome)
	
	escreva("\nPor favor, insira o ano que nasceu: ")
	leia(AnoNascimento)
	
	escreva("\nPor favor, insira o ano atual: ")
	leia(Ano)
	
	se(AnoNascimento - Ano < 0)
	{
	escreva("Olá "+ Nome +", sua idade aproximada é: " + (Ano - AnoNascimento))
		se((Ano - AnoNascimento) < 17)
		{
		escreva("\nVocê é Jovem ainda!")
		}
		senao
		{
		escreva("\nVocê é Velho!")
		}
	}
	senao
	{
	escreva("Por favor, insira um ano valido")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */