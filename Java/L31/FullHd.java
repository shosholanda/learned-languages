
//La aplicación mas sencilla de todas
//se debe implementar la clase jframe en una clase para poder añadir más cosas más que solamente 
//Los botones, etiquetas y todo se define en el constructor de la clase. 
import javax.swing.JFrame;

public class FullHd extends JFrame{

    public FullHd(){
        setLayout(null);
    }
    
    public static void main (String[] args){
        FullHd hd = new FullHd();
        
        hd.setBounds(0, 0, 1024, 400);
        //no pasa nada si alteramos el orden de setVisible
        hd.setVisible(true);
        //para no modificar el tamaño de la ventana en tiempo de ejecucion:
        hd.setResizable(false);
    }
    
}
