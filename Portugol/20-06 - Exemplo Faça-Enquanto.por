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
		faca //Faça este codigo abaixo
		{
			escreva("Digite um número: ")
			leia(Numero)
				se(Numero < 0)
				{
					pare
				}
			Total = Total + 1
			escreva("Digite a senha: ")
			leia(Teste)
		}
		enquanto(Teste == Senha)
		//Enquanto este teste está valido
		escreva("Total: " + Total)
		escreva("Programa finalizado!")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */