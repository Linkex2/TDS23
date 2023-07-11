package app;
import entities.Patinete;
public class ProgramaPatinete {

		public static void main(String[] args){
			Patinete p1 = new Patinete("Off Road 10","Branco-Preto",2003);
			
			p1.ligar();
			p1.marcha1();
			System.out.println(p1.getVelocidade());
			p1.marcha2();
			System.out.println(p1.getVelocidade());
			p1.marcha3();
			System.out.println(p1.getVelocidade());
			p1.marcha1();
			p1.diminuirVelocidade();
			p1.desligar();
		}
}
