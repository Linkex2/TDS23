programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro numero[3][3]
		para(inteiro linha = 0; linha < 3; linha = linha + 1)
		{
			para(inteiro coluna=0;coluna<3;coluna = coluna + 1)
			{
			numero[linha][coluna] = Util.sorteia(1,60)
			}
		}
		para(inteiro linha = 0; linha < 3; linha = linha + 1)
		{
			para(inteiro coluna=0;coluna<3;coluna = coluna + 1)
			{
				pula()
			escreva("Número linha "+(linha+1)+", coluna "+(coluna+1)+" é: "+numero[linha][coluna])
			}
		}
	}
	funcao pula()
	{
	escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 76; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */