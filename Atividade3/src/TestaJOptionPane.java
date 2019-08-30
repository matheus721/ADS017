
import javax.swing.JOptionPane;


public class TestaJOptionPane {
    public static void main(String[] args) {
        JOptionPane option = new JOptionPane();
        JOptionPane.showInputDialog(null, "Informe um valor");
        String valor = null ;
        JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);
        JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        String opcao = null;
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
        String Aviso = null;
        JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        String Alerta = null;
        JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);
        String Erro = null;
        JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);       
    }
}
