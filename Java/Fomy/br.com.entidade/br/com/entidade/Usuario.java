package br.com.entidade;

import java.sql.Date;

public class Usuario {

	private int idUsuario;
	private String email;
	private String nome;
	private String senha;
	private int idNivel;
	private int experiencia;
	private String foto;
	private int moeda;
	private Date dataCadastro;
	
	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String email, String nome, String senha) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
	}
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getMoeda() {
		return moeda;
	}
	public void setMoeda(int moeda) {
		this.moeda = moeda;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", nome=" + nome + ", senha=" + senha
				+ ", idNivel=" + idNivel + ", experiencia=" + experiencia + ", foto=" + foto + ", moeda=" + moeda
				+ ", dataCadastro=" + dataCadastro + "]";
	}
	
	
}
