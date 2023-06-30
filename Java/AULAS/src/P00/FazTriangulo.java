package P00;

import java.util.Scanner;
public class FazTriangulo {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		System.out.println("Digite a base do triangulo 1");
		t1.base = leia.nextDouble();
		
		System.out.println("Digite a altura do triangulo 1");
		t1.altura = leia.nextDouble();
		t1.mostraArea();
		
		System.out.println("Area ="+((t1.base*t1.altura)/2));
		
		System.out.println("Digite a base do triangulo 2");
		t2.base = leia.nextDouble();
		
		System.out.println("Digite a altura do triangulo 2");
		t2.altura = leia.nextDouble();
		
		System.out.println("Area ="+((t2.base*t2.altura)/2));
		t2.mostraArea();
		
		leia.close();
	}
}
