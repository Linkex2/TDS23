import java.util.Scanner;
public class Notas {
	public static void main(String[] args)
	{
	Scanner leia = new Scanner(System.in);
		
		double nota1 = 0, nota2 = 0, nota3 = 0;

		System.out.println("Insira a nota de peso 2");
		nota1 = leia.nextDouble();
		System.out.println("Insira a nota de peso 3");
		nota2 = leia.nextDouble();
		System.out.println("Insira a nota de peso 5");
		nota3 = leia.nextDouble();

		nota1 = (nota1 * 0.2);
		nota2 = (nota2 * 0.3);
		nota3 = (nota3 * 0.5);
		double media = (nota1 + nota2 + nota3);
		Math.round(media);
		
		System.out.println("A media total foi: " + media);
	leia.close();
	}
}
