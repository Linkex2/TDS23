package app;
import entities.Paciente;
public class ProgramaPaciente {

	Paciente p1 = new Paciente("12541-89","Wilson",2,1998,true);
	Paciente p2 = new Paciente("54987-17","Zanunes",3,1958,false);
	Paciente p3 = new Paciente("89115-68","Edinalso",3,2000,true);
	
	public void main(String[] args) {
		p1.info();
		p1.estaVivo();
		p1.nivelAtendimento();
		
		p2.estaVivo();
		
		p3.nivelAtendimento();
	}
}
