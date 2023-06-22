programa
{
	
	funcao inicio()
	{
		cadeia Time[4] = {"SPFC","SFC","SCCP","SEP"}
		inteiro Pontos[4] = {0,0,0,0}
		cadeia Resultado = " "
		
		para(inteiro Rodadas = 0; Rodadas <= 3; Rodadas = Rodadas + 1)
		{
			para(inteiro X = 0; X <= 3; X = X + 1)
			{
			escreva("\n" + Time[X])
			escreva("\nDigite G,P ou E: ")
			leia(Resultado)
				se(Resultado == "G" ou Resultado == "g")
				{
				Pontos[X] = Pontos[X] + 3
				}
				senao se(Resultado == "P" ou Resultado == "p")
					{
					Pontos[X] = Pontos[X] + 0
					}
						senao se(Resultado == "E" ou Resultado == "e")
						{
						Pontos[X] = Pontos[X] + 1
						}
							senao
							{
							escreva("\nCaracter Invalido.")	
							}
			}
			escreva("\nRodada " + (Rodadas + 1))
			pula()
			para(inteiro X = 0;X <=3; X = X + 1)
			{
			escreva("\nTime " + Time[X] + " = " + Pontos[X])
			}
		}
		pula()
		escreva("Fim de Jogo!")
		pula()
		para(inteiro X = 0; X <=3; X = X + 1)
		{
		pula()
		escreva("Total de pontos do "+ Time[X] +" foi: "+ Pontos[X])
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
 * @POSICAO-CURSOR = 859; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */