package atividade2;

import java.awt.Frame;
import javax.swing.JDialog;

public class janelaSobre extends JDialog {

    public janelaSobre(Frame owner, boolean modal) {
        super(owner, modal);
        
      }  

    public void Exibir() {
        setSize(320, 240);
        setTitle("Título");

    }


}
