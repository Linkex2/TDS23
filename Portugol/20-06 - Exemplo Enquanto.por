programa
{
	
	funcao inicio()
	{
		cadeia Senha = "1234"
		cadeia Teste = " "
		inteiro Numero = 0
		inteiro Total = 0
		escreva("Digite a senha")
		leia(Teste)
		//Enquanto este teste estiver valido, ele repete o codigo.
		enquanto(Teste == Senha)
		{
			escreva("Digite um número: ")
			leia(Numero)
				se(Numero<0)
				{
					pare
				}
			Total = Total + 1
			escreva("Digite a senha: ")
			leia(Teste)
		}
		escreva("Total: " + Total)
		escreva("Programa finalizado!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */