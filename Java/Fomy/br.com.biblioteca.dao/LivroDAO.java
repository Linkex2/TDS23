import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

private Connection con;
	
	public LivroDAO() {
	ConnectionFactory cf = new ConnectionFactory();
	con = cf.getConnection();
	}

	public void inserirCd(Livro livro) {
		String scriptSql = "INSERT INTO CD (titulo, autor,editora,numeroPaginas)" + "VALUES (?,?,?,?)";

		
	try {
		PreparedStatement stmt = con.prepareStatement(scriptSql);
		stmt.setString(1, livro.getTitulo());
		stmt.setString(2, livro.getAutor());
		stmt.setString(3, livro.getEditora());
		stmt.setInt(4, livro.getNumeroPaginas());

		stmt.execute();
		stmt.close();
	
		System.out.println("\nLivro inserido com sucesso!\n");
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	}
}
	
	public void deletaLivro(Livro livro) {
		String scriptSql = "DELETE FROM LIVRO WHERE codLivro = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setInt(1, livro.getCodigo());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("\nLivro excluido com Sucesso!/n");
		} catch (Exception e) {
			System.out.println("Erro :" + e.getMessage());
		}
	}
	
	public void atualizarCd(Livro livro) {
		String scriptSql = "UPDATE LIVRO SET titulo = ?, artista = ?, numeroFaixas = ?, gravadora = ? WHERE codCd = ?";

		
	try {
		PreparedStatement stmt = con.prepareStatement(scriptSql);
		stmt.setString(1, livro.getTitulo());
		stmt.setString(2, livro.getAutor());
		stmt.setString(3, livro.getEditora());
		stmt.setInt(4, livro.getNumeroPaginas());

		stmt.execute();
		stmt.close();
	
		System.out.println("\nLivro atualizado com sucesso!\n");
	} catch(SQLException e) {
		System.out.println("Erro :" + e.getMessage());
	}
}
	
	public List<Livro> listarLivros()
	{
		List<Livro> listaLivros = new ArrayList<Livro>();
		
	String scriptSql = "Select * From LIVRO";
	
	try {
		PreparedStatement stmt = con.prepareStatement(scriptSql);
		ResultSet resultSet = stmt.executeQuery();
		
		while(resultSet.next())
		{
			Livro livro = new Livro();
			
			livro.setCodigo(resultSet.getInt("codLivro"));
			livro.setTitulo(resultSet.getString("titulo"));
			livro.setAutor(resultSet.getString("auutor"));
			livro.setEditora(resultSet.getString("editora"));
			livro.setNumeroPaginas(resultSet.getInt("numeroPaginas"));

			listaLivros.add(livro);
		}
	
	resultSet.close();
	stmt.close();
	
	} catch (Exception e) {
		System.out.println("Erro : " + e.getMessage());
	}
	return listaLivros;
}
	
}
