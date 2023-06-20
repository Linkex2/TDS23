programa
{
	
	funcao inicio()
	{	inteiro Numero = 0
		escreva("Escreva um número entre 2 e 9: ")
		leia(Numero)
		limpa()
		se(Numero < 2 ou Numero > 9)
		 {
		 	escreva("NÚMERO INVALIDO\nDigite algo entre 2 e 9!")
		 }
		 senao{
		para(inteiro Multiplo = 1; Multiplo <= 10; Multiplo = Multiplo + 1)
			escreva("\n"+ Numero + " X " + Multiplo + " = " + (Numero * Multiplo))
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */