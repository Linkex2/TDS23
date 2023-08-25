package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectaBanco {

	public static void main(String[] args) {
	
		Connection con;
		Statement stmt;
		String query = "Select * From cd";

		/*try {
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			//Class.forName("jdbc:sqlserver://D9995NE074:1433;database=db_Bibliotecas;user=sa;password=TecInfo;encrypt=true;trustServerCertificate=true");
			
		}
		catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
		*/
		
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://D9995NE074:1433;database=db_Biblioteca;user=SA;password=TecInfo;encrypt=true;trustServerCertificate=true");
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("Lista de linhas da tabela do Banco:");
			while (rs.next()) {
				String s = rs.getString("titulo");
				String s1 = rs.getString("artista");				
				String s2 = rs.getString("gravadora");
				int s3 = rs.getInt("numeroFaixa");
				System.out.println(s + "	");
				
			}
			
		stmt.close();
		con.close();
		}
		catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}

}
