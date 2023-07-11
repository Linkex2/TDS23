package app;
import entities.Funcionario;
import entities.Terceiro;
public class ProgramaFuncionaro {

	public static void main(String[] args)
	{
		Funcionario f1 = new Funcionario("Edinaldo","Pereira",1000, 2000);
		Terceiro t1 = new Terceiro("Youtuber","Youtube","BRKSedu",1000, 2000,300);
		
		System.out.println("Bom dia "+f1.getNome()+"\nSeu salario é: R$" + f1.retornarSalario()+"0");
		
		System.out.println("Bom dia "+f1.getNome()+"\nSeu salario é: R$" + t1.retornarSalario()+"0");
		
		System.out.println(t1);
	}
}
