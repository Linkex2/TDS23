package entities;

public class Pessoa {

		public String cpf;
		public String nome;
		public boolean vivo;
		public int anoNascimento;
		


		public void mostrarIdade()
		{
			{
				System.out.println(this.nome + ". Sua idade é "+ (2023 - this.anoNascimento));
			}
		}
		
		public int calculaIdade(int anoAtual) 
			{
				return anoAtual - this.anoNascimento;
			}
		
}