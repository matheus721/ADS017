
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FormularioCampoEdicao extends JFrame {
    public  FormularioCampoEdicao() {
        
        JButton botaoAdicionar = new JButton("Adicionar");
        
        JTextField campoTexto = new JTextField(20);
        JTextArea areaTexto = new JTextArea(5,20);     
        JLabel rotulo =new JLabel("Digite um texto:");
        
        JScrollPane painelRolagem = new JScrollPane();
        painelRolagem.setViewportView(areaTexto);
        
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        
        
        JPanel painelBotao = new JPanel();
        painelBotao.add(botaoAdicionar);
        
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               areaTexto.append(campoTexto.getText());
               campoTexto.setText("");
            }
        });
        
        JPanel painelPrincipal = new JPanel(new GridLayout(5,1));
        painelPrincipal.add(rotulo);
        painelPrincipal.add(campoTexto);
        painelPrincipal.add(painelRolagem);
        
        add(painelPrincipal);
        add(painelBotao,BorderLayout.SOUTH);
        
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}
