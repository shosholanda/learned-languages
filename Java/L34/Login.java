import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    private JButton login;
    private JTextField textField1, textField2;
    private JLabel label1, label2;

    public Login(){
        setLayout(null);
        label1 = new JLabel("Nombre: ");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        label2 = new JLabel("Contraseña: ");
        label2.setBounds(10, 40, 100, 30);
        add(label2);
        textField1 = new JTextField();
        textField1.setBounds(120, 10, 100, 30);
        add(textField1);
        textField2 = new JTextField();
        textField2.setBounds(120, 40, 100, 30);
        add(textField2);
        login = new JButton("Login!");
        login.setBounds(55, 70, 100, 30);
        add(login);
        login.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == login){
            String s1 = textField1.getText();
            String s2 = textField2.getText();
            if (s1.equals("juan") && s2.equals("abc123")){
                setTitle("Login autorizada");
            } else {
                setTitle("No registrado");
            }
        }
    }
    
    public static void main (String[] args){
        Login l = new Login();
        l.setBounds(0,0, 250, 150);
        l.setVisible(true);
    }

}
