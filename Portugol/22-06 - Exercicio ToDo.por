programa
{
	
	funcao inicio()
	{
		cadeia agenda[31][24]
		inteiro hora = 0
		inteiro dia = 0
		cadeia opcao = " "

	enquanto(opcao != "N")
	{
		escreva("Digite o dia do evento: ")
		leia(dia)
			se(dia>31)
			{
			escreva("Erro! Digite um numero menor que 24: ")
			leia(hora)
			}
		dia = dia - 1
		escreva("Digite a hora do evento: ")
		leia(hora)
			se(hora>24)
			{
			escreva("Erro! Digite um numero menor que 24: ")
			leia(hora)
			}
		hora = hora - 1
		escreva("Digite o evento: ")
		leia(agenda[dia][hora])
		escreva("Deseja continuar? (Digite N para parar): ")
		leia(opcao)
	}
		para(inteiro linha=0;linha<30;linha = linha + 1){
			para(inteiro coluna=0;coluna<23;coluna = coluna + 1)
			{	
				se(agenda[linha][coluna] != "")
				{
				pula()
				escreva("Dia " + (linha+1) + " ás " + (coluna+1) +":00 horas: " + agenda[linha][coluna])
				}
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
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */