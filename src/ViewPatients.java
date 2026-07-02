import javax.swing.*;

public class ViewPatients extends JFrame {

    JTextArea area;

    ViewPatients() {

        setTitle("View Patients");
        setSize(400,300);

        area = new JTextArea();

        area.setText(
                "Patient List\n\n" +
                "1. Rahul   Age:22   Fever\n" +
                "2. Priya   Age:20   Cold\n" +
                "3. Arjun   Age:25   Headache\n");

        add(new JScrollPane(area));

        setLocationRelativeTo(null);
        setVisible(true);
    }
}