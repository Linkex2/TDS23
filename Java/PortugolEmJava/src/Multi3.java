import java.util.Scanner;
public class Multi3 {
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Write a number: ");
		num = read.nextInt();
		while(num < 100)
		{
			System.out.println(num + " x 3 = " + num * 3);
			num = num * 3;
		}
	read.close();
	}
}
