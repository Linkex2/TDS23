package br.com.cliente.dao;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionFactory {
    public Connection getConexao(){
        Connection conexao = null;
        try {
        	Class.forName("org.sqlserver.Driver");
            conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_Biblioteca;user=sa;password=TecInfo;" + "encrypt=true;trustServerCertificate=true");
            
            
        }catch(Exception e){
        	e.printStackTrace();
           System.out.println("SQLException: " + e.getMessage());
        }
        return conexao;
        
    }
    
}