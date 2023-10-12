package com.cadastrousuario.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cadastrousuario.ben.Usuario;


public class UsuarioDao {
   public static Connection getConnection() {
       Connection con = null;
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                   + "databaseName=empresa;user=SA;password=" + "TecInfo;encrypt=true;trustServerCertificate=true");

       } catch (Exception e) {
           System.out.println(e);
           System.err.println("SQLException: " + e.getMessage());

           // TODO: handle exception
       }
       return con;
   }

   // lista todos os usuarios
   public static List<Usuario> getAllusuarios() {
       List<Usuario> listUsuario = new ArrayList<Usuario>();

       try {
           Connection conecta = UsuarioDao.getConnection();
           PreparedStatement ps = conecta.prepareStatement("select * from usuarioServlet");
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               Usuario usuario = new Usuario();
               usuario.setId_usuario(rs.getInt("id_usuario"));
               usuario.setNome(rs.getString("nome"));
               usuario.setEmail(rs.getString("email"));
               usuario.setPais(rs.getString("pais"));
               usuario.setSenha(rs.getString("senha"));
               usuario.setSexo(rs.getString("sexo"));
               listUsuario.add(usuario);
           }
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println(e);
           // TODO: handle exception
       }
       return listUsuario;
   }
   
   
   
   //Atualiza empreadoBanco
   
       public static Usuario getRegistroById(int id) {
               Usuario usuario = null;
               
           try {
               Connection con = getConnection();
               //fazer query do Update
               PreparedStatement ps =con.prepareStatement("select * from usuarioServlet where id_usuario=?");
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                   usuario = new Usuario();
                   usuario.setId_usuario(rs.getInt("id_usuario"));
                   usuario.setNome(rs.getString("nome"));
                   usuario.setEmail(rs.getString("email"));
                   usuario.setPais(rs.getString("pais"));
                   usuario.setSenha(rs.getString("senha"));
                   usuario.setSexo(rs.getString("sexo"));
               }
           } catch (Exception e) {
               e.printStackTrace();
               // TODO: handle exception
           }
           return usuario;
       }

}