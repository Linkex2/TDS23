programa
{
	
	funcao inicio()
	{
	inteiro Idade = 0

	escreva("Insira sua idade: ")
	leia(Idade)
		se (Idade <= 17)
		{
			escreva("\nJovem")
			}
		senao se (Idade > 17 e Idade < 65)
		{
			escreva("\nAdulto")
			}
		senao se (Idade >= 65)
		{	
			escreva("\nIdoso")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 56; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */