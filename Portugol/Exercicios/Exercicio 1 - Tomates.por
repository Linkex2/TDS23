programa
{
	
	funcao inicio()
	{
		real P = 0.00

		escreva("Bom dia, João, informe quantos quilos você produziu hoje: ")
		leia(P)
	se(P > 0)
	{	se(P > 50)
		{
		real E = (P - 50)
		real M = (E * 4)
		escreva("\nPeso excedido por " + E + "\nVocê deve pagar, em multas, R$" + M)
			}
		senao
		{	
		cadeia E = "ZERO"
		cadeia M = "ZERO"
		escreva("\nPeso excedido por " + E + "\nVocê deve pagar, em multas, R$" + M)
			}
	}
	senao
	{
		escreva("\nPor favor, insira um número valido.")
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */