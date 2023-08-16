package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.entidade.Passos;

public class PassoDao extends ConDao {
public void alterar(Passos passos) {
try {
Connection conexao = getConnection();

PreparedStatement pstmt = conexao.prepareStatement("update Passos set Titulo = ?, Timer = ?, Passo = ?, Video = ? where IdPasso = ?");
pstmt.setString(1, passos.getTitulo());
pstmt.setDate(2, new java.sql.Date(passos.getTimer().getTime()));
pstmt.setString(3, passos.getPasso());
pstmt.setString(4, passos.getVideo());
pstmt.setInt(5, passos.getIdPasso());
pstmt.execute();
pstmt.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public void excluir(Passos passos) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("delete from Passos where IdPasso = ?");
pstm.setInt(1, passos.getIdPasso());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public boolean existe(Passos passos) {
boolean achou = false;
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from tbaluno where matricula = ?");
pstm.setLong(1, passos.getIdPasso());
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

public void inserir(Passos passos) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("insert into Passos values (?, ?, ?, ?)");
pstm.setString(1, passos.getTitulo());
pstm.setDate(2, new java.sql.Date(passos.getTimer().getTime()));
pstm.setString(3, passos.getPasso());
pstm.setString(4, passos.getVideo());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public List<Passos> listar() {
List<Passos> lista = new ArrayList<>();
try {
Connection conexao = getConnection();

Statement stm = conexao.createStatement();
ResultSet rs = stm.executeQuery("select * from Passos");
while(rs.next()) {
Passos passos = new Passos();
passos.setIdPasso(rs.getInt("IdPasso"));
passos.setTitulo(rs.getString("Titulo"));
passos.setTimer(rs.getDate("Timer"));
passos.setPasso(rs.getString("Passo"));
passos.setVideo(rs.getString("Video"));
lista.add(passos);
}
stm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return lista;
}

public Passos consultar(Passos passos) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from Passos where IdPasso = ?");

pstm.setLong(1, passos.getIdPasso());
ResultSet rs = pstm.executeQuery();
if(rs.next()) {
passos.setIdPasso(rs.getInt("IdPasso"));
passos.setTitulo(rs.getString("Titulo"));
passos.setTimer(rs.getDate("Timer"));
passos.setPasso(rs.getString("Passo"));
passos.setVideo(rs.getString("Video"));
}
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return passos;
}

}