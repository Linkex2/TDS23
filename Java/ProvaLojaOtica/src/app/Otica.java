package app;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.ProdutoOtica;

public class Otica {
	

	
	public static ProdutoOtica lista = new ProdutoOtica();
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		char escolha;
            
		System.out.println("Bom dia, oque gostaria de fazer?\n1 - Incluir Novo Produto\n2 - Alterar Produto\n3 - Excluir Produto\n 4 - Comprar Produto\n5 - Sair");
		escolha = leia.next().toUpperCase().charAt(0);
		if(escolha == '1')
		{
			incluirProdutos();
		}
			else if(escolha == '2')
			{
				alterarProduto();
			}
				else if(escolha == '3')
				{
					excluirProduto();
				}
					else if(escolha == '4')
					{
						comprarProduto();
					}
						else if(escolha == '5')
						{
							System.out.println("Goodbye.");
						}
			else{
			System.out.println("Digita direito bro.");	
			}
		
	}
	public static void incluirProdutos()
	{
		//Inclusão de Produtos
		System.out.println("Quantos produtos quer adicionar?");
		int quantos = leia.nextInt();
		
		do
		{
			lista.add(new ProdutoOtica)
		}
		while(quantos > 0);
	}
}