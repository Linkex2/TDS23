programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		inteiro A
		inteiro B
		inteiro C
		inteiro D
		inteiro E
		inteiro F
		
		escreva("Por favor, me diga o numero A: ")
		leia(A)
		escreva("Por favor, me diga o numero B: ")
		leia(B)
		escreva("Por favor, me diga o numero C: ")
		leia(C)
		escreva("Por favor, me diga o numero D: ")
		leia(D)
		escreva("Por favor, me diga o numero E: ")
		leia(E)
		escreva("Por favor, me diga o numero F: ")
		leia(F)

		inteiro X = (C * E) - (B * F) / (A * E) - (B * D)
		inteiro Y = (A * F) - (C * D) / (A * E) - (B * D)
		escreva("O valor de X e Y é: " + X + Y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */