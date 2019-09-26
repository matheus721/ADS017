
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class OuvinteAcaoGeral implements ActionListener{
    
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
       if(evento.getSource() == X
          evento.getclass() == Y )
       JOptionPane.showMessageDialog(null, "O botão OK foi clicado");
    }
   
}
