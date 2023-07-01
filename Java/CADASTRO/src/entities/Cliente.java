package entities;

public class Cliente {
	private String cpf;
	private String nome;
	private boolean premium = false;
	private int nivel;
	private int anoNascimento;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public Cliente()
	{
		
	}
	
	public Cliente(String cpf, String nome, int anoNascimento) {
		this.cpf = cpf;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	public Cliente(String cpf, String nome, boolean premium, int nivel, int anoNascimento) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.premium = premium;
		this.nivel = nivel;
		this.anoNascimento = anoNascimento;
	}

	public void mostrarCpf(){
		System.out.println(this.cpf);
	}
	
	public void mostrarNome(){
		System.out.println(this.nome);
	}
	
	public void mostrarNivel(){
		System.out.println(this.nivel);
	}
	
	public void mostrarIdade(){
		System.out.println(2023 - this.anoNascimento);
	}

	public void mostrarPremium(){
		System.out.println(this.premium);
	}
	public void compraPremium(){
		this.premium = true;
		System.out.println("Usuario virou premium!");
	}
	
	public void cancelaPremium(){
		this.premium = false;
		System.out.println("Perdeu o primiu :c");
	}
	
	public void levelUp(){
		if(this.premium == true) {
		this.nivel = nivel + 2;
		System.out.println("Subiu de nível, wooow :OO");
		}
		else {
		this.nivel = nivel + 1;
		System.out.println("Subiu de nível, wow :O");
		}
	}
	
	public void levelDown(){
		this.nivel = nivel - 1;
		System.out.println("Perdeu a match.");
	}
	
}
