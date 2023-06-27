import java.util.Scanner;
public class Horas {
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
		
	String C = " ";
	double N = 0.00;
	
	System.out.print("Insert your code: ");
	C = read.next();
	
	System.out.print("How many hours have you worked?\n");
	N = read.nextDouble();
	double salary = (N * 10);
	
		if(N > 0)
		{ System.out.print("Hello, worker "+C+"\nYour payout is R$"+salary);
			if(N > 50)
			{
				double exceed = (N - 50);
				System.out.print("\nYou worked "+exceed+" extra, meaning you earned: R$"+(exceed * 20)+"\nKeep it up baby!");
			}
			else
			{
				System.out.print("\nYou've not worked extra.");
			}
			
		}
		else
		{
			System.out.print("Please, insert a valid numer.\n or else you're FIRED!");
		}
	read.close();
	}
}
