
package atividade2;

import javax.swing.JFrame;


public class JanelaPrincipal extends JFrame {
    private janelaSobre janelaSobre;
    public JanelaPrincipal(){
    super ();
    janelaSobre = new janelaSobre(this,true);
    
    }
    public void Exibir(){
    setSize(640, 480);
    setTitle("Aplicação GUI");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        
    
    }
}
