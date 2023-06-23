programa
{
	
	funcao inicio()
	{
		cadeia matrizNomes[3][3]

		matrizNomes[0][0]="Eduardo"
		matrizNomes[0][1]="Ednilson"
		matrizNomes[0][2]="Everton"
		matrizNomes[1][0]="Evandro"
		matrizNomes[1][1]="Erivanildo"
		matrizNomes[1][2]="Edilma"
		matrizNomes[2][0]="Edielse"
		matrizNomes[2][1]="Eneila"
		matrizNomes[2][2]="Edney"
		
		para(inteiro linha = 0; linha < 3; linha = linha + 1)
		{
			para(inteiro coluna=0;coluna<3;coluna = coluna + 1)
			{
			escreva(matrizNomes[linha][coluna] + linha + coluna)
			pula()
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
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */