import java.util.Locale;
import java.util.Scanner;
public class localeExerc {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.CANADA);
		Scanner leia = new Scanner(System.in);
		
		double indice = 4.34567;
		System.out.print("Digite o indice: ");
		indice = leia.nextDouble();
		System.out.print("Saida normal: "+indice);
		System.out.printf("Digite saida formatada: %.0f",indice);
		
		// If-Tenario
		int valor = 0;
		System.out.println(((valor%2)==0) ? "O numero é par": "O numero é impar");
		
		leia.close();
	}
}
