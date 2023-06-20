programa
{
	
	funcao inicio()
	{
		escreva("Olá Mundo")
		inteiro A = 0
		inteiro B = 0
	escreva("\nPor favor, insira o numero A: ")
	leia(A)
	escreva("\nPor favor, insira o numero B: ")
	leia(B)
	escreva("O resultado da soma é: " + (A+B))
		se((A+B%2) == 0) // um unico simbolo do igual (=) é utilizado para atribuir valores ( variavel A = 1 ), enquanto dois simbolos (==) é uma comparação de igualdade (se((B + A) == 20), enquanto 3 iguals (===) tambem buscará o tipo da vairavel, se ela é real ou inteiro ou etc
		{
		escreva("\nO numero é Impar!")
		}
		senao
		{
		escreva("\nO numero é Par!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */