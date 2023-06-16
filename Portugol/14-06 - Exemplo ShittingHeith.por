programa
{
	
	funcao inicio()
	{
		cadeia Nome
		inteiro Temperatura
		inteiro TemperaturaRuim

		escreva("Please type your name: ")
		leia(Nome)
		escreva("Please, type the current temperature in celcius: ")
		leia(Temperatura)

		TemperaturaRuim = ((Temperatura * 9/5) + 32)
		
		escreva("Hello there"+Nome+"!")
		escreva("\nThe current Fahrenheit is "+ TemperaturaRuim)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */