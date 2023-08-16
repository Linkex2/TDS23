package br.com.entidade;


public class Ingredientes {
	private int idIngrediente;
	private String Nome;
	
	public Ingredientes(int idIngrediente, String nome) {
		super();
		this.idIngrediente = idIngrediente;
		Nome = nome;
	}
	
	public Ingredientes() {
		
	}
	
	public int getIdIngrediente() {
		return idIngrediente;
	}
	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	@Override
	public String toString() {
		return "Ingredientes [idIngrediente=" + idIngrediente + ", Nome=" + Nome + "]";
	}

}

