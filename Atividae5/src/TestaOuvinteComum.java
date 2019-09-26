
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public  class TestaOuvinteComum {
    public static void main(String[] args) {
        OuvinteComum ouvinte = new OuvinteComum() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
        
        JButton botao = new JButton("OK");
        botao.addActionListener(ouvinte);
        
        JPanel painel = new JPanel();
        painel.add(botao);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(250,500);
        janela.setVisible(true);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 }

