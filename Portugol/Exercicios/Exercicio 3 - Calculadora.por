programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real A = 0
		real B = 0
		real C = 0
		escreva("Informe o valor A: ")
		leia(A)

		escreva("Informe o valor B: ")
		leia(B)

		escreva("Informe o valor C: ")
		leia(C)
		
		real ResultadoA = Matematica.potencia(A, 2)
		real ResultadoB = Matematica.potencia(B, 2)
		real ResultadoC = Matematica.potencia(C, 2)
	se(ResultadoC <= 1000)
	{
		real D = 0
		escreva("Informe o valor D: ")
		leia(D)
		real ResultadoD = Matematica.potencia(D, 2)
		escreva("\n"+ A +" ao quadrado é igual a: " + ResultadoA)
		escreva("\n"+ B +" ao quadrado é igual a: " + ResultadoB)
		escreva("\n"+ C +" ao quadrado é igual a: " + ResultadoC)
		escreva("\n"+ D +" ao quadrado é igual a: " + ResultadoD)
		escreva("\nFim do Programa!")
	}
	senao{
		escreva("\n"+A +" ao quadrado é igual a: " + ResultadoA)
		escreva("\n"+B +" ao quadrado é igual a: " + ResultadoB)
		escreva("\n"+C +" ao quadrado é igual a: " + ResultadoC)
		escreva("\nFim do Programa!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 754; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */