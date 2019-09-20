
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class TestaJanelaFlowLayout {

    private static LayoutManager leiaute;
    public static void main(String[] args) {
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
        JFrame janela = new JFrame();
        FlowLayout lida = new FlowLayout(FlowLayout.RIGHT);
        //RIGHT LEFT
            
        painel1.setBorder(BorderFactory.createLineBorder (Color.RED));
        painel2.setBorder(BorderFactory.createLineBorder (Color.GREEN));
        painel3.setBorder(BorderFactory.createLineBorder (Color.BLUE));
        painel4.setBorder(BorderFactory.createLineBorder (Color.BLACK));
        janela.setLayout(leiaute);
        
        janela.add(painel1);
        janela.add(painel2);
        janela.add(painel3);
        janela.add(painel4);
        
        
        janela.setTitle(" Janela FlowLayout ");
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
       
    }
    
}
