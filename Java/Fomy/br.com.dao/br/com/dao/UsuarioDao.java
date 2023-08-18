package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.entidade.Usuario;

public class UsuarioDao extends ConDao {
	
public void alterar(Usuario usuario) {
	
try {
Connection conexao = getConnection();

PreparedStatement pstmt = conexao.prepareStatement("update Usuarios set Email = ?, Nome = ?, Senha = ? where IdUsuario = ?");
pstmt.setString(1, usuario.getEmail());
pstmt.setString(2, usuario.getNome());
pstmt.setString(3, usuario.getSenha());
pstmt.setInt(4, usuario.getIdUsuario());

pstmt.execute();
pstmt.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public void alterarFoto(Usuario usuario) {
	
try {
Connection conexao = getConnection();

PreparedStatement pstmt = conexao.prepareStatement("update Usuarios set Foto = ? where IdUsuario = ?");
pstmt.setString(1, usuario.getFoto());
pstmt.setInt(2, usuario.getIdUsuario());

pstmt.execute();
pstmt.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}


public void excluir(Usuario usuario) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("delete from Usuarios where IdUsuario = ?");
pstm.setLong(1, usuario.getIdUsuario());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public boolean existe(Usuario usuario) {
boolean achou = false;
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from Usuarios where IdUsuario = ?");
pstm.setLong(1, usuario.getIdUsuario());
ResultSet rs = pstm.executeQuery();
if(rs.next()) {
achou = true;
}
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}

return achou;
}

public void inserir(Usuario usuario) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("insert into Usuarios values (?, ?, ?)");
pstm.setString(1, usuario.getEmail());
pstm.setString(2, usuario.getNome());
pstm.setString(3, usuario.getSenha());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public List<Usuario> listar() {
List<Usuario> lista = new ArrayList<>();
try {
Connection conexao = getConnection();

Statement stm = conexao.createStatement();
ResultSet rs = stm.executeQuery("select * from Usuario");
while(rs.next()) {
	Usuario usuario = new Usuario();
usuario.setIdUsuario(rs.getInt("IdUsuario"));
usuario.setEmail(rs.getString("Email"));
usuario.setNome(rs.getString("Nome"));
usuario.setSenha(rs.getString("Senha"));
lista.add(usuario);
}
stm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return lista;
}

public Usuario consultar(Usuario usuario) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from Usuarios where IdUsuario = ?");
pstm.setInt(1, usuario.getIdUsuario());
ResultSet rs = pstm.executeQuery();
if(rs.next()) {
usuario.setIdUsuario(rs.getInt("IdUsuario"));
usuario.setEmail(rs.getString("Email"));
usuario.setNome(rs.getString("Nome"));
usuario.setSenha(rs.getString("Senha"));
}
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return usuario;
}

}