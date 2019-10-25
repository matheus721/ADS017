
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class FormularioTabela extends JFrame{
    public   FormularioTabela() {
    JTextField campoFiltro = new JTextField();
    
    JButton botaoFiltrar = new JButton("Filtrar");
    JButton botaoLimpar = new JButton("Limpar");
    
    JTable tabela = new JTable();
    
    String[][] arrayDados = {
        {"2015001","João","joao@iesb.br"},
        {"2015002","Ana","ana@iesb.com"},
        {"2015003","Pedro","pedro@iesb.com"},
        {"2015004","Bianca","bianca@iesb.com"},
        {"2015005","maria","maria@iesb.com"}
    };
    String[] arrayColunas = {"Matrícula","Nome","E-mail"};
    
    JLabel rotulo =new JLabel("Informe um nome:");
  }   
}
