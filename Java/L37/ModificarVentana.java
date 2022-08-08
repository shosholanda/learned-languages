import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarVentana extends JFrame implements ActionListener {

    private JMenuBar m;
    private JMenu opciones, size, background;
    private JMenuItem rojo, verde, azul, dvd, hd;

    public ModificarVentana(){
        setLayout(null);
        m = new JMenuBar();
        setJMenuBar(m);
        
        opciones = new JMenu("Opciones");
        m.add(opciones);
        
        size = new JMenu("Tamaño de ventana");
        opciones.add(size);
        background = new JMenu("Color de fondo");
        opciones.add(background);
        
        rojo = new JMenuItem("Rojo");
        rojo.addActionListener(this);
        background.add(rojo);
        
        verde = new JMenuItem("Verde");
        verde.addActionListener(this);
        background.add(verde);
        
        azul = new JMenuItem("Azul");
        azul.addActionListener(this);
        background.add(azul);
        
        dvd = new JMenuItem("640 x 480");
        dvd.addActionListener(this);
        size.add(dvd);
        
        hd = new JMenuItem("1280 x 720");
        hd.addActionListener(this);
        size.add(hd);
    }
    
    public void actionPerformed(ActionEvent e){
        //Obtener la referencia dentro del JFrame
        Container c = this.getContentPane();
        
        if (e.getSource() == rojo){
            c.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == verde){
            c.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == azul){
            c.setBackground(new Color(0, 0, 255));
        }
        //Se ajusta el tamaño fuera del Jframe (this)
        if (e.getSource() == dvd){
            this.setSize(640, 480);
        }
        if (e.getSource() == hd){
            this.setSize(1280, 720);
        }
    }
    
    public static void main (String[] args){
        ModificarVentana mv = new ModificarVentana();
        mv.setBounds(400, 200, 500, 300);
        mv.setVisible(true);
    }

}
