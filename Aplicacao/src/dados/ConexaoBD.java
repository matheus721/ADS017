
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {

    private static Connection conexao;

    static Connection getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private ConexaoBD() {
    }
    
    public static Connection getConexao() throws DadosException {
        if (conexao == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection(
                        "jdbc:mysql://localhost/cadastro","root","");
            } catch (ClassNotFoundException ex) {
                throw new DadosException("Driver JDBC não carregado!", ex);
            } catch (SQLException ex) {
                throw new DadosException("Erro ao conectar com MySQL!",ex);
            }
        }
        
        return conexao;
    }
}