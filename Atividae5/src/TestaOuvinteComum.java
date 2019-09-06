
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;


public class TestaOuvinteComum {
    
    private abstract class OuvinteComum implements ActionListener{
        public void actionPerformed(ActionEvent e){
                System.out.println("");
        
        }   
    }
            
            
    public static void main(String[] args) {
        ComandoActionListener ouvinte = new ComandoActionListener();
        OuvinteComum ouvinteComum = new Ouvintecomum();
        
        JButton botao = new Jbutton("OK");      
        botao.addActionListener(ouvir);
        
        JPainel painel = new JPainel();
        painel.add(botao);
        
        JFrame janela = new JFrame();
        painel.add(janela);
        painel.setSize(100,200);
    }
}
