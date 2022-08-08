import javax.swing.JFrame;
import javax.swing.JLabel;

//La clase JLabel es basicamente poner texto dentro de las ventanas. 
public class JayLabel extends JFrame {
    
    private JLabel label1, label2;
    
    public JayLabel(){
        setLayout(null);
        label1 = new JLabel("Sistema de Facturacion");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2 = new JLabel("Versión 1.0");
        label2.setBounds(10,100, 100, 30);
        add(label2);
    }
    
    public static void main (String[] args){
        JayLabel jl = new JayLabel();
        jl.setBounds(0,0,300,200);
        jl.setVisible(true);
        jl.setResizable(false);
    }

}
