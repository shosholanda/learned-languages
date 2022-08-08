import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
//Los eventos:
import java.awt.event.*;

//Para los botones implementamos la interfaz ActionLIstener. 
//las interfaces son protocolos para comunicar entre clases. 
public class JayButton extends JFrame implements ActionListener {

    JButton boton1;
    
    public JayButton(){
        setLayout(null);
        boton1 = new JButton("Finalizar");
        boton1.setBounds(300, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            System.exit(0);
        }
    }
    
    public static void main (String[] args){
        JayButton jb = new JayButton();
        jb.setBounds(0,0,450,350);
        jb.setVisible(true);
    }

}
