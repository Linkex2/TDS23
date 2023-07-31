package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Produto {

	Scanner leia = new Scanner(System.in);
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	private double margemLucro;
	
	
	public Produto(String codigo, String nome, double valor, int estoque, int margemLucro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
		this.margemLucro = margemLucro;
	}
	
	public Produto() {
		
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(int margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	public double valorCompra(int quantidade) {
		return (this.valor * quantidade + ((this.valor * quantidade) * this.margemLucro));
	}
	
	public void incluirEstoque(int quantidade) {
	if(quantidade > this.estoque)
	{
		System.out.println("Exluindo mais do que o Estoque!\n Tente novamente!");
	}
		else if(this.estoque == 0)
			{
			System.out.println("Estoque já zerado!\n Finalizando Programa.");
			}
		else
		{
		this.estoque = quantidade + this.estoque;
		}
	
	}
	public void excluirEstoque(int quantidade) {
		if(quantidade > this.estoque)
		{
			System.out.println("Exluindo mais do que o Estoque!\n Tente novamente!");
			excluirEstoque(leia.nextInt());
		}
		else if(this.estoque == 0)
			{
				System.out.println("Estoque já zerado!\n Finalizando Programa.");
			}
			else
				{
					this.estoque = quantidade - this.estoque;
				}
	}
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", estoque="
				+ estoque + ", margemLucro=" + margemLucro + "]";
	}


}


