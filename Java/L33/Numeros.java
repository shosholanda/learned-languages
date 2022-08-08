import javax.swing.*;
import java.awt.event.*;

public class Numeros extends JFrame implements ActionListener{

    private JButton boton1, boton2, boton3;
    
    public Numeros(){
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        //añadimos el boton a los escucha para en caso de presionar el boton nos notifique
        boton1.addActionListener(this);
        
        boton2 = new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        //añadimos el boton a los escucha para en caso de presionar el boton nos notifique
        boton2.addActionListener(this);
        
        boton3 = new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        //añadimos el boton a los escucha para en caso de presionar el boton nos notifique
        boton3.addActionListener(this);
    }
    //Cuando se presione alguno de los tres botones se ejecuta el metodo actionPerformed y verificamos cada if.
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            setTitle("Boton 1");
        } 
        if (e.getSource() == boton2){
            setTitle("Boton 2");
        }
        if (e.getSource() == boton3){
            setTitle("Boton 3");
        }
    }
    
    public static void main (String[] args){
        Numeros n = new Numeros();
        n.setBounds(0,0,350,200);
        n.setVisible(true);
    }

}
