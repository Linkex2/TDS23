package entities;

public class Aviao {
	

	int velocidade;
	private boolean ligado;
	private String porte;
	private String modelo;
	private String cor;
	private int anoFabricacao;
	
	//É possivel fazer um construtor vazio, sendo ele o construtor padrão.
	public Aviao() {
		
	}
	
	//Isto é um construtor, que enche as variaveis da classe com destes dados.
	public Aviao(String modelo, String porte) {
		this.modelo = modelo;
		this.porte = porte;
	}
	
	//é possivel fazer varios construtores ao mesmo tempo
	public Aviao(int velocidade, boolean ligado, String modelo,int anoFabricacao) {
		this.velocidade = velocidade;
		this.ligado = ligado;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	public Aviao(int velocidade, boolean ligado, String porte, String modelo, String cor, int anoFabricacao) {
		super();
		this.velocidade = velocidade;
		this.ligado = ligado;
		this.porte = porte;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
	}
	

	//Metodos Proprios
public void ligar() {
	this.ligado = true;
	System.out.println("Avião ligando...");
}

		//Encapsulamento, que permite modificar atributos sem deixalos publicos
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public String getPorte() {
		return porte;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public void desligar() {
	
		if(this.velocidade > 0){
		System.out.println("Avião em movimento, não é possivel desligar!");
		}
		
		else{
		this.ligado = false;
		System.out.println("Avião deligando!");
		}
	}
	
	public void aumentarVelocidade() {
		if(this.ligado==false){
		System.out.println("Ligue o avião...");
		}
		else if(this.velocidade <=790){
		this.velocidade += 10;
		}
	}
	
	public void diminuirVelocidade() {
		this.velocidade -= 10;
	}
	
	public void decolar() {
		if(this.velocidade>=200){
		System.out.println("Avião Decolando..!");	
		}
		
		else{
		System.out.println("Invalido, adicione mais velocidade.");	
		}
	}
	
	public void pousar() {
		System.out.println("Avião Pousando...");
	}
	
	public void cruzeiro() {
		System.out.println("Avião em vôo cruzeiro... Piloto automatico...");
	}
	
}
