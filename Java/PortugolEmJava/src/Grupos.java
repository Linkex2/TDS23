import java.util.Scanner;
public class Grupos {
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
		double group1 = 0.00;
		double group2 = 0.00;
		double group3 = 0.00;
		
			System.out.println("Insert group 1: ");
			group1 = read.nextDouble();
			System.out.println("Insert group 2: ");
			group2 = read.nextDouble();
			System.out.println("Insert group 3: ");
			group3 = read.nextDouble();
			
		if(group1 >= 0.00 & group2 >= 0.00 & group3 >= 0.00 )
		{
			double level = (group1 + group2 + group3);
			System.out.println("Polution levels: " + level);
			if(level >= 0.5)
			{	
				System.out.println("URGENT: POLUTION LEVEL CRITICAL\nALL GROUPS MUST CEASE PRODUCTION!");
			}
				else if(level >= 0.4)
				{
					System.out.println("Polution level 2 exceed.");
					System.out.println("Group 1: must cease activities, penalty inbound.");
					System.out.println("Group 2: must cease activities, penalty inbound.");
					System.out.println("Group 3: Resume activities.");
				}
			
					else if(level >= 0.3)
					{
						System.out.println("Polution level 1 exceed.");
						System.out.println("Group 1: must cease activities, penalty inbound.");
						System.out.println("Group 2: Resume activities.");
						System.out.println("Group 3: Resume activities.");
					
					}
					else
				{
				System.out.println("Polution level are appropriate.");
				System.out.println("Group 1: Resume activities.");
				System.out.println("Group 2: Resume activities.");
				System.out.println("Group 3: Resume activities.");
				}
			System.out.println("Number is negative, please insert a valid number.");
		}
	read.close();
	}
}
