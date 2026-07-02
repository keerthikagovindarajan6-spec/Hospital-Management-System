import javax.swing.*;
import java.awt.event.*;

public class patient extends JFrame implements ActionListener {

    JTextField name, age, disease;
    JButton save;

    patient() {

        setTitle("Add Patient");
        setSize(350,300);
        setLayout(null);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(20,20,100,25);
        add(l1);

        name = new JTextField();
        name.setBounds(120,20,150,25);
        add(name);

        JLabel l2 = new JLabel("Age");
        l2.setBounds(20,70,100,25);
        add(l2);

        age = new JTextField();
        age.setBounds(120,70,150,25);
        add(age);

        JLabel l3 = new JLabel("Disease");
        l3.setBounds(20,120,100,25);
        add(l3);

        disease = new JTextField();
        disease.setBounds(120,120,150,25);
        add(disease);

        save = new JButton("Save");
        save.setBounds(110,180,100,30);
        save.addActionListener(this);
        add(save);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(this, "Patient Added Successfully!");

        dispose();
    }
}