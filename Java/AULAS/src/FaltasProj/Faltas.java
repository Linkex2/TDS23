package FaltasProj;
import java.util.Scanner;
public class Faltas {
	
	public static void main(String[] args)
	{	
		Scanner leia = new Scanner(System.in);
		String codigo[] = {"3278", "3277", "3317", "3274", "3269", "3316", "3272", "3319", "3266", "3332", "3330", "3262", "3275", "3280", "3337", "3263", "3281", "3339", "3264", "3340", "3321", "3276", "3318", "3268", "3282", "3343", "3258"};
		String numero[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27"};
		String aluno[] = {"André de Castro Cruz", "André Henrique Marfin Ferreira", "Daniel P. dos Santos Silva", "Danilo Rezende da Silva", "Gabriel dos Anjos Correia da Silva", "Gabriel Marinho Guimarães", "Giovanna de Oliveira Scaglione", "Guilherme Adonario dos Santos", "Gustavo Henrique Torres e Silva", "Isabelle Cristina Dias Soares", "João Felipe Sena Nascimento", "João Pedro Mota Melára", "João Victor Alves Messias", "João Victor Bueno Ramalho", "João Vitor Rodrigues Martinez", "Jonatas Ferreira da Silva Pereira", "Júlio Henrique Scalete dos Santos", "Marcus Nunes de Campos", "Mateus Nezzi Ribeiro", "Matheus Nunes de Campos", "Moises Alves Bonfin", "Paulo Silas da Silva Santos", "Renato da Graça Silva", "Rodrigo de Andrade Montanholli", "Tiago de Lima Penaforte", "Vinícius Souza Santos", "Vitor Cruz dos Santos"};
		int faltas[] = new int[26];
		double nota1[] = new double[26];
		double nota2[] = new double[26];
		int alunoEscolha = 0;
		// Se media => 6, aprovado.
		// Se media < 6, reprovado.
		// Se faltas => 40, reprovado.
		// Fazer um boletim, que mostra faltas, nota e media. Se não tem duas notas, não mostrar media.
		
		for(int x=0; x<26; x=x+1) {
			faltas[x]=0;
		}
		
		System.out.println("Insira o numero do aluno: ");
		String pesquisa = leia.next();
		
		for(int x=0; x<26; x=x+1)
		{
			if(numero[x].equals(pesquisa))
			{
				alunoEscolha = x;
			}
		}
			
		if(alunoEscolha >=0)
			{
			System.out.println("Aluno existe: "+aluno[alunoEscolha]);
			
			System.out.println("Insira a primeira nota do aluno: ");
			nota1[alunoEscolha] = leia.nextDouble();
			
			System.out.println("Insira a segunda nota do aluno: ");
			nota1[alunoEscolha] = leia.nextDouble();
			
			System.out.println("Insira o numero de faltas do aluno: ");
			faltas[alunoEscolha] = leia.nextInt();
			
			double media = ((nota1[alunoEscolha] + nota2[alunoEscolha]) / 2);
				if(media >= 6 && faltas[alunoEscolha] < 40)
				{
					System.out.println("Aluno:"+ aluno[alunoEscolha]+"\nNumero: "+numero[alunoEscolha]);
					
					System.out.println("Numero de Faltas: "+ faltas[alunoEscolha]);
					System.out.println("Nota 1: " + nota1[alunoEscolha]);
					if(nota2[alunoEscolha] > 0)
					{
					System.out.println("Nota 2: " + nota2[alunoEscolha]);
					System.out.println("Media: " + media);
					System.out.println("Aluno Aprovado.");
					}
					else
					{
						System.out.println("Nota 2 não inserida.");
						System.out.println("Aluno Aprovado.");
					}
				}
				else
				{
					System.out.println("Aluno Reprovado.");
				}
			}
			else
			{
				System.out.println("Aluno não existe.");
			}
	}
}
