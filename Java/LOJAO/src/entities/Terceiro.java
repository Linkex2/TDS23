package entities;

public class Terceiro extends Funcionario{

		private String nomeEmpresaTerceira;
		private double diferencialSalario;
		
		public Terceiro(String nome, String matricula, double valorHora,
				int horasTrabalhadas, String nomeEmpresaTerceira, double diferencialSalario) {
			super(nome, matricula, valorHora, horasTrabalhadas);
			this.nomeEmpresaTerceira = nomeEmpresaTerceira;
			this.diferencialSalario = diferencialSalario;
		}
		
		
}
