
package atividade2;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class TestaModoExibicao {
     public static void main(String [] args){
         JFrame janelaPrincipal = new JFrame();
         janelaPrincipal.setSize(640,480);
         janelaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         janelaPrincipal.setVisible(true);
         
         JDialog caixaDialogo = new JDialog(janelaPrincipal, true); //false ou true
         caixaDialogo.setSize(320,240);
         caixaDialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         caixaDialogo.setVisible(true);
    
}
}