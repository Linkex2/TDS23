import java.util.Scanner;
public class Idade {
	public static void main(String[] args)
	{
	Scanner leia = new Scanner(System.in);
		
		double A = 0, B = 0, C = 0;
		System.out.println("Escreva 1 número");
		A = leia.nextDouble();
		System.out.println("Escreva outro número");
		B = leia.nextDouble();
		System.out.println("Escreva mais um número");
		C = leia.nextDouble();
		
		double R = Math.pow((A+B), 2);
		System.out.println(A + " + " + B + "² = " + R);
		double S = Math.pow((B+C), 2);
		System.out.println(B + " + " + C + "² = " + R);
		double D = (R+S / 2);
		System.out.println(R + " + " + S + " / 2 = " + D);
	leia.close();
	}
}
