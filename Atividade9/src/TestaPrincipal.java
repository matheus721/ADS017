
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class TestaPrincipal {
    public static void main(String[] args) {
                             
        JMenu menuArquivoSair = new JMenu("Sair");
        menuArquivoSair.setMnemonic('r');
        menuArquivoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });
        
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        menuArquivo.add(menuArquivoSair);
        
        JMenu menuAjudaSobre = new JMenu("Sobre...");
        menuAjudaSobre.setMnemonic('S');
        menuAjudaSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Aplicação 1.0");
            }
        });
        
        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('j');
        menuAjuda.add(menuAjudaSobre);
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menuArquivo);
        barraMenu.add(menuAjuda);
        
        JFrame janela = new JFrame();
        janela.add(barraMenu);
        janela.setSize(640,480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
       
    }
 
}
