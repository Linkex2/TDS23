import java.util.Scanner;
public class lacos {
	public static void main(String[] args)
	{
	Scanner leia = new Scanner(System.in);
		
	char op=' ';
		
		do
		{
			
			for(int i=1;i<=60;i = i + 1)
			{
			System.out.print("-");
			}
		
			System.out.println();
			System.out.print("Continue S/N :");
			op=leia.next().toUpperCase().charAt(0);
		
		}
		while(op!='N');
		
		while(true)
		{
			System.out.print("Fala serio!");
			System.out.print("Continuar?");
			op = leia.next().toUpperCase().charAt(0);
				
				if(op =='N');
				{
				System.out.print("Bye Bye");
				break;
				}
		}
	leia.close();
	}
}
