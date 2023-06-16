programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real Nota1
		real Nota2
		real Nota3


		escreva("Insira a nota de peso 2")
		leia(Nota1)
		escreva("Insira a nota de peso 3")
		leia(Nota2)
		escreva("Insira a nota de peso 5")
		leia(Nota3)

		Nota1 = Nota1 * 0.2
		Nota2 = Nota2 * 0.3
		Nota3 = Nota3 * 0.5
		real Media = (Nota1 + Nota2 + Nota3)
		Matematica.arredondar(Media, 2)
		escreva("A media total foi: " + Media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */