
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TestaMenu {
    public static void main(String[] args) {
           
       
    JMenuItem itemMenu1 = new JMenuItem();
    itemMenu1.setText("ItemMenu 1");
    
    JMenuItem itemMenu2 = new JMenuItem();
    itemMenu2.setEnabled(false);
    
    JMenu menu = new JMenu();
    menu.setText("Menu");
    menu.add(itemMenu1);  
    menu.addSeparator();
    menu.add(itemMenu2);
    
    JMenuBar barraMenu = new JMenuBar();
    barraMenu.add(menu);
    
    
    
    
    JFrame janela = new JFrame();
    janela.setJMenuBar(barraMenu);
    janela.setSize(500, 500);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
 }
}