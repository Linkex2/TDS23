
public class CD {

	private String artista;
	private int numeroFaixa;
	private String gravadora;
	private String titulo;
	
	public CD(){

	}

	public CD(String artista, int numeroFaixa, String gravadora) {
		super();
		this.artista = artista;
		this.numeroFaixa = numeroFaixa;
		this.gravadora = gravadora;
	}
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getNumeroFaixa() {
		return numeroFaixa;
	}
	public void setNumeroFaixa(int numeroFaixa) {
		this.numeroFaixa = numeroFaixa;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "CD [artista=" + artista + ", numeroFaixa=" + numeroFaixa + ", gravadora=" + gravadora + "]";
	}

}
