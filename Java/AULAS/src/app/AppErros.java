package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppErros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int notas[] = new int[3];
		int posicao=0;
		
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 3;
		
		try {
		System.out.print("Digite a posição da nota de 0 a 2: ");
		posicao = leia.nextInt();
		System.out.println("Primeira nota igual á: "+notas[posicao]);
		System.out.println("Digite a proxima nota: ");
		notas[posicao] = leia.nextInt();
		System.out.println("A nova nota é: "+notas[posicao]);
		}
		catch(InputMismatchException e) {
			System.out.println("Tipo invalido, digite um numero!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Você informou um valor incorreto dentro do vetor!!!");
		}
		finally
		{
			System.out.println("Revise o seu codigo!!!");
		}
		
		System.out.println("Fim de Programa!!!!!!");
		leia.close();
	}

}
