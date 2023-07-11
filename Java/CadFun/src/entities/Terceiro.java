package entities;

public class Terceiro extends Funcionario{
	
	private String codEmpresa;
	private double adicionalTerceiro;
	public Terceiro() {}
	
	public Terceiro(String matricula, String codEmpresa, String nome, double valorHora, int horasTrabalhadas, double adicionalTerceiro) {
		super(matricula, nome, valorHora, horasTrabalhadas);
		this.codEmpresa = codEmpresa;
		this.adicionalTerceiro = adicionalTerceiro;
	}
	
	public Terceiro(String matricula, String codEmpresa, String nome) {
		super(matricula, nome);
		this.codEmpresa = codEmpresa;
	}
	
	
	public String getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public double getAdicionalTerceiro() {
		return adicionalTerceiro;
	}

	public void setAdicionalTerceiro(double adicionalTerceiro) {
		this.adicionalTerceiro = adicionalTerceiro;
	}
	
	@Override
	public double retornarSalario()
	{
		return (super.getValorHora() * super.getHorasTrabalhadas() + this.adicionalTerceiro);
	}
}
