package entities;
import java.util.Scanner;
public class Estudantil extends Conta{
	Scanner read = new Scanner(System.in);
	private double limiteEstudantil = 5.000;

	public Estudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}
	
	

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}



	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}



	public void usarEstudantil(double valorEstudantil){
	
		if(this.limiteEstudantil <= 0) 
		{
			System.out.println("Limite excedido, tente novamente.");
		}
		else if(valorEstudantil > this.limiteEstudantil)
			{
				System.out.println("Valor acima do limite, tente novamente");
			}
		
			else if(valorEstudantil < 0)
				{
					System.out.println("Valor negativo, tente novamente");
				}
		{

		this.limiteEstudantil = (this.limiteEstudantil - valorEstudantil);
		this.credito(valorEstudantil);
		}
	}
}