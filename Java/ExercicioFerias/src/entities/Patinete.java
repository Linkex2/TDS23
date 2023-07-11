package entities;

public class Patinete extends Aviao{

	public Patinete()
	{
		
	}
	
	public Patinete(String modelo, String cor, int anoFabricacao){
	}
	
	public void marcha1()
	{
		if(this.isLigado()==false){
		System.out.println("Ligue o Patinete...");
		}
		else if(this.velocidade <=10){
		this.velocidade += 10;	
		System.out.println("Iniciando marcha 1.");
		}
			else
			{
			this.velocidade = 10;
			System.out.println("Voltando a marcha 1.");
			}
	}
		
		public void marcha2()
		{
			if(this.isLigado()==false){
			System.out.println("Ligue o Patinete...");
			}
			else if(this.velocidade==10){
			this.velocidade += 10;
			System.out.println("Subindo a marcha 2.");
			}
				else
				{
				this.velocidade = 20;
				System.out.println("Mudando para marcha 2.");
				}
		}
		
		public void marcha3()
		{
			if(this.isLigado()==false){
			System.out.println("Ligue o Patinete...");
			}
			else if(this.velocidade==20){
			this.velocidade += 10;
			System.out.println("Subindo a marcha 3.");
			}
				else
				{
				this.velocidade = 30;
				System.out.println("Mudando para marcha 3.");
				}
		}
}
