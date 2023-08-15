package br.com.entidade;

public class Receitas {

	
	private int idReceita;
	private String nome;
	private String descricao;
	private String imagemThumb;
	private String imagem;
	private int experiencia;
	private int valor;
	
	public Receitas() {
		
	}
	
	public Receitas(int idReceita, String nome, String descricao, int experiencia, int valor) {
		super();
		this.idReceita = idReceita;
		this.nome = nome;
		this.descricao = descricao;
		this.experiencia = experiencia;
		this.valor = valor;
	}
	
	public int getIdReceita() {
		return idReceita;
	}
	public void setIdReceita(int idReceita) {
		this.idReceita = idReceita;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagemThumb() {
		return imagemThumb;
	}
	public void setImagemThumb(String imagemThumb) {
		this.imagemThumb = imagemThumb;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Receitas [idReceita=" + idReceita + ", nome=" + nome + ", descricao=" + descricao + ", imagemThumb="
				+ imagemThumb + ", imagem=" + imagem + ", experiencia=" + experiencia + ", valor=" + valor + "]";
	}
	
	
}
