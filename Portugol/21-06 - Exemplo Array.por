programa
{
	
	funcao inicio()
	{	//Exemplo de Array
		//Aqui, criamos 2 variavel em Array com 3 espaços
		cadeia Aluno[3]
		inteiro Nota[3]

		para(inteiro x=0; x<3; x = x + 1)
		{
			escreva("Digite o nome do aluno " + (x+1) + ": ")
			leia(Aluno[x])
			escreva("Digite a nota: ")
			leia(Nota[x])
		}
		Pula()
		linha(30)
		escreva("Aluno / Nota")
		Pula()
		linha(30)
		para(inteiro x=0; x<3; x = x + 1)
		{
			escreva(Aluno[x]+ "/t" + Nota[x] + "\n")
		}
	}
	funcao Pula()
	{
		escreva("\n")
	}
	funcao linha(inteiro tamanho)
	{
		para(inteiro x=1;x <= tamanho; x = x + 1)
		{
			escreva("-")
		}
		Pula()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */