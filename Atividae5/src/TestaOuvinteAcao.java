
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestaOuvinteAcao {
    public static void main(String[] args) {
        OuvinteAcao ouvinteAcao = new OuvinteAcao();
        JButton inicialização = new JButton();
        OuvinteAcao anônimo = new OuvinteAcao();
        
        inicialização.addActionListener(ouvinteAcao);
        inicialização.addActionListener(anônimo);
        
        JPanel painel = new JPanel();
        painel.add(inicialização);
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(500,500);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Outra ação foi executada");
    } 
}
