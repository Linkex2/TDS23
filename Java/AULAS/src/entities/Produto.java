package entities;

public class Produto {
	public String codigo;
	public String descricao;
	public double valorUnitario;
	public int estoque;
	
	public void incluirEstoque(int qtde) {
		//
		this.estoque += qtde;
	}
	
	public void tirarEstoque(int qtde) {
		//
		if(qtde<=0) {
			System.out.println("Impossivel realizar... Numero negativo.");
		}
		this.estoque -= qtde;
	}
}
