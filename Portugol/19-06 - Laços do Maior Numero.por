programa
{
	
	funcao inicio()
	{	inteiro Numero = 0
		inteiro MaiorNumero = 0
		inteiro Total = 0

		para(inteiro Loops = 1; Loops <= 5; Loops = Loops + 1)
		{
		escreva("\nEscreva um Numero: ")
		leia(Numero)
		Total = (Total + Numero)
		escreva(Numero)
			se(Numero > MaiorNumero ou MaiorNumero == 0)
			{
				MaiorNumero = Numero
			}
		}
		escreva("\nA somatoria dos numeros foi:"+ Total)
		escreva("\nO maior numero foi: "+ MaiorNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */