package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.entidade.Ingredientes;

public class IngredientesDao extends ConDao {
public void alterar(Ingredientes ingredientes) {
try {
Connection conexao = getConnection();

PreparedStatement pstmt = conexao.prepareStatement("update Ingredientes set Nome = ? where IdIngrediente = ?");
pstmt.setString(1, ingredientes.getNome());
pstmt.setInt(2, ingredientes.getIdIngrediente());

pstmt.execute();
pstmt.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public void excluir(Ingredientes ingredientes) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("delete from Ingredientes where IdIngrediente = ?");
pstm.setLong(1, ingredientes.getIdIngrediente());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public boolean existe(Ingredientes ingredientes) {
boolean achou = false;
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from IdIngredientes where IdIngrediente = ?");
pstm.setLong(1, ingredientes.getIdIngrediente());
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

public void inserir(Ingredientes ingredientes) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("insert into Ingredientes values (?)");
pstm.setString(1, ingredientes.getNome());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public List<Ingredientes> listar() {
List<Ingredientes> lista = new ArrayList<>();
try {
Connection conexao = getConnection();

Statement stm = conexao.createStatement();
ResultSet rs = stm.executeQuery("select * from Ingredientes");
while(rs.next()) {
Ingredientes ingrediente = new Ingredientes();
ingrediente.setIdIngrediente(rs.getInt("IdIngrediente"));
ingrediente.setNome(rs.getString("Nome"));
lista.add(ingrediente);
}
stm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return lista;
}

public Ingredientes consultar(Ingredientes ingredientes) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from Ingredientes where IdIngrediente = ?");
pstm.setLong(1, ingredientes.getIdIngrediente());
ResultSet rs = pstm.executeQuery();
if(rs.next()) {
ingredientes.setIdIngrediente(rs.getInt("IdIngrediente"));
ingredientes.setNome(rs.getString("Nome"));
}
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return ingredientes;
}

}