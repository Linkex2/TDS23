import java.util.Scanner;
public class CountWhile{
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
		int number = 0;
		int total = 0;
		int avg = 0;
		
		while(number >= 0)
		{
			System.out.print("Insert a positive number: ");
			number = read.nextInt();
			
			if(number >= 0)
			{
				total = (total + number); 
				avg = (avg + 1);
			}
			else
			{
				System.out.println("Invalid number, program shutting down.");
			}
		}
		System.out.println("You've inserted: "+ avg);
		System.out.println("Number Sum: "+ total);
		System.out.println("The average of the numbers is: "+ (total / avg));
	read.close();	
	}
}
