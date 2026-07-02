import javax.swing.*;
import java.awt.event.*;

public class Frontpage extends JFrame implements ActionListener {

    JTextField user;
    JPasswordField pass;
    JButton login;

    Frontpage() {

        setTitle("Hospital Management System");
        setSize(350,220);
        setLayout(null);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(30,30,100,25);
        add(l1);

        user = new JTextField();
        user.setBounds(130,30,150,25);
        add(user);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(30,70,100,25);
        add(l2);

        pass = new JPasswordField();
        pass.setBounds(130,70,150,25);
        add(pass);

        login = new JButton("Login");
        login.setBounds(110,120,100,30);
        login.addActionListener(this);
        add(login);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(user.getText().equals("admin") &&
           String.valueOf(pass.getPassword()).equals("1234")) {

            dispose();
            new Dashboard();

        } else {

            JOptionPane.showMessageDialog(this,"Invalid Login");

        }
    }
}