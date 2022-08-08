import javax.swing.*;
import java.awt.event.*;

public class Argentina extends JFrame implements ActionListener{

    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    private JLabel label1;
    private JButton button1;
    
    public Argentina(){
        setLayout(null);
        label1 = new JLabel("Ingrese su carta");
        label1.setBounds(10, 10, 200, 30);
        add(label1);
        
        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 30, 400, 500);
        add(scrollpane1);
        
        button1 = new JButton("Buscar");
        button1.setBounds( 300, 530 , 100, 30);
        button1.addActionListener(this);
        add(button1);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1){
            String texto = textarea1.getText();
            if (texto.indexOf("argentina") >= 0){
                textarea1.setText("Sí contiene el texto Argentina");
            } else {
                textarea1.setText("No contiene el texto Argentina");
            }
        }
    }
    
    public static void main (String[] args){
        Argentina a = new Argentina();
        a.setBounds(0,0, 410, 600);
        a.setVisible(true);
    }

}
