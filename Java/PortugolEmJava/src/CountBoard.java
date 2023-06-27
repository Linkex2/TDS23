import java.util.Scanner;
public class CountBoard {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
				int num = 0;
				int count = 0;
				int total = 0;
				System.out.println("Insert a number: ");
				num = read.nextInt();
				if(num > 0)
				{
				do
				{
					count = count + 1;
					total = total + count;
					if(count >= num)
					{
						System.out.print(count + " = " + total);
					}
					else
					{
						System.out.print(count + " + ");
					}
					
				}
				while(count < num);
					System.out.println("\nThe total is: " + total);
				}
				else
				{
					System.out.println("Invalid number, try again.");
				}
			read.close();
	}
}
