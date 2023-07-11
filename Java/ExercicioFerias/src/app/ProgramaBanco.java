package app;
import entities.ContaBancaria;
import java.util.Scanner;
public class ProgramaBanco {

	Scanner leia = new Scanner(System.in);
	public void main(String[] args){
	ContaBancaria c1 = new ContaBancaria (25687,"667.838.888-78","Junilus do Belumonte",1960,10000);
	ContaBancaria c2 = new ContaBancaria (00015,"667.838.888-78","Aludarco Pensylvania",1746,10000,"2397-0067");
	ContaBancaria c3 = new ContaBancaria (68786,"667.838.888-78","Maria Santos do Monte",1995,24500,"8762-8755","mariaMount@hotmail.com");
	
	c1.info();
	c2.info();
	c3.info();
	c1.menu();
	
	}
}
