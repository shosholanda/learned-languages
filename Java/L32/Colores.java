import javax.swing.JFrame;
import javax.swing.JLabel;

public class Colores extends JFrame {
    
    private JLabel label1, label2, label3;
    
    //Setbounds para labels. 
    //setbounds(a, b, c, d), donde
    //a = espacio entre el texto y el margen izquierdo. (eje x)
    //b = espacio entre el texto y el margen superior (eje -y) (si se quiere debajo de un texto anterior, se deben sumar los pixeles)
    //c = el largo de la etiqueta 
    //d = el alto de la etiqueta  (el rectangulo que encierra el texto. 
    public Colores(){
        setLayout(null);
        label1 = new JLabel("Rojo");
        label1.setBounds(10,10,40,20);
        add(label1);
        label2 = new JLabel("Verde");
        label2.setBounds(10,50,50, 5);
        add(label2);
        label3 = new JLabel("Azul");
        label3.setBounds(10,90,40,20);
        add(label3);
    }
    
    public static void main (String[] args){
        Colores c = new Colores();
        c.setBounds(100, 0, 200, 300);
        c.setVisible(true);
    }

}
