/*import javax.swing.*;

import javax.swing.JFrame;

public class JayFrame{

    public static void main (String[] args){
        JFrame f = new JFrame();
        f.setBounds(500,50,1200,1200);
        f.setVisible(true);
    }
    Metodo para implementar una ventana vacia
}*/

import javax.swing.JFrame;

//Extendemos JFrame para usar los atriubutos de JFrame y aparte mas cosas.
public class JayFrame extends JFrame{

    public JayFrame(){
        //Esta método es heredado de JFrame y si es null, controlamos manualmente todo
        //Si es diferente de null, entonces el acomodo de los objetos dependera del argumento. 
        setLayout(null);
    }
    
    public static void main (String [] args){
        //vamos a crear una ventana tipo JayFrame, no JFrame.
        JayFrame jf = new JayFrame();
        //columna, fila, ancho, alto
        jf.setBounds(100,10,300,200);
        jf.setVisible(true);
    }

}
