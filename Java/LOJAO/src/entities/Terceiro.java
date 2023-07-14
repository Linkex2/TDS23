package entities;

public class Terceiro extends Funcionario{

		private String nomeEmpresaTerceira;
		private double diferencialSalario;
		
		public Terceiro(String cpf, String nome, int anoNascimento, String matricula, String funcao, double valorHora,
				int horasTrabalhadas, String nomeEmpresaTerceira, double diferencialSalario) {
			super(cpf, nome, anoNascimento, matricula, funcao, valorHora, horasTrabalhadas);
			this.nomeEmpresaTerceira = nomeEmpresaTerceira;
			this.diferencialSalario = diferencialSalario;
		}
		
		
}
