package app;
import entities.Funcionario;
public class SalarioFuncionario {

	public static void main(String[] args)
	{
		Funcionario f1 = new Funcionario("441.312.610-65","Josefa dos Santos",1998,"Formação Itau","Contadora",200);
		
		f1.mostrarNome();
		f1.mostrarIdade();
		f1.mostrarMatricula();
		f1.setValorHora(200);
		f1.setHorasTrabalhadas(10);
		f1.calculaSalario();
	}
}
