
package atividade2;

import javax.swing.JDialog;




public class TestaCaixaDialogo extends JDialog{
    public static void main(String [] args){

    JDialog dialogo = new JDialog();
    dialogo.setTitle("caixa de Dialogo");
    dialogo.setSize(320,240);
    dialogo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    dialogo.setVisible(true);
   }

}
