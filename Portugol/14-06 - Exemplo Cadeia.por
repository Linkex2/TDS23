programa
{

	funcao inicio()
	{
		cadeia Nome
		inteiro Nascimento
		inteiro Idade
		
		escreva("Digite o nome do Usúario : ")
		leia(Nome)

		escreva("Digite o ano que você nasceu : ")
		leia(Nascimento)

		Idade = 2023 - Nascimento // Apenas numeros inteiros podem fazer parte de uma conta, cadeias não podem
		
		escreva("Oi, tudo bem " + Nome +"?\n")
		escreva("Sua idade aproximada é "+ Idade)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */