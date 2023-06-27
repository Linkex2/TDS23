import java.util.Scanner;
public class FabricaCarro {
	public static void main(Scanner[] args)
	{
	Scanner leia = new Scanner(System.in);
		int custoFabrica = 0;

		System.out.print("Insira o custo de fabrica do carro: R$");
		custoFabrica = leia.nextInt();

		int distribuidor = ((28 * custoFabrica) / 100);
		int imposto = ((45 * custoFabrica) / 100);
		int custoConsumo = (distribuidor + imposto + custoFabrica);

		System.out.println("\nEntão o custo final será: R$" + custoConsumo);
		System.out.println("\nA porcentagem do distribuidor é: R$" + distribuidor);
		System.out.println("\nA porcentagem do Imposto é: R$" + imposto);
		
	leia.close();
	}
}
