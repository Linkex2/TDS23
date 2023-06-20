programa
{
	
	funcao inicio()
	{
		real Base = 0.0
		real Altura = 0.0
		
		escreva("Insira o valor de Base: ")
		leia(Base)
			se(Base < 0)
			{	escreva("Base negativa: Insira um valor válido.")
				}
				senao se(Base == 0)
				{	escreva("Base igual a zero: Insira um valor válido.")
					}
					senao
					{	escreva("Insira o valor da Altura: ")
						leia(Altura)
							se(Altura < 0)
							{	escreva("Altura negativa: Insira um valor válido.")
								}
								senao se(Altura == 0)
								{	escreva("Base igual a zero: Insira um valor válido.")
									}
									senao
									{	real Area = (Base * Altura) / 2
										escreva("Área do triângulo igual a: " + Area)
										}
						}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */