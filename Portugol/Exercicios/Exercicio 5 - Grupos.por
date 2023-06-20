programa
{
	
	funcao inicio()
	{
		real Grupo1 = 0.00
		real Grupo2 = 0.00
		real Grupo3 = 0.00
		
		escreva("Informe o índice de poluição do Grupo 1: ")
		leia(Grupo1)
		escreva("Informe o índice de poluição do Grupo 2: ")
		leia(Grupo2)
		escreva("Informe o índice de poluição do Grupo 3: ")
		leia(Grupo3)
		limpa()
	se(Grupo1 >= 0.00 e Grupo2 >= 0.00 e Grupo3 >= 0.00)
	{	real Indice = (Grupo1 + Grupo2 + Grupo3)
			escreva("\nÍndice de poluição: " + Indice)
			
			se(Indice >= 0.5)
			{	escreva("\nURGENTE: Índice em nível critico!!!\nTodos os grupos devem ser paralisados!!!")
				}
				senao se(Indice >= 0.4)
				{	escreva("\nÍndice nível 2 excedido")
					escreva("\nGrupo 1: Suspender Atividades.")
					escreva("\nGrupo 2: Suspender Atividades.")
					escreva("\nGrupo 3: Continue trabalhando.")
					}
					senao se(Indice >= 0.3)
					{	escreva("\nÍndice nível 1 excedido")
						escreva("\nGrupo 1: Suspender Atividades.")
						escreva("\nGrupo 2: Continue trabalhando.")
						escreva("\nGrupo 3: Continue trabalhando.")
						}
						senao
						{	escreva("\nParabéns, nenhum índice foi excedido.")
							escreva("\nGrupo 1: Continue trabalhando.")
							escreva("\nGrupo 2: Continue trabalhando.")
							escreva("\nGrupo 3: Continue trabalhando.")
							}
		}
		senao
		{	escreva("Numéro negativo.\nInsira um valor valido.")
			}

			
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */