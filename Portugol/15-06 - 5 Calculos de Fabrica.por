programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
	inteiro CustoFabrica

	escreva("Por Favor, escreva o custo de fabrica do carro: R$")
	leia(CustoFabrica)

	inteiro Distribuidor = (28 * CustoFabrica) / 100
	inteiro Imposto = (45 * CustoFabrica) / 100
	inteiro CustoConsumo = Distribuidor + Imposto + CustoFabrica

	escreva("\nEntão o custo final será: R$" + CustoConsumo)
	escreva("\nA porcentagem do distribuidor é: R$" + Distribuidor)
	escreva("\nA porcentagem do Imposto é: R$" + Imposto)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */