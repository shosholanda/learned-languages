import javax.swing.*;
import java.awt.event.*;

public class Personas extends JFrame implements ActionListener {
    
    private JButton boton1, boton2;
    
    public Personas(){
        setLayout(null);
        boton1 = new JButton("Varon");
        boton1.setBounds(10, 200, 100, 30);
        boton1.addActionListener(this);
        add(boton1);
        boton2 = new JButton("Mujer");
        boton2.setBounds(210, 200, 100, 30);
        boton2.addActionListener(this);
        add(boton2);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            setTitle("Varon");
        }
        if (e.getSource() == boton2){
            setTitle("Mujer");
        }
    }
    
    public static void main (String[] args){
        Personas p = new Personas();
        p.setBounds(0,0, 400, 400);
        p.setVisible(true);
    }
    
}
