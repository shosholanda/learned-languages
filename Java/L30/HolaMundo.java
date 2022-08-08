//con * importamos todas las bibliotecas que derivan de swing. 
//en particular solo se utilizan JFrame y JLable. 
import javax.swing.*;

//JFrame es la clase padre de JLabel. 
//Es la clase que hace una ventana en la computadora. 
import javax.swing.JFrame;

//JLabel es la clase que muestra texto, usando un Jframe, 
//es decir, JLabel es la clase que mete texto dentro de un JFrame. 
import javax.swing.JLabel;

//Herencia. 
public class HolaMundo extends JFrame {

    //Atributo de la ventana. 
    private JLabel label1;
    
    //Inicializar el JLabel. Indicar texto, tamaño, layout, y añadirlo a la ventana. 
    public HolaMundo(){
        //Layout, método de Jframe, le decimos que tenemos el control completo de 
        //el tamaño de los elementos. 
        setLayout(null);
        
        //Iniciaqmos el texto que hay dentro del JLabel con el mensaje que queremos. 
        label1 = new JLabel("Hola Mundo");
        
        //Definir el posicionamiento
        //(columna, fila, ancho, alto)
        label1.setBounds(10,20,200,30);
        
        //Añadir al JFrame. 
        add(label1);
    }
    
    public static void main (String[] args){
        //Creamos un objeto de la clase, y se añaden los metodos de JFrame, y el constructor. 
        HolaMundo hm = new HolaMundo();
        
        //setbounds del jframe, es decir la ventana. 
        hm.setBounds(10,10,400,300);
        hm.setVisible(true);
    }

}

