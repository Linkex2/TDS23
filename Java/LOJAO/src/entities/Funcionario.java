package entities;

public class Funcionario extends Cliente{

	private String matricula;
	private String funcao;
	private double valorHora;
	private int horasTrabalhadas;
	
	public Funcionario(String cpf, String nome, int anoNascimento, String matricula, String funcao, double valorHora,
			int horasTrabalhadas) {
		super(cpf, nome, anoNascimento);
		this.matricula = matricula;
		this.funcao = funcao;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
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
	
	

}
