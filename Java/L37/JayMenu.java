import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JayMenu extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;
    
    public JayMenu(){
        setLayout(null);
        //Crea la pura barra de menu
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        //Crea un menu en la barra de menu. La añadimos a la barra
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        
        //Creamos sub menus y los añadimos a cierto menu. Tienen Eventos.
        mi1 = new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3 = new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);
    }
    
    public void actionPerformed(ActionEvent e){
        //Accedemos al JFrame desde dentro de la clase
        //Obtenemos una referencia al panel asociado con el JFrame
        Container f = this.getContentPane();
        
        if (e.getSource() == mi1){
            f.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == mi2){
            f.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == mi3){
            f.setBackground(new Color(0, 0, 255));
        }
    }
    
    public static void main (String [] args){
        JayMenu j = new JayMenu();
        j.setBounds(10, 20, 300, 200);
        j.setVisible(true);
    }

}
