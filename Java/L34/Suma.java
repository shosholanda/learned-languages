import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Suma extends JFrame implements ActionListener{

    private JButton suma;
    private JLabel numero1;
    private JLabel numero2;
    private JTextField num1;
    private JTextField num2;
    
    public Suma(){
        setLayout(null);
        
        numero1 = new JLabel("Numero 1:");
        numero1.setBounds(10, 10, 100, 30);
        add(numero1);
        
        numero2 = new JLabel("Numero 2:");
        numero2.setBounds(10, 40, 100, 30);
        add(numero2);
        
        num1 = new JTextField();
        num1.setBounds(120, 10, 100, 30);
        add(num1);
        
        num2 = new JTextField();
        num2.setBounds(120, 40, 100, 30);
        add(num2);
        
        suma = new JButton("Sumar");
        suma.setBounds(55, 100, 100, 30);
        add(suma);
        suma.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == suma){
            String n1 = num1.getText();
            String n2 = num2.getText();
            int m1 = Integer.parseInt(n1);
            int m2 = Integer.parseInt(n2);
            int suma = m1 + m2;
            String total = String.valueOf(suma);
            setTitle(total);
        }
    }
    
    public static void main (String[] args){
        Suma s = new Suma();
        s.setBounds(0,0,250, 200);
        s.setVisible(true);
    }

}
