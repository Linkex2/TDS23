programa
{
	
	funcao inicio()
	{
		inteiro Numero
		escreva("Informe um número: ")
		leia(Numero)
		limpa()
		se(Numero == 0)
		{
			escreva("O número é zero")	
			}
		senao se(Numero < 0)
		{	escreva("Número Negativo.")
			se(Numero % 2 == 0)
			{	escreva("\nO número é par!")
				}
			senao
			{	escreva("\n\nO número é ímpar.\n")
				}
		}
		senao
			{	escreva("\nNúmero Positivo!")
				se(Numero % 2 == 1)
				{	escreva("\n\nO número é ímpar.\n")
					}
				senao
				{	escreva("\n\nO número é par!\n")
					}
	
				}
			
			
			
			

	
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */