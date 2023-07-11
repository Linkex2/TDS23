package entities;
import java.util.Scanner;
public class Eletronico {
	private String fabricante;
	private String modelo;
	private boolean ligado = false;
	private int potencia;
	private int segundos;
	private int minutos;

	
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public Eletronico(){
		
	}
	
	public Eletronico(String modelo, String fabricante, int potencia) {
		super();
		this.modelo = modelo;
		this.modelo = fabricante;
		this.potencia = potencia;
	}
	
	public void ligar(){
		this.ligado = true;
		System.out.println("Ligando!");
	}
	
	public void desligar(){
		if(this.ligado == false){
		System.out.println("Já está desligado.");
		}
		else{
		this.ligado = false;
		System.out.println("Desligando.");
		}
	}
	
	public void insiraTempo(){
		Scanner leia = new Scanner(System.in);
		if(this.ligado == true){
			this.minutos = 0;
			this.segundos = 0;
			System.out.print("Insira o tempo desejado:\nMinutos: ");
			this.minutos = leia.nextInt();
			System.out.print("Segundos: ");
			this.segundos = leia.nextInt();
		leia.close();
		if(segundos > 59){
			do{
				
				this.segundos = this.segundos - 60;
				this.minutos = this.minutos + 1;
			}
			
			while(this.segundos > 59);
		}
			if(segundos > 9){
				System.out.println("Tempo selecionado: " + this.minutos + ":" + this.segundos);
			}
			else{
				System.out.println("Tempo selecionado: " + this.minutos + ":0" + this.segundos);
			}
		}
		
		else{
		System.out.println("Micro-ondas desligado, impossivel inserir tempo.");
		}
		
		
	}
	
	public void iniciar(){
		if(this.segundos >= 0 && this.minutos >= 0)
		{
			do{
				if(this.segundos > 9){
				System.out.println(this.minutos+":"+this.segundos);
				}
				else{
				System.out.println(this.minutos+":0"+this.segundos);
				}
				
				if(segundos == 0){
					this.minutos = this.minutos - 1;
					this.segundos = 59;
				}
				else
				{
					this.segundos = this.segundos - 1;
				}
			}
			while(this.minutos != 0 || this.segundos != 0);
			System.out.println("00:00");
			System.out.println("*Beep beep beep*\nSeu prato está aquecido.");
		}
		else
		{
			System.out.println("Tempo igual 0, utilize a função insiraTempo antes dessa.");
		}
	}
}
