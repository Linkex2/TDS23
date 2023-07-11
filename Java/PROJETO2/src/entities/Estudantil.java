package entities;

public class Estudantil extends Conta{

	private double limiteEstudantil = 5000.00;

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



	public void usarEstudantil(){
		if(this.limiteEstudantil > this.valor) 
		{
		(this.valor - this.limiteEstudantil;)
		(this.valor + this.getSaldo();)
		}
		else
		{
			System.out.println("Limite excedido, tente denovo.");
			
		}
	}
}