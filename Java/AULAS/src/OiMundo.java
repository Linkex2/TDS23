import java.util.Scanner;

public class OiMundo {
	public static void main(String[] args) {
		//aqui é um comentario
		/*
		 * 
		 */
		//variaveis
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anoNascimento;
		double valor = 0;
		
		System.out.print("Digite o nome do usuario: ");
		nome = leia.next();
		System.out.println("Nome usuario: " + nome);
		
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		anoNascimento = 2023 - anoNascimento;
		System.out.println("A idade aproximada é: "+anoNascimento);
		
		System.out.printf("Olá %s, Idade %d ",nome,anoNascimento);
		
		valor = Math.pow(2.00, 2.00);
		pula();
		System.out.println(valor);
		
		/*int valor1 = 0;
		int valor2;
		valor2 = 10;
		
		char letra = 'S';
		String nome= "Epaminondas";
		
		//boolean é um valor binario, verdadeiro ou falso
		boolean teste = false;
		
		//double é um valor quebrado
		double valor = 15.050667;
		
		/*
		 * %s - string
		 * %d - int
		 * %.2f - double
		 *
		System.out.println(valor2);
		System.out.println(letra);
		System.out.println(nome);
		System.out.println(teste);
		System.out.println(valor);
		System.out.printf("valor ajustado %.2f",valor);
		System.out.printf("\nOi %s o seu salario é %.3f",nome,valor);
		//print é para texto
		//printf é para formulas e calculos
		*/
		
	
	
	}
	public static void pula()
	{
	System.out.println();
	}
}

