import java.util.Scanner;
public class Salarios {
	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
		double salary = 0.0,totalSalary = 0.0,topSalary = 0.0,percentual = 0.0;
		int child = 0,totalChild = 0;
				
			for(int citizen = 1; citizen < 4; citizen = citizen + 1)
			{
				System.out.println("Citizen " + citizen + ". Insert your current salary: R$");
				
				salary = read.nextDouble();
					if(salary > topSalary)
					{
						topSalary = salary;
					}
						if(salary <= 100.00)
						{
							percentual = percentual + 1;
						}
				totalSalary = totalSalary + salary;
				
				System.out.println("\nHow many children do you live with you? \n");
				child = read.nextInt();
				totalChild = totalChild + child;
				}

				System.out.println("\nThe average salary is: R$" +  Math.round(totalSalary / 3));
				System.out.println("\nThe top salary was: R$" + topSalary);
				System.out.println("\nThe percentual below R$100 was: " + Math.round(percentual / 3 * 100) + "%");
				System.out.println("\nThe children average is: " + totalChild / 3);
	read.close();
	}
}
