import javax.swing.*;
import javax.swing.event.*;

//La clase Change Listeneistener es para cuando cuando se selecciona algo.
public class JayCheckBox extends JFrame implements ChangeListener {

    private JCheckBox check1, check2, check3;
    
    
    public JayCheckBox(){
        setLayout(null);
        
        //Se crea el checkbox junto con la etiqueta. 
        check1 = new JCheckBox("Inglés");
        check1.setBounds(10, 10, 150, 30);
        check1.addChangeListener(this);
        add(check1);
        
        check2 = new JCheckBox("Español");
        check2.setBounds(10, 50, 150, 30);
        check2.addChangeListener(this);
        add(check2);
        
        check3 = new JCheckBox("Ruso");
        check3.setBounds(10, 90, 150, 30);
        check3.addChangeListener(this);
        add(check3);
        
    }
    
    public void stateChanged(ChangeEvent e){
        if (check1.isSelected()){
            setTitle("Welcome!");
            return;
        }
        if (check2.isSelected()){
            setTitle("Bonjour!");
            return;
        }
        if (check3.isSelected()){
            setTitle("привет!");
            return;
        }
    }
    
    public static void main (String[] args){
        JayCheckBox chb = new JayCheckBox();
        chb.setBounds(0,0, 300, 200);
        chb.setVisible(true);
    }

}
