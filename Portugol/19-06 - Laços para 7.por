programa
{
	
	funcao inicio()
	{	inteiro Total = 0
		para(inteiro Numero = 1; Numero <= 100;Numero = Numero + 1)
		{
			se((Numero % 2) == 1 e (Numero % 7) == 0)
			{
			escreva("\n"+Numero)
			Total = Total + Numero
			}
			
		}
		escreva("\nTotal igual á: " + Total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */