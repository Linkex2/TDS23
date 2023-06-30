import java.util.Locale;
import java.util.Scanner;
public class Paulistinha {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
				
		String[] times = new String[4];
		
		int pontos[] = {0,0,0,0};
 		
		for (int x=0; x<times.length;x++)
		{
			System.out.println("Digite o nome do time: ");
			times[x] = leia.next();
		}
		
		for (int x=0;x<times.length;x++)
		{
			System.out.println(times[x]);
			System.out.println("Quantidade de letras: "+times[x].toUpperCase().length());
		}
		leia.close();
	}
}
