import javax.swing.*;

import java.awt.event.*;

public class Navegadores extends JFrame implements ActionListener {
    private JCheckBox check1, check2, check3;
    private JButton boton1;

    public Navegadores(){
        setLayout(null);
        check1 = new JCheckBox("Chrome");
        check1.setBounds(10, 10, 150, 30);
        add(check1);

        check2 = new JCheckBox("FireFox");
        check2.setBounds(10, 50, 150, 30);
        add(check2);

        check3 = new JCheckBox("Edge");
        check3.setBounds(10, 90, 150, 30);
        add(check3);

        boton1 = new JButton("Confirmar");
        boton1.setBounds(10, 140, 100, 30);
        boton1.addActionListener(this);
        add(boton1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == boton1){
            String cad = "";
            if (check1.isSelected())
                cad+="Chrome | ";
            if (check2.isSelected())
                cad+= "Firefox | ";
            if (check3.isSelected())
                cad+="Edge";
            setTitle(cad);
        }
    }

    public static void main (String[] args){
        Navegadores n = new Navegadores();
        n.setBounds(0,0,350, 230);
        n.setVisible(true);
    }

    
}