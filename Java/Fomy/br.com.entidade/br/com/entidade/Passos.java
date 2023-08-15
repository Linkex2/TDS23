package br.com.entidade;

import java.sql.Date;

public class Passos {

	private int idPasso;
	private String titulo;
	private Date timer;
	private String passo;
	private String video;
	
	public Passos() {
		
	}
	
	public Passos(int idPasso, String titulo, Date timer, String passo, String video) {
		super();
		this.idPasso = idPasso;
		this.titulo = titulo;
		this.timer = timer;
		this.passo = passo;
		this.video = video;
	}

	public int getIdPasso() {
		return idPasso;
	}

	public void setIdPasso(int idPasso) {
		this.idPasso = idPasso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getTimer() {
		return timer;
	}

	public void setTimer(Date timer) {
		this.timer = timer;
	}

	public String getPasso() {
		return passo;
	}

	public void setPasso(String passo) {
		this.passo = passo;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "Passos [idPasso=" + idPasso + ", titulo=" + titulo + ", timer=" + timer + ", passo=" + passo
				+ ", video=" + video + "]";
	}
	
	
}
