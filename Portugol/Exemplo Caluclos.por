programa //Numero elevado ao cubo, tire a raiz quadrada
{
	inclua biblioteca Matematica
	funcao inicio()
	{
	real numero
	
	
		escreva("Digite um numero: ")
		leia(numero)
		
		real cubo = Matematica.potencia(numero, 3)
		
		escreva("Este numero ao cubo é: "+cubo)

		real RaizCubo = Matematica.raiz(cubo, 2)

		escreva("\nE ele ao cubo da raiz quadrada é: "+RaizCubo)
		escreva("\nEle arredondado é: "+Matematica.arredondar(RaizCubo, 3))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */