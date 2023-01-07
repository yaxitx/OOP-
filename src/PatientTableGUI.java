import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PatientTableGUI {
    PatientTableGUI() {
        JFrame frame = new JFrame();
        frame.setSize(1080, 800);


        // Create a table model with three rows and three columns

        // Read data from text file
        String data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/files/tempfile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                data += line + "\n";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Split data into lines
        String[] lines = data.split("\n");

        // Split lines into fields
        String[][] fields = new String[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            fields[i] = lines[i].split(":");
        }
        // Create table
        JTable Jtable = new JTable(fields, new String[]{"firstname", "surename", "Date of Birth", "Mobile Number", "booked date","Medical Licence Number", "starttime","endtime","notes"});

        JScrollPane scrollPane = new JScrollPane(Jtable);

        frame.add(scrollPane);


        // Add table to frame


//        String[] column = {"firstname", "surename", "Date of Birth", "Mobile Number", "booked date","Medical Licence Number", "starttime","endtime","notes"};
////        String[][] data = {{"a","b","c","a","b","c"}, {"a1","b1","c1","a","b","c"}, {"a2","b2","c2","a","b","c"}};
//
//
//        JTable Jtable = new JTable(data,column);

        Jtable.setBackground(Color.lightGray);
        Jtable.setFont(new Font("Calibri", Font.BOLD, 10));
        frame.add(new JScrollPane(Jtable));

        frame.setVisible(true);
        }



        public static void main(String[] args) {
             new PatientTableGUI();}
    }

