import java.util.Scanner;
public class AreaImagem {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		double base,altura, area;
		
		System.out.println("Digite a base do triangulo: ");
		base = leia.nextDouble();
		
		System.out.println("Digite a altura do triangulo: ");
		altura = leia.nextDouble();
		
		area = ((base * altura)/2.00);
		
		System.out.println("A area do triangulo é: "+ area);
		
		//Triangulo 2
		
		double base2,altura2, area2;
		System.out.println("Digite a base do triangulo2: ");
		base2 = leia.nextDouble();
		
		System.out.println("Digite a altura do triangulo2: ");
		altura2 = leia.nextDouble();
		
		area2 = ((base2 * altura2)/2.00);
		
		System.out.println("A area do triangulo2 é: "+ area2);
		
		if(area > area2)
		{
			System.out.println("A area do triangulo 1 é maior.");
		}
			else if(area < area2)
			{
			System.out.println("A area do triangulo 2 é maior.");
			}
			else if(area == area2)
			{
				System.out.println("Os triangulos tem areas iguais.");
			}
		leia.close();
	}
}
