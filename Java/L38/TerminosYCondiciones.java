import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class TerminosYCondiciones extends JFrame implements ChangeListener, ActionListener {

    private JLabel cláusula;
    private JCheckBox aceptar;
    private JButton continuar;
    
    public TerminosYCondiciones(){
        setLayout(null);
        
        cláusula = new JLabel("Estás de acuerdo en perdonarte y dejar de hacerte tanto daño con los posibles futuros imaginarios?");
        cláusula.setBounds(10, 10, 1000, 30);
        add(cláusula);
        
        aceptar = new JCheckBox("Acepto");
        aceptar.setBounds(10, 50, 100, 30);
        aceptar.addChangeListener(this);
        add(aceptar);
        
        continuar = new JButton("Continuar");
        continuar.setBounds(10, 100, 200, 30);
        continuar.addActionListener(this);
        add(continuar);
        continuar.setEnabled(false);
    }
    
    public void stateChanged(ChangeEvent e){
        if (aceptar.isSelected())
            continuar.setEnabled(true);
        else
            continuar.setEnabled(false);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == continuar)
            System.exit(0);
    }
    
    public static void main (String[] args) {
        TerminosYCondiciones tyc = new TerminosYCondiciones();
        tyc.setBounds(0,0,1000, 200);
        tyc.setVisible(true);
    }

}
