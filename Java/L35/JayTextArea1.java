import javax.swing.*;

public class JayTextArea1 extends JFrame {

    private JTextField textfield1;
    private JTextArea textarea1;
    //para evitar el problema de que no podemos ver (sin scroll) todo el texto
    private JScrollPane scrollpane1;
    
    public JayTextArea1(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        
        textarea1 = new JTextArea();
        
        //No es necesario hacer creacion precisa de JTextArea
        /*textarea1.setBounds(10, 50, 400, 300);
        add(textarea1);*/
        
        //en lugar de eso, la creacion precisa de JScrollPane
        //PERO LE PASAMOS COMO PARAMETRO EL JTextArea PARA PODERLO USAR DENTRO
        scrollpane1 = new JScrollPane(textarea1);
        //Luego defininos a scrollpanel como si fuera el textarea1
        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
    }
    
    public static void main (String [] args){
        JayTextArea1 j = new JayTextArea1();
        j.setBounds(0,0,540,400);
        j.setVisible(true);
    }

}
