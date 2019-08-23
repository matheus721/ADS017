
package atividade2;

import javax.swing.JFrame;


public class TestejanelaPrincipal {
    public static void main(String [] args){
    
       JFrame janela = new JFrame();
       janela.setVisible(true);
       janela.setTitle(" Janela Principal ");
       janela.setSize(640, 480);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
