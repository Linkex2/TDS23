import java.util.Scanner;
public class Tomate {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double P = 0.00;
		
		System.out.print("Hello João, list how many kilograms of tomatos you've produced today: ");
		P = leia.nextInt();
		
		if (P > 0)
		{
			if(P > 50)
			{
				double E = (P - 50);
				double M = (E * 4);
			System.out.print("\nWeight limit exceeded by "+E+"kg\nYou must pay, in fines, R$"+M);
			}
			else
			{
				String E = "ZERO";
				String M = "ZERO";
			System.out.print("\nWeight limit not exceeded. aka: " + E +"\nYour fine is R$"+M);
			}
		}
		else
		{
			System.out.print("Please write a valid value.");
		}
	leia.close();
	}
	
}
