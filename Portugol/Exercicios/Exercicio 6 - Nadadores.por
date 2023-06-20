programa
{
	
	funcao inicio()
	{	
		inteiro Idade = 0
		escreva("Insira sua idade: ")
		leia(Idade)
		limpa()
		se(Idade >= 0)
		{	se(Idade >= 18)
			{	escreva(Idade + " Anos: Nadador Adulto.")
				}
			senao se(Idade >= 14)
				{	escreva(Idade + " Anos: Nadador Juvenil B.")
					}
					senao se(Idade >= 12)
					{	escreva(Idade + " Anos: Nadador Juvenil A.")
						}
						senao se(Idade >= 8)
						{	escreva(Idade + " Anos: Nadador Infantil B.")
							}
							senao se(Idade >= 5)
							{	escreva(Idade + " Anos: Nadador Infantil A.")
								}
								senao se(Idade >= 1)
								{	escreva(Idade + " Ano(s): Inepto a nadar.")
									}
									senao se(Idade >= 0)
									{	escreva("Recém-Nascido.")
										}
			}
			senao
		{	escreva("Feto detectado!!!\n\nInsira uma idade válida.\n")
			}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 793; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */