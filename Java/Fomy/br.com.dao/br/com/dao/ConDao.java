package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConDao {
	public Connection getConnection() {
		Connection con = null;
		 String jdbcUrl = "jdbc:mysql://192.168.84.125:32769/FomyTestes";
	     String username = "root";
	     String password = "St4tyon@rY2";

	        try {
	            con = DriverManager.getConnection(jdbcUrl, username, password);
	            System.out.println("Connected to the database!");
	            
	            Statement stmt = con.createStatement();
	            
	            String sql = "Insert into Usuarios "
	            		+ "(Email, Nome, Senha)"
	            		+ "values ('juninhogemaplays@gamers.org', 'Julho', 'HyperDriv3')";
	            
	            stmt.executeUpdate(sql);
	            
	            System.out.print("Insert funcionando Poggers");
	            // Now you can perform database operations using this connection
	            
	            con.close(); // Don't forget to close the connection when done
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		return con;
	}

}

