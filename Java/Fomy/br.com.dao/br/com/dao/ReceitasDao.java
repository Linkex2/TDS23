package br.com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.entidade.Receitas;

public class ReceitasDao extends ConDao {
public void alterar(Receitas receita) {
try {
Connection conexao = getConnection();

PreparedStatement pstmt = conexao.prepareStatement("update Receitas set Nome = ?, Descricao = ?, ImagemThumb = ?, Imagem = ?, Experiencia = ?, Valor = ? where IdReceita = ?");
pstmt.setString(1, receita.getNome());
pstmt.setString(2, receita.getDescricao());
pstmt.setString(3, receita.getImagemThumb());
pstmt.setString(4, receita.getImagem());
pstmt.setInt(5, receita.getExperiencia());
pstmt.setInt(6, receita.getValor());
pstmt.setLong(7, receita.getIdReceita());
pstmt.execute();
pstmt.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public void excluir(Receitas receita) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("delete from Receitas where IdReceita = ?");
pstm.setLong(1, receita.getIdReceita());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public boolean existe(Receitas receita) {
boolean achou = false;
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from Receitas where IdReceita = ?");
pstm.setLong(1, receita.getIdReceita());
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

public void inserir(Receitas receita) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("insert into Receitas values (?, ?, ?, ?, ?, ?)");
pstm.setString(1, receita.getNome());
pstm.setString(2, receita.getDescricao());
pstm.setString(3, receita.getImagemThumb());
pstm.setString(4, receita.getImagem());
pstm.setInt(5, receita.getExperiencia());
pstm.setInt(6, receita.getValor());
pstm.execute();
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
}

public List<Receitas> listar() {
List<Receitas> lista = new ArrayList<>();
try {
Connection conexao = getConnection();

Statement stm = conexao.createStatement();
ResultSet rs = stm.executeQuery("select * from Receitas");
while(rs.next()) {
Receitas aluno = new Receitas();
aluno.setIdReceita(rs.getInt("Receita"));
aluno.setNome(rs.getString("Nome"));
aluno.setDescricao(rs.getString("Descricacao"));
aluno.setImagemThumb(rs.getString("ImagemThumb"));
aluno.setImagem(rs.getString("Imagem"));
aluno.setExperiencia(rs.getInt("Experiencia"));
aluno.setValor(rs.getInt("Valor"));
lista.add(aluno);
}
stm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return lista;
}

public Aluno consultar(Aluno aluno) {
try {
Connection conexao = getConnection();

PreparedStatement pstm = conexao.prepareStatement("select * from tbaluno where matricula = ?");
pstm.setLong(1, aluno.getMatricula());
ResultSet rs = pstm.executeQuery();
if(rs.next()) {
aluno.setMatricula(rs.getLong("matricula"));
aluno.setNome(rs.getString("nome"));
aluno.setTelefone(rs.getString("telefone"));
aluno.setEmail(rs.getString("email"));
aluno.setDataCadastro(new java.sql.Date(rs.getDate("datacadastro").getTime()));
}
pstm.close();
conexao.close();
}

catch(Exception e) {
e.printStackTrace();
}
return aluno;
}

}