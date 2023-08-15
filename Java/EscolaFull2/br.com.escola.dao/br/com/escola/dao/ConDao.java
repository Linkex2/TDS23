package br.com.escola.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConDao {
	public Connection getConexao() {
		
		Connection con = null;
		try {
		con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433,databaseName=EscolaFull","sa","suaSenha");			
			
		}
		catch (Exception e) {
		System.out.println(e.getMessage());	
		}
		return con;
	}
	
	}
