programa
{
	
	funcao inicio()
	{
		inteiro Total = 0
		inteiro Numero = 0
		inteiro MaiorNumero = 0
		inteiro Repetentes = 0
		caracter SimNao = ' '
		para(inteiro Loop = 1; Loop <= 6;Loop = Loop + 1)
		{
			escreva("Digite 6 números inteiros positivos: ")
			leia(Numero)
			Total = Total + Numero 
				se(Numero > MaiorNumero)
				{
					MaiorNumero = Numero
					Repetentes = 1
				}
				senao se(Numero == MaiorNumero)
					{
					Repetentes = Repetentes + 1
					}
			//Fucking Check de Sim e Não para parar o codigo de repetição
			escreva("Continua? (S/N): ")
			leia(SimNao)
			se(SimNao == 'N' ou SimNao == 'n')
			{
			pare
			}	
		}
		
		escreva("\nSomatoria de todos os números:" + Total)
		escreva("\nMaior número de todos:" + MaiorNumero)
			se(Repetentes > 1)
			{
			escreva("\nO maior numero foi digitado " + Repetentes +" vezes.")
			}
			senao
			{
			escreva("\nO maior numero foi digitado " + Repetentes +" vez.")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */