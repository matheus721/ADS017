
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestaOuvinteAnonimo { 
    public static void main(String[] args) {
        
    }
        JButton botao = new JButton();
            public void actionPerformed(ActionEvent e) {
                botao.setText("actionPerformed disparado...");
                botao.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { } });
                
                JPanel painel = new JPanel();
                painel.add(botao);
                
                JFrame janela = new JFrame();
                janela.add(painel);
                janela.setSize(250,500);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
           
        }
    
     
