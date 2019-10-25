
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;


public class FormularioCampoSelecao extends JFrame{
    public  FormularioCampoSelecao() {      
        
         String[][] arrayMunicipio = {
             {"Brasília", "Taguatinga", "Sobradinho"},
             {"Formosa", "Planaltina", "Valparaiso"}
         };
         String[] arrayUF = {"DF","GO"};
             
         JComboBox comboUF = new JComboBox(arrayUF);
          
         JList listaMunicipio = new JList(arrayMunicipio[0]);
         listaMunicipio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
         comboUF.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
             listaMunicipio.setListData(arrayMunicipio[comboUF.getSelectedIndex()]);
             }
         });
         
         
         JLabel rotulo =new JLabel("Seleciona a UF:");
         JLabel rotulo2 =new JLabel("Selecione o Município");
          
         JPanel painel = new JPanel();
         painel.add(rotulo);
         painel.add(comboUF);
         painel.add(rotulo2);
         painel.add(listaMunicipio);
         painel.setLayout(new FlowLayout(FlowLayout.CENTER));         
         
         add(painel);
         setSize(640,480);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
