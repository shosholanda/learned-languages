import javax.swing.JComboBox;
import javax.swing.JFrame;
//A diferencia de los botones, los combo box usan evento del tipo item ItemListener
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JayComboBox extends JFrame implements ItemListener {

    private JComboBox combo1;
    
    public JayComboBox(){
        setLayout(null);
        //Las opciones se añaden después, constructor vacío.
        combo1 = new JComboBox();
        combo1.setBounds(10, 10, 80, 20);
        add(combo1);
        combo1.addItem("Rojo");
        combo1.addItem("Verde");
        combo1.addItem("Azul");
        combo1.addItem("Amarrillo");
        combo1.addItem("Negro");
        combo1.addItemListener(this);
    }
    
    
    public void itemStateChanged(ItemEvent e){
        if (e.getSource() == combo1){
            String seleccionado = (String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    
    public static void main (String[] args){
        JayComboBox jcb = new JayComboBox();
        jcb.setBounds(0,0,200,150);
        jcb.setVisible(true);
    }

}

