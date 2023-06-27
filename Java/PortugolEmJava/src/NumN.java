import java.util.Scanner;
public class NumN {
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
		int N = 0;
		System.out.println("Insert a number larger than 100: ");
		N = read.nextInt();
			if(N > 100)
			{
				System.out.println("Your number is: " + N);
			}
				else
				{
				N = 0;
				System.out.println("Lower than 100\nYour number is now: " + N);
				}
	read.close();
	}
}
