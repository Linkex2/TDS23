programa
{
	
	funcao inicio()
	{
	 inteiro Numero = 0
	 inteiro TotalGeral = 0
	 inteiro TotalDigita = 0
	 inteiro Positivos = 0
	 inteiro Negativos = 0
	 inteiro TotalPositivos = 0
	 inteiro TotalNegativos = 0
	
	faca
	{
		escreva("Digite um número diferente de 0: ")
		leia(Numero)
		TotalDigita = TotalDigita + 1
			se(Numero % 2 == 0)
			{
				Negativos = Negativos + 1
				TotalNegativos = Numero + TotalNegativos 
				TotalGeral = TotalGeral + Numero
			}
			senao
			{
				Positivos = Positivos + 1
				TotalPositivos = Numero + TotalPositivos
				TotalGeral = TotalGeral + Numero
			}
	}
	enquanto(Numero < 0 ou Numero > 0)
		
	escreva("\nTotal Geral: " + TotalGeral)
	escreva("\nNumeros Digitados: " + TotalDigita)
	escreva("\nPositivos Digitados: " + Positivos)
	escreva("\nNegativos Digitados: " + Negativos)
	escreva("\nTotal dos Positivos: " + TotalPositivos)
	escreva("\nTotal dos Negativos: " + TotalNegativos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */