import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JButton add, view, exit;

    Dashboard() {

        setTitle("Dashboard");
        setSize(350,250);
        setLayout(null);

        add = new JButton("Add Patient");
        add.setBounds(80,30,170,30);
        add.addActionListener(this);
        add(add);

        view = new JButton("View Patients");
        view.setBounds(80,80,170,30);
        view.addActionListener(this);
        add(view);

        exit = new JButton("Exit");
        exit.setBounds(80,130,170,30);
        exit.addActionListener(this);
        add(exit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==add){
            new patient();
        }

        if(e.getSource()==view){
            new ViewPatients();
        }

        if(e.getSource()==exit){
            System.exit(0);
        }
    }
}