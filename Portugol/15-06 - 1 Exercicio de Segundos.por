programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
	//Estas são Variaveis
	inteiro TotalSegundos
	inteiro Horas
	inteiro Minutos
	inteiro Segundos

	//Este é um exemplo de Entrada, onde pedimos pelo input do usuario
	escreva("Digite o processo em segundos: ")
	leia(TotalSegundos)

	Horas = TotalSegundos / 3600
	Minutos = (TotalSegundos % 3600) / 60
	Segundos = (TotalSegundos % 3600) % 60
// % é o modulo de programação, uma função que pega o RESTO de uma divisão.
// Como exemplo, em um calculo de 5 / 2, ele exibirá 1, pois é o resto do calculo.

	escreva("\nHoras: " + Horas)
	escreva("\nMinutos: " + Minutos)
	escreva("\nSegundos: " + Segundos)

// Agora fazemos o mesmo codigo, agora para calcular Anos, Meses e Dias.

	inteiro TotalDias

	escreva("\n\nDigite o numero de dias: ")
	leia(TotalDias)
	
	inteiro Anos = TotalDias / 365
	inteiro Meses = (TotalDias & 365) / 30
	inteiro Dias = (TotalDias & 365) & 30

	escreva("\nAnos: " + Anos + "\nMeses: " + Meses + "\nDias: " + Dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 734; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */