
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class FormularioBotao extends JFrame{
    public static void main(String[] args) {
        JLabel labelCursos = new JLabel("Selecione até duas opções de curso:");
        JLabel labelBolsa = new JLabel("Deseja cursar com bolsa de estudo?");
        
        JButton botaoSalvar = new JButton("salvar");
        JButton botaoFechar = new JButton("Fechar");
        
        
        JCheckBox  checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
        JCheckBox  checkCursoSegInf = new JCheckBox("Segurança da Informação");
        JCheckBox  checkCursoJogos = new JCheckBox("Jogos Digitais");
        JCheckBox  checkCursoRedes = new JCheckBox("Redes de Computadores");
        
        JRadioButton radioBolsaIntegral100 = new JRadioButton("Integral 100%");
        JRadioButton radioBolsaParcial75 = new JRadioButton("Parcial 75%");
        JRadioButton radioBolsaParcial50 = new JRadioButton("Parcial 75%");
        JRadioButton radioBolsaParcial25 = new JRadioButton("Parcial 25%");
        JRadioButton radioSemBolsa = new JRadioButton("Sem Bolsa");
        
        JPanel painelCentral = new JPanel(new GridLayout(11,1));  
        painelCentral.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelCentral.add(labelCursos);
        painelCentral.add(checkCursoAds);
        painelCentral.add(checkCursoSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoRedes);
        painelCentral.add(labelBolsa);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaParcial75);
        painelCentral.add(radioBolsaParcial50);
        painelCentral.add(radioBolsaParcial25);
        painelCentral.add(radioSemBolsa);
        
        
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(painelCentral, BorderLayout.SOUTH);
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);
        
        //parei na letra K
        
    }
}
