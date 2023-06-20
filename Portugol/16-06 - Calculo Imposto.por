programa
{
	
	funcao inicio()
	{
		cadeia Nome
		real Salario = 0.00
		real Imposto = 0.00
		
		escreva("Digite seu nome: ")
		leia(Nome)
		escreva("Digite seu salario: ")
		leia(Salario)
		
		se(Salario <= 2500)
		{	escreva("\nBom dia " + Nome +", Você está Insento!")
			}
		senao se(Salario > 2500 e Salario <= 5000)
		{	Imposto = (Salario * 0.15)
			escreva("\nBom dia " + Nome +", você pagará " + Imposto + " em Impostos\nSeu salario total é: " + (Salario - Imposto))
			}
		senao se(Salario > 5000)
		{	Imposto = (Salario * 0.25)
			escreva("\nBom dia " + Nome +", você pagará " + Imposto + " em Impostos\nSeu salario total é: " + (Salario - Imposto))
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */