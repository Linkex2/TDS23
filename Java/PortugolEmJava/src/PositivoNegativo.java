import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);	
		
	 	int Num = 0;
		System.out.println("Type a number: ");
		Num = read.nextInt();
		
		if(Num == 0)
		{
			System.out.println("That's a zero bozo. Try again.");
		}
			else if(Num < 0)
			{
				System.out.println("Number is negative.");
				if(Num % 2 == 0)
				{
					System.out.println("Number is even!");
				}
				else
				{
					System.out.println("Number is odd.");
				}
			}
		else
		{
			System.out.println("Numer is positive!");
			if(Num % 2 == 1)
			{
				System.out.println("Number is odd.");
			}
			else
			{
				System.out.println("Number is even!");
			}
		}
	read.close();	
	}
}
