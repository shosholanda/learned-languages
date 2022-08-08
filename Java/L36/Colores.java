import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Colores extends JFrame implements ActionListener{

    private JComboBox comboRojo, comboVerde, comboAzul;
    private JButton boton1;
    private JLabel labelRojo, labelVerde, labelAzul;
    
    public Colores(){
        setLayout(null);
        
        //Añadir etiqueta Rojo
        labelRojo = new JLabel("Rojo");
        labelRojo.setBounds(10, 10, 100, 30);
        add(labelRojo);
        //Añadir los 256 valores de Red
        comboRojo = new JComboBox();
        comboRojo.setBounds(120, 10, 50, 30);
        for (int i = 0; i < 256; i++){
            comboRojo.addItem(String.valueOf(i));
        }
        add(comboRojo);
        
        
        //Añadir la etiqueta Verde
        labelVerde = new JLabel("Verde");
        labelVerde.setBounds(10, 50, 100, 30);
        add(labelVerde);
        //Añadir los 256 valores de Green
        comboVerde = new JComboBox();
        comboVerde.setBounds(120, 50, 50, 30);
        for (int i = 0; i < 256; i++){
            comboVerde.addItem(String.valueOf(i));
        }
        add(comboVerde);
        
        //Añadir la etiqueta Azul
        labelAzul = new JLabel("Azul");
        labelAzul.setBounds(10, 90, 100, 30);
        add(labelAzul);
        //Añadir los 256 valores de Green
        comboAzul = new JComboBox();
        comboAzul.setBounds(120, 90, 50, 30);
        for (int i = 0; i < 256; i++){
            comboAzul.addItem(String.valueOf(i));
        }
        add(comboAzul);
        
        boton1 = new JButton("Oki doki");
        boton1.setBounds(30, 150, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            int r = Integer.parseInt((String)comboRojo.getSelectedItem());
            int g = Integer.parseInt((String)comboVerde.getSelectedItem());
            int b = Integer.parseInt((String)comboAzul.getSelectedItem());
            Color nuevo = new Color(r, g, b);
            boton1.setBackground(nuevo);
        }
    }
    
    public static void main (String[] args){
        Colores c = new Colores();
        c.setBounds(0,0,400,300);
        c.setVisible(true);
    }

}
