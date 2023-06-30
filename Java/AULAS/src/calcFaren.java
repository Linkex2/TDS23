import java.util.Scanner;
public class calcFaren {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double temp = 0;
		System.out.print("Escreva sua temperatura: C");
		temp = read.nextInt();
		System.out.printf("A temperatura em Faren é: "+(temp * 9/5) + 32 +"F");
	read.close();
	} 
}
