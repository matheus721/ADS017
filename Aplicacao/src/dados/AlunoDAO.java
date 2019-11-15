
package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AlunoDAO implements DAO<Aluno>{
    
    private Connection conexao;

    @Override
    public void incluir(Aluno entidade) throws DadosException {
        conexao = ConexaoBD.getConexao();
        String sql = "INSERT INTO alunos(matricula, nome) VALUES(?, ?)";
        try{
        PreparedStatement comando =  conexao.prepareStatement(sql);
        comando.setString(2,entidade.getNome());
    }catch(SQLException ex){
        throw new DadosException("Erro ao incluir aluno!", ex);
    }
    }

    @Override
    public void alterar(Aluno entidade) throws DadosException {
        conexao = ConexaoBD.getConexao();
        String sql = "UPDATE aluno SET matricula=?, nome=? WHERE id=?";
        try{
        PreparedStatement comando =  conexao.prepareStatement(sql);
        comando.setString(2,entidade.getNome());
        comando.setInt(3,entidade.getId());
        comando.execute();
        comando.close();
    }catch(SQLException ex){
        throw new DadosException("Erro ao incluir aluno!", ex);
    }
    }
    

    @Override
    public void excluir(int id) throws DadosException {
        conexao = ConexaoBD.getConexao();
        String sql = "DELETE FROM alunos WHERE id=?";
        try{
        PreparedStatement comando =  conexao.prepareStatement(sql);
        comando.setInt(1, id);
        comando.execute();
        comando.close();
    }catch(SQLException ex){
        throw new DadosException("Erro ao excluirr aluno!", ex);
    }
    }
    

    @Override
    public Aluno consultar(int id) throws DadosException {
        Aluno aluno =  new Aluno();
        conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM alunos WHERE id=?";
        try{
        PreparedStatement comando =  conexao.prepareStatement(sql);
        comando.setInt(1, id);
        ResultSet resultado = comando.executeQuery();
        if(resultado.next()){
            aluno.setId(resultado.getInt(sql));
        }
        comando.close();
    }catch(SQLException ex){
        throw new DadosException("Erro ao excluirr aluno!", ex);
    }
        return aluno;
    }

    @Override
    public List<Aluno> listar() throws DadosException {
        
        Aluno aluno =  new Aluno();
        conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM alunos WHERE id=?";
        try{
        PreparedStatement comando =  conexao.prepareStatement(sql);
        comando.setInt(1, id);
        ResultSet resultado = comando.executeQuery();
        if(resultado.next()){
            aluno.setId(resultado.getInt(sql));
        }
        comando.close();
    }catch(SQLException ex){
        throw new DadosException("Erro ao excluirr aluno!", ex);
    }
        return aluno;
    }
    }
    
}
