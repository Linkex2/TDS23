package entities;

public class Funcionario {
	
	private String matricula;
	private String nome;
	private double valorHora;
	private int horasTrabalhadas;
	
	public Funcionario() {}
	
	public Funcionario(String matricula, String nome) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Funcionario(String matricula, String nome, double valorHora, int horasTrabalhadas) {
		this.matricula = matricula;
		this.nome = nome;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double retornarSalario()
	{
		return (getValorHora() * getHorasTrabalhadas());
	}

//é possivel fazer um System.out mostrar informaççoes especificas de um objeto
	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", valorHora=" + valorHora
				+ ", horasTrabalhadas=" + horasTrabalhadas + ", retornarSalario()=" + retornarSalario() + "]";
	}
	
}

