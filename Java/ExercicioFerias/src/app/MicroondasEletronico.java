package app;
import entities.Eletronico;

public class MicroondasEletronico {

	public static void main(String[] args) {
		Eletronico e1 = new Eletronico("Eletrolux","Eletro",200);
		e1.ligar();
		e1.insiraTempo();
		e1.iniciar();
		e1.getModelo();
	}
}
