programa
{
	
	funcao inicio()
	{
		cadeia C
		real N = 0.00

		escreva("Informe seu código de Usuário: ")
		leia(C)
		escreva("Informe as horas trabalhadas: ")
		leia(N)
		real Salario = (N * 10)
	se(N > 0 )
	{	escreva("\nOlá, trabalhador: "+ C +"\nSeu salario é: R$" + Salario)
		se (N > 50)
		{	real E = (N - 50)
			escreva("\n\nVocê trabalhou "+ E +" horas extras, equivalentes a: R$"+ (E * 20)+"\ncontinue assim!")
			}
		senao
			escreva("\nInfelizmente, você não está apto a receber hora extra.")
			}
	senao
		escreva("Por favor, insira um horario valido.")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */