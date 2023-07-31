package entities;

import java.util.ArrayList;
import java.util.List;

public class ProdutoOtica extends Produto{

	public List <ProdutoOtica> lista = new ArrayList<>();
	private int grau;
	private String cor;
	
	public ProdutoOtica() {
		super();
	}
	
	public ProdutoOtica(String codigo, String nome, double valor, int estoque, int margemLucro, int grau, String cor) {
		super(codigo, nome, valor, estoque, margemLucro);
		this.grau = grau;
		this.cor = cor;
	}
	
	public List<ProdutoOtica> getLista() {
		return lista;
	}

	public void setLista(List<ProdutoOtica> lista) {
		this.lista = lista;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	@Override
	public String toString() {
		return "OticaProduto [lista=" + lista + ", grau=" + grau + ", cor=" + cor + "]";
	}
	
	
}
