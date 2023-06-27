import java.util.Scanner;

public class Nadador {
	
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int age = 0;
		System.out.println("Please insert an age: ");
		age = read.nextInt();
		
		if(age > 0)
		{
			if(age >= 18)
			{
			System.out.println(age+" years: Adult Swimmer.");
			}
				else if(age >= 14)
				{
				System.out.println(age+" years: Young Swimmer B.");
				}
					else if(age >= 12)
					{
					System.out.println(age+" years: Young Swimmer A.");
					}
						else if(age >= 8)
						{
						System.out.println(age+" years: Infant Swimmer B.");
						}
							else if(age >= 5)
							{
							System.out.println(age+" years: Infant Swimmer A.");
							}
								else if(age == 1)
								{
								System.out.println(age+" year: Can't swim.");
								}
									else if(age == 0)
									{
									System.out.println("Newborn.");
									}
		}
		else
		{
			System.out.println("Fetus detected!!!\n Aborting program.");
		}
	read.close();	
	}
}
