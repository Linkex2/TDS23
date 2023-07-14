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
		
		
		cadastro.add(new Funcionario ("34596-46","Jababa",2002,"Engenho","WebMaster",10.00,10));
		cadastro.add(new Terceiro ("34596-47","Babaja",2002,"Engenheira","WebMiss",10.00,10,"Fomy Inc.",1000));
		
		leia.close();
	}
}
