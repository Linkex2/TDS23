package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionario;
import entities.Terceiro;

public class CadFun {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List <Funcionario> cadastro = new ArrayList<>();
		//Funcionario
		String nome;
		String matricula;
		String funcao;
		double valorHora;
		int horasTrabalhadas;
		
		//Terceiro
		String nomeEmpresaTerceira;
		double diferencialSalario;
		int qtde=0;
		char tipo;
		
		System.out.println("-=-=- Cadastro de Funcionario -=-=-");
		System.out.println();
		System.out.println("Quantos funcionarios você vai cadastrar?");
		qtde = leia.nextInt();
		
		for(int x=1;x<=qtde;x++) {
			//leia.nextLine(); //Apenas para limpar erros no teclado.
			System.out.println("Matricula: ");
			matricula = leia.next();
			System.out.println("Nome: ");
			nome = leia.nextLine();
			System.out.println("Valor por hora: ");
			valorHora = leia.nextDouble();
			System.out.println("Horas trabalhadas: ");
			horasTrabalhadas = leia.nextInt();
			System.out.println("Digite F-funcionario ou T-terceiro: ");
			tipo = leia.next().toUpperCase().charAt(0);
			if(tipo == 'T')
				System.out.println("Nome da empresa terceira: ");
				nomeEmpresaTerceira = leia.next();
				System.out.println("Valor do adicional: ");
				diferencialSalario = leia.nextDouble();
				cadastro.add(new Terceiro(nome, matricula, valorHora,
						horasTrabalhadas, nomeEmpresaTerceira, diferencialSalario));
		}
		/*
		cadastro.add(new Funcionario ("34596-46","Jababa",2002,"Engenho","WebMaster",10.00,10));
		cadastro.add(new Terceiro ("34596-47","Babaja",2002,"Engenheira","WebMiss",10.00,10,"Fomy Inc.",1000));
		*/
		
		for(Funcionario x : cadastro) {
			
		}
		leia.close();
	}
}
