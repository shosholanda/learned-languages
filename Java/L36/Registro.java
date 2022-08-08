import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame implements ActionListener{

    private JLabel labelNombre, labelPaís;
    private JTextField textoNombre;
    private JComboBox comboPaís;
    private JButton boton;

    public Registro(){
        setLayout(null);
        labelNombre = new JLabel("Nombre");
        labelNombre.setBounds(10, 10, 150, 30);
        add(labelNombre);
        
        labelPaís = new JLabel("País");
        labelPaís.setBounds(170, 10, 100, 30);
        add(labelPaís);
        
        textoNombre = new JTextField();
        textoNombre.setBounds(10, 40, 140, 30);
        add(textoNombre);
        
        comboPaís = new JComboBox();
        comboPaís.setBounds(170, 40, 100, 30);
        comboPaís.addItem("México");
        comboPaís.addItem("China");
        comboPaís.addItem("E.E.U.U");
        comboPaís.addItem("Rusia");
        comboPaís.addItem("Canadá");
        comboPaís.addItem("Francia");
        comboPaís.addItem("Japón");
        comboPaís.addItem("Australia");
        comboPaís.addItem("Holanda");
        comboPaís.addItem("Egipto");
        comboPaís.addItem("España");
        comboPaís.addItem("Brazil");
        comboPaís.addItem("Argentina");
        comboPaís.addItem("Suecia");
        add(comboPaís);
        
        boton = new JButton("Ok!");
        boton.setBounds(100, 80, 100,30);
        add(boton);
        boton.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton){
            String titulo = textoNombre.getText() + " - " + (String)comboPaís.getSelectedItem();
            setTitle(titulo);
        }
    }
    
    public static void main (String[] args){
        Registro r = new Registro();
        r.setBounds(300, 300, 300, 200);
        r.setVisible(true);
    }

}
