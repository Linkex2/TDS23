package entities;

public class Funcionario{

	private String nome;
	private String matricula;
	private double valorHora;
	private int horasTrabalhadas;
	
	public Funcionario(String nome, String matricula, double valorHora,
			int horasTrabalhadas) {
		this.nome = nome;
		this.matricula = matricula;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	 
	public double retornarSalario() {
		this.gethorasTrabalhadas * this.valorHora
	}
	
	@Override
	public String toString() {
		return "matricula: " + matricula
				+ "\nnome=" + nome
				+ "\nvalorHora=" + valorHora
				+ "\nhorasTrabalhadas=" + horasTrabalhadas
				+ "\nretornarSalario()=" + retornarSalario();
	}

}
