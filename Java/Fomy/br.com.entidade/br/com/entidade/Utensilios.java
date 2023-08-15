package br.com.entidade;

public class Utensilios {

	private int idUtensilio;
	private String nome;
	
	public Utensilios() {
		
	}
	
	public Utensilios(int idUtensilio, String nome) {
		super();
		this.idUtensilio = idUtensilio;
		this.nome = nome;
	}
	
	public int getIdUtensilio() {
		return idUtensilio;
	}
	public void setIdUtensilio(int idUtensilio) {
		this.idUtensilio = idUtensilio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Utensilios [idUtensilio=" + idUtensilio + ", nome=" + nome + "]";
	}
	
	
		
}
