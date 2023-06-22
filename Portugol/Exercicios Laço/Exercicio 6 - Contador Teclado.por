programa
{
	
	funcao inicio()
	{
		inteiro Numero = 0
		inteiro Contador = 0
		inteiro Total = 0
		escreva("Coloque um Número: ")
		leia(Numero)
		se(Numero > 0)
		{
		faca
		{
			Contador = Contador + 1
			Total = Total + Contador
			se(Contador >= Numero)
			{
				escreva(Contador + " = " + Total)
			}
			senao
			{
				escreva(Contador + " + ")	
			}
			
		}
		enquanto(Contador < Numero)
		escreva("\nTotal é: " + Total)
		}
		senao
		{
			escreva("Numero Invalido, tente denovo.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */