package app;
import entities.Aviao;

public class ProgramaAviao {

	public static void main(String[] args) {
	//Cria um Aviao chamado t1, que enche as variaveis de modelo, porte. 
	
	Aviao t1 = new Aviao("BIMOTOR", "MEDIO");
	Aviao t2 = new Aviao(0,false,"BOEING",2000);
	Aviao t3 = new Aviao();
	
	t1.ligar();
	System.out.println("Velocidade atual: "+t1.getVelocidade());
		
		for(int x = 1;x<=20; x+=1){
			t1.aumentarVelocidade();
			System.out.println("Velocidade atual: "+t1.getVelocidade());
		}
	
	t1.decolar();
		for(int x = 1;x<=60; x+=1){
			t1.aumentarVelocidade();
			System.out.println("Velocidade atual: "+t1.getVelocidade());
		}		
	t1.cruzeiro();
		for(int x = 1;x<=60;x+=1) {
		t1.diminuirVelocidade();
		System.out.println("Velocidade atual: "+t1.getVelocidade());
		}
		
	t1.pousar();
		for(int x = 1;x<=20;x+=1) {
			t1.diminuirVelocidade();
			System.out.println("Velocidade atual: "+t1.getVelocidade());
		}
	t1.desligar();
		
	}

}
