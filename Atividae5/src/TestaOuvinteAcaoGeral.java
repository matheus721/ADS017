
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class TestaOuvinteAcaoGeral {
    OuvinteAcaoGeral ouvinte = new OuvinteAcaoGeral();
    JButton inicialização = new JButton("OK");
    JTextField campo = new JTextField(30);
    inicialização.addActionListener(ouvinte);
    
    JFrame janela = new JFrame();
    janela.setLayout(new FlowLayout ());
}
