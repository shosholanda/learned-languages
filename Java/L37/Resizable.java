import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Resizable extends JFrame implements ActionListener{

    private JLabel alto, ancho;
    private JTextField altoT, anchoT;
    private JMenuBar mb;
    private JMenu acciones;
    private JMenuItem aplicar, salir;

    public Resizable(){
        setLayout(null);
        ancho = new JLabel("Ancho");
        ancho.setBounds(10, 10, 100, 30);
        add(ancho);
        
        alto = new JLabel("Alto");
        alto.setBounds(120, 10, 100, 30);
        add(alto);
        
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        altoT = new JTextField();
        altoT.setBounds(120, 50, 100, 30);
        add(altoT);
        
        anchoT = new JTextField();
        anchoT.setBounds(10, 50, 100, 30);
        add(anchoT);
        
        acciones = new JMenu("Acciones");
        mb.add(acciones);
        
        aplicar = new JMenuItem("Aplicar");
        aplicar.addActionListener(this);
        acciones.add(aplicar);
        
        salir = new JMenuItem("Salir");
        salir.addActionListener(this);
        acciones.add(salir);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == aplicar){
            int ancho = Integer.parseInt((String)anchoT.getText());
            int alto = Integer.parseInt((String)altoT.getText());
            this.setSize(ancho, alto);
        }
        if (e.getSource() == salir){
            System.exit(0);
        }
    }
    
    public static void main (String[] args) {
        Resizable r = new Resizable();
        r.setBounds(0,0,640, 480);
        r.setVisible(true);
    }
}
