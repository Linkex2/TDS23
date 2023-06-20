programa
{
	
	funcao inicio()
	{
		
	inteiro TotalImpar = 0
	inteiro TotalPar = 0
		//Primeiramente, definimos a variavel dentro do laço, então definimos por quanto tempo o laço será executado, depois, fazemos os valores que o Laço alterará
		para(inteiro Numero = 0;Numero <= 100;Numero = Numero + 1){
			escreva("\n"+Numero)
			 se(Numero % 2 == 1)
			 {
			 	escreva(" é Impar")
			 	TotalImpar += Numero
			 }
			 senao
			 {
			 		escreva(" é Par")
			 		TotalPar += Numero
			 }
			 	
		} escreva("\nTotal dos numeros pares é: "+ TotalPar)
		escreva("\nTotal dos numeros impares é: "+ TotalImpar)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */