package br.com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.entidade.Trilhas;

public class TrilhasDao extends ConDao {
public void alterar(Trilhas trilha) {
try {
Connection conexao = getConnection();

PreparedStatement pstmt = conexao.prepareStatement("update Trilhas set NomeTrilha = ?, Descricao = ? where IdTrilha = ?");
pstmt.setString(1, trilha.getNomeTrilha());
pstmt.setString(2, trilha.getDescricao());

pstmt.setLong(3, trilha.getIdTrilha());
pstmt.execute();
pstmt.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public void excluir(Trilhas trilha) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("delete from Trilhas where IdTrilha = ?");
pstm.setLong(1, trilha.getIdTrilha());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public boolean existe(Trilhas trilha) {
boolean achou = false;
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from Trilhas where IdTrilha = ?");
pstm.setLong(1, trilha.getIdTrilha());
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

public void inserir(Trilhas trilha) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("insert into Trilhas values (?, ?)");
pstm.setString(1, trilha.getNomeTrilha());
pstm.setString(2, trilha.getDescricao());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public List<Trilhas> listar() {
List<Trilhas> lista = new ArrayList<>();
try {
Connection conexao = getConnection();

Statement stm = conexao.createStatement();
ResultSet rs = stm.executeQuery("select * from Trilhas");
while(rs.next()) {
Trilhas trilha = new Trilhas();
trilha.setIdTrilha(rs.getInt("IdTrilha"));
trilha.setNomeTrilha(rs.getString("NomeTrilha"));
trilha.setDescricao(rs.getString("Descricao"));
lista.add(trilha);
}
stm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return lista;
}

public Trilhas consultar(Trilhas trilha) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from Trilhas where IdTrilha = ?");
pstm.setLong(1, trilha.getIdTrilha());
ResultSet rs = pstm.executeQuery();
if(rs.next()) {
trilha.setIdTrilha(rs.getInt("IdTrilha"));
trilha.setNomeTrilha(rs.getString("NomeTrilha"));
trilha.setDescricao(rs.getString("Descricao"));
}
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return trilha;
}

}