import java.util.Scanner;
public class Calculos {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0;
		
		System.out.println("Por favor, me diga o numero A: ");
		A = leia.nextInt();
		
		System.out.println("Por favor, me diga o numero B: ");
		B = leia.nextInt();
		
		System.out.println("Por favor, me diga o numero C: ");
		C = leia.nextInt();
		
		System.out.println("Por favor, me diga o numero D: ");
		D = leia.nextInt();
		
		System.out.println("Por favor, me diga o numero E: ");
		E = leia.nextInt();
		
		System.out.println("Por favor, me diga o numero F: ");
		F = leia.nextInt();

		int X = ((C * E) - (B * F) / (A * E) - (B * D));
		int Y = ((A * F) - (C * D) / (A * E) - (B * D));
		System.out.println("O valor de X e Y é: " + (X + Y));
	
	leia.close();
	}
}
