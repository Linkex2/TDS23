package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppLoja {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		List <String> lista = new ArrayList<>();
		
		String nomes[] = {"Joao","Maria","Pedro"};
		nomes[0] = "Filipe";
		
		lista.add("Filipe");
		lista.add("Maria");
		lista.add("Pedro");
		lista.add("Claudio");
		lista.add("Antonio");
		
		/*for(int x=0;x<nomes.length;x++) {
			System.out.println(nomes[x]);
		}*/
		
		for(String epa : lista) {
			System.out.println(epa);
		}
		
		lista.add(1, "Caria");
		System.out.println();
		System.out.println("Nova Lista");
		for(String epa : lista) {
			System.out.println(epa);
			
		}
		lista.remove(3);
		System.out.println();
		System.out.println("Nova Lista");
		for(String epa : lista) {
			System.out.println(epa);
		}
		
		lista.add(0, "Epaminondas");
		System.out.println();
		System.out.println("Nova Lista");
		for(String epa : lista) {
			System.out.println(epa);
			
		}
		leia.close();
	}

}
