package app;
import java.util.Scanner;
import entities.Terceiro;
import entities.Funcionario;
import entities.Cliente;
public class CadCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente c1 = new Cliente("1231234","Juninho",1997);
		Funcionario f1 = new Funcionario("1231532","Jerson",2002,"Unip","Agiota",2000,200);
		Terceiro t1 = new Terceiro("43534524","Aliana",1989,"Fundamental","Cosmetica",2000,200,"Jequiti",1000);
		
		System.out.println("O usuario é premium?: "+c1.isPremium());
		System.out.println("Seu CPF é: " + c1.getCpf());
		c1.mostrarIdade();
		c1.mostrarNome();
		System.out.println("Bem-Vindo(a) "+c1.getNome());
		System.out.println("Seu nivel atual é: "+c1.getNivel());
		c1.levelUp();
		System.out.println("Seu nivel atual é: "+c1.getNivel());
		c1.compraPremium();
		System.out.println("O usuario é premium?: "+c1.isPremium());
		c1.levelUp();
		System.out.println("Seu nivel atual é: "+c1.getNivel());
	}
}
