package entities;
import java.util.Scanner;
public class ContaBancaria extends Cliente{
	
	Scanner leia = new Scanner(System.in);
	private double saldo;
	private int numConta;
	private String email = "N/A";
	private String telefone = "N/A";
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(int numConta, String cpf, String nome, int anoNascimento, double saldo) {
		super(cpf, nome, anoNascimento);
		this.numConta = numConta;
		this.saldo = saldo;
		
	}

	public ContaBancaria(int numConta, String cpf, String nome, int anoNascimento, double saldo, String telefone) {
		super(cpf, nome, anoNascimento);
		this.numConta = numConta;
		this.saldo = saldo;
		this.telefone = telefone;
		
	}
	
	public ContaBancaria(int numConta, String cpf, String nome, int anoNascimento, String email, double saldo) {
		super(cpf, nome, anoNascimento);
		this.numConta = numConta;
		this.saldo = saldo;
		this.email = email;
		
	}
	
	public ContaBancaria(int numConta, String cpf, String nome, int anoNascimento, double saldo, String telefone, String email) {
		super(cpf, nome, anoNascimento);
		this.numConta = numConta;
		this.saldo = saldo;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void info() {
		System.out.println("Conta: " + this.getNumConta() +"\nNome: " + this.getNome() +"\nCPF: " + this.getCpf() + "\nNumero Telefonico: "+this.getTelefone()+"\nEmail: "+this.getEmail());
	}
	
	public void saldoAtual() {
		System.out.println("Saldo atual: " + this.getSaldo());
	}
	
	public void deposito() {
		System.out.println("Informe o valor do deposito: R$");
		double deposito = leia.nextDouble();
		
		if(deposito <= 0){
			System.out.println("Valor invalido, tente novamente.");
		}
		else{
			this.saldo = deposito + this.saldo;
			System.out.println("Valor depositado: R$" + deposito + "0");
			System.out.println("Seu saldo atual é: R$" + this.saldo + "0");
		}
		
	}
	
	public void saque() {
		System.out.println("Informe o valor do deposito: R$");
		double saque = leia.nextDouble();
		
		if(saque <= 0){
			System.out.println("Valor invalido, tente novamente.");
		}
			else{
				this.saldo = saque - this.saldo;
				System.out.println("Valor saqueado: R$" + saque + "0");
				System.out.println("Seu saldo atual é: R$" + this.saldo + "0");
			}
		
		
	}
	
	public void menu(){
	int escolha = 0;
	System.out.println("Bom dia "+this.getNome()+"\n Oque deseja fazer hoje?");
	System.out.println("Bom dia "+this.getNome()+"1 - Deposito\n2 - Saque\n3 - Saldo Atual");
	escolha = leia.nextInt();
	
	if(escolha >=1 || escolha <=3){
		switch (escolha){
			case 1:{
				this.deposito();
				break;
			}
			case 2:{
				this.saque();
				break;
			}
			case 3:{
				this.saldoAtual();
				break;
			}
		
		}

	}
	
	else
	{
		System.out.println("Operação invalida, tente novamente");
		this.menu();
	}
	
	}
}

