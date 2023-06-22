programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		
		real Salario = 0.0,TotalSalario = 0.0,MaiorSalario = 0.0,Percentual = 0.0
		inteiro Filhos = 0,TotalFilhos = 0
		
		para(inteiro Cidadao = 1; Cidadao < 4; Cidadao = Cidadao + 1)
		{
		escreva("Cidadão " + Cidadao + ".\nInsira seu salário: R$")
		
		leia(Salario)
			se(Salario > MaiorSalario)
			{
				MaiorSalario = Salario
			}
			se(Salario <= 100.00)
			{
				Percentual = Percentual + 1
			}
		TotalSalario = TotalSalario + Salario
		
		escreva("\nQuantos filhos você tem? \n")
		leia(Filhos)
		TotalFilhos = TotalFilhos + Filhos
		}

		escreva("\nA media salárial é: R$" +  Matematica.arredondar(TotalSalario / 3,2))
		escreva("\nO maior salário foi: R$" + MaiorSalario)
		escreva("\nO percentual abaixo de R$100 é de: " + Matematica.arredondar(Percentual / 3 * 100,2) + "%")
		escreva("\nA media de filhos é: " + TotalFilhos / 3)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 841; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */