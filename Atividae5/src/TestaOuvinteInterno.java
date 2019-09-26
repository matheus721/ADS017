
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestaOuvinteInterno {
    public static void main(String[] args) {
        OuvinteInterno ouvida = new OuvinteInterno();
        JButton inicialização = new JButton(); 
        JPanel painel = new JPanel();
        JFrame janela = new JFrame();
        
        inicialização.addActionListener(ouvida);
        painel.add(inicialização);
        janela.add(painel);
        janela.setSize(250,500);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
    public static  class OuvinteInterno implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {            
        }
    }
    
 }

