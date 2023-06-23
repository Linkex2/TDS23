programa
{
	inteiro Vetor[5] = {0,0,0,0,0}
	inteiro MaiorNumero = 0
	inteiro MaiorVetor = 0
	funcao inicio()
	{	
		para(inteiro X = 0; X <= 4; X = X + 1)
		{
		escreva("Insira um número: ")
		leia(Vetor[X])
		pula()
		
			se(Vetor[X] > MaiorNumero)
			{
		 	MaiorNumero = Vetor[X]
		 	MaiorVetor = X + 1
			}
		}
		
		para(inteiro X = 0; X <= 4; X = X + 1)
		{
		pula()
		escreva("Número " + (X+1) + ": " + Vetor[X])
		
		}
		pula()
		escreva("O maior número foi o " + MaiorVetor + "º, o número: " + MaiorNumero)
	}
	funcao pula()
	{
		escreva("\n")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */