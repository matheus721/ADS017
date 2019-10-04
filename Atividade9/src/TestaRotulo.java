
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestaRotulo {
    public static void main(String[] args) {
        JLabel rotulo1 = new JLabel();
        rotulo1.setText("Este rótulo está ativo.");
        rotulo1.setToolTipText("Rótulo 1");
        
        JLabel rotulo2 = new JLabel();
        rotulo1.setText("Este rótulo está inativo.");
        rotulo2.setEnabled(false);
        
        JFrame janela = new JFrame();
        janela.add(rotulo1,BorderLayout.NORTH);
        janela.add(rotulo2,BorderLayout.SOUTH);
        janela.setSize(500, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
