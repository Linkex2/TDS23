package br.com.entidade;

public class Trilhas {

	private int idTrilha;
	private String nomeTrilha;
	private String descricao;
	
	
	public Trilhas(int idTrilha, String nomeTrilha) {
		super();
		this.idTrilha = idTrilha;
		this.nomeTrilha = nomeTrilha;
	
	}

	public Trilhas() {
		
	}

	public int getIdTrilha() {
		return idTrilha;
	}


	public void setIdTrilha(int idTrilha) {
		this.idTrilha = idTrilha;
	}


	public String getNomeTrilha() {
		return nomeTrilha;
	}


	public void setNomeTrilha(String nomeTrilha) {
		this.nomeTrilha = nomeTrilha;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Trilhas [idTrilha=" + idTrilha + ", nomeTrilha=" + nomeTrilha + ", descricao=" + descricao + "]";
	}

	
}
