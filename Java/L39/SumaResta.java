import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class SumaResta extends JFrame implements ActionListener {

    private JTextField operando1, operando2;
    private JRadioButton suma, resta;
    private ButtonGroup bg;
    private JButton ok;
    
    public SumaResta(){
        setLayout(null);
        //Solo agrega la caja, sin label
        operando1 = new JTextField();
        operando1.setBounds(10, 10, 100, 30);
        add(operando1);
        
        operando2 = new JTextField();
        operando2.setBounds(10, 60, 100, 30);
        add(operando2);
        
        suma = new JRadioButton("Sumar");
        suma.setBounds(10, 110, 100, 30);
        add(suma);
        
        resta = new JRadioButton("Restar");
        resta.setBounds(10, 140, 100, 30);
        add(resta);
        
        bg = new ButtonGroup();
        bg.add(suma);
        bg.add(resta);
        
        ok = new JButton("Ok!");
        ok.setBounds(10, 180, 100, 30);
        ok.addActionListener(this);
        add(ok);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == ok){
            int v1 = Integer.parseInt(operando1.getText());
            int v2 = Integer.parseInt(operando2.getText());
            if (suma.isSelected())
                setTitle(String.valueOf(v1+v2));
            else 
                setTitle(String.valueOf(v1-v2));
        }
    }
    
    public static void main (String[] args){
        SumaResta sr = new SumaResta();
        sr.setBounds(0, 0, 350, 250);
        sr.setVisible(true);
    }

}
