import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		double A = 0.00;
		double B = 0.00;
		double C = 0.00;
		
		System.out.println("Insert value A: ");
		A = read.nextDouble();
		System.out.println("Insert value B: ");
		B = read.nextDouble();
		System.out.println("Insert value C: ");
		C = read.nextDouble();
		
		double mathA = Math.pow(A, 2);
		double mathB = Math.pow(B, 2);
		double mathC = Math.pow(C, 2);
			if(mathC <= 1000)
			{
				double D = 0.00;
				System.out.println("Insert value D: ");
				D = read.nextDouble(); 
				double mathD = Math.pow(D, 2);
				
				System.out.println("The square value of "+ A +" is: "+ mathA);
				System.out.println("The square value of "+ B +" is: "+ mathB);
				System.out.println("The square value of "+ C +" is: "+ mathC);
				System.out.println("The square value of "+ D +" is: "+ mathD);
			}
			else
			{
				System.out.println("The square value of "+ A +" is: "+ mathA);
				System.out.println("The square value of "+ B +" is: "+ mathB);
				System.out.println("The square value of "+ C +" is: "+ mathC);
				System.out.println("End of program.");
			}
		read.close();
	}
}
