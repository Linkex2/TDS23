import java.util.Scanner;

public class Fabrica {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int eventoSegundos = 0;
		int segundos, horas, minutos;
		
		System.out.println("Digite o tempo do evento em segundo: ");
		eventoSegundos = leia.nextInt();
		
		horas = (eventoSegundos / 3600);
		minutos = (eventoSegundos % 3600/60);
		segundos = (eventoSegundos % 3600/60);	
		
		System.out.print("Horas: " + horas);
		System.out.print("Horas: " + minutos);
		System.out.print("Segundos: " + segundos);
		leia.close();
	}
}
