import javax.swing.*;
import java.awt.event.*;
public class Doubles extends JFrame implements ActionListener {

    private JButton button1;
    private JTextArea textarea1, textarea2;
    private JScrollPane scrollpane1, scrollpane2;
    
    public Doubles(){
        setLayout(null);
        
        textarea1 = new JTextArea();
        textarea2 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane2 = new JScrollPane(textarea2);
        scrollpane1.setBounds(10, 10, 400, 500);
        scrollpane2.setBounds(420, 10, 400, 500);
        add(scrollpane1);
        add(scrollpane2);
        
        button1 = new JButton("Checar");
        button1.setBounds(700, 550, 100, 30);
        button1.addActionListener(this);
        add(button1);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1){
            String texto1 = textarea1.getText();
            String texto2 = textarea2.getText();
            if (!(texto1.equals(texto2))){
                textarea1.setText("Los textos no son iguales");
                textarea2.setText("Los textos no son iguales");
            } else {
                textarea1.setText("Los textos son iguales!");
                textarea2.setText("Los textos son iguales!!");
            }
        }
    }
    
    public static void main (String[] args){
        Doubles d = new Doubles();
        d.setBounds(0,0, 800, 600);
        d.setVisible(true);
    }

}
