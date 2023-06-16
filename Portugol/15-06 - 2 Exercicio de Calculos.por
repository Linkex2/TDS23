programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real A
		real B
		real C

		escreva("Por favor, me diga o numero A: ")
		leia(A)
		escreva("Por favor, me diga o numero B: ")
		leia(B)
		escreva("Por favor, me diga o numero C: ")
		leia(C)

		real R = Matematica.potencia(A + B,2)
		real S = Matematica.potencia(B + C,2)
		real D = R + S / 2
		escreva("O calculo final foi: " + D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */