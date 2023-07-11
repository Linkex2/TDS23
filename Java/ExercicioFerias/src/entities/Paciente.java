package entities;

public class Paciente extends Cliente{

	private boolean vivo;

	public Paciente(String cpf, String nome, int nivel, int anoNascimento, boolean vivo) {
		this.vivo = vivo;
	}

	public void estaVivo()
	{
		if(this.vivo == true)
		{
			System.out.println("Paciente está vivo.");
		}
		else
		{
			System.out.println("Foi com deus.");
		}
	}
	
	public void nivelAtendimento()
	{
		switch (this.getNivel()){
		case 1:{
			System.out.println(this.getNome()+" tem prioridade baixa...");
			break;
		}
		case 2:{
			System.out.println(this.getNome()+" tem prioridade media.");
			break;
		}
		case 3:{
			System.out.println(this.getNome()+" tem prioridade Alta!");
			break;
		}
	
	}
	}

	public void info() {
		System.out.println("\nNome: " + this.getNome() +"\nCPF: " + this.getCpf());
	}
}
