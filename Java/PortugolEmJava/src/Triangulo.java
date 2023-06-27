import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		double lenght = 0.0;
		double height = 0.0;
		System.out.println("Insert the lenght value: ");
		lenght = read.nextDouble();
			if(lenght < 0)
			{
			System.out.println("Fuck you.");
			}

				else if(lenght == 0)
				{
					System.out.println("Lenght equals zero: Try again.");
				}
					else
					{
						System.out.println("Insert height value: ");
						height = read.nextDouble();
					}
						if(height < 0)
						{
						System.out.println("Invalid height: try again.");
						}
			
							else if(height == 0)
							{
								System.out.println("Height equals zero: Try again.");
							}
								else
								{
									double area = (lenght * height) / 2;
									System.out.println("The triangle's area is: "+area);
								}
	read.close();
	}
}
