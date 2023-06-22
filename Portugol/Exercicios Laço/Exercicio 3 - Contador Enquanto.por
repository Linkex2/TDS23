programa
{
	
	funcao inicio()
	{
		inteiro Numero = 0
		inteiro Total = 0
		inteiro Media = 0
		
		enquanto(Numero >= 0)
		{
			escreva("Insira um número positivo: ")
			leia(Numero)
			
			se(Numero >= 0)
			{
				Total = Total + Numero
				Media = Media + 1
			}
			senao
			{
				escreva("\nNúmero invalido, encerrando programa")
			}
		}
		escreva("\n\nNúmeros inseridos: " + Media)
		escreva("\nSomatoria dos números: " + Total)
		escreva("\nA média total dos números é: " + (Total / Media))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */