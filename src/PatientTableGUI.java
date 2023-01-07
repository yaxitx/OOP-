import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PatientTableGUI {
    PatientTableGUI() {
        JFrame frame = new JFrame();
        frame.setSize(1080, 800);

        // Create a table model with three rows and three columns

        String[] column = {"Name", "Surname", "Date of Birth", "Mobile Number", "Medical Licence Number", "Specialisation"};
        DefaultTableModel model = new DefaultTableModel(column, 10);
        String[][] data = {{"a","b","c","a","b","c"}, {"a1","b1","c1","a","b","c"}, {"a2","b2","c2","a","b","c"}};


        JTable Jtable = new JTable();

        Jtable.setBackground(Color.lightGray);
        Jtable.setFont(new Font("Calibri", Font.BOLD, 10));

        frame.setVisible(true);
    }

        public static void main(String[] args) {new PatientTableGUI();}
    }

