import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class listdoctorsGUI {
    listdoctorsGUI(){

            JFrame frame = new JFrame();
            frame.setSize(1080,800);

            JLabel headerlable = new JLabel();

            headerlable.setPreferredSize(new Dimension(100, 50));
            headerlable.setText("Available Doctor List Table");
            headerlable.setFont(new Font("Calibri",Font.BOLD,25));
            headerlable.setVerticalTextPosition(JLabel.TOP);
            headerlable.setHorizontalAlignment(JLabel.CENTER);
            headerlable.setForeground(Color.BLACK);



            frame.getContentPane().setBackground (new Color(192, 154, 25));

            String data = "";

            try {
                BufferedReader br = new BufferedReader(new FileReader("src/files/westministerData.txt"));
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
                fields[i] = lines[i].split(",");
            }
//

            JTable Jtable = new JTable(fields, new String[]{"firstname", "sure name", "Date of Birth", "Mobile Number", "booked date","Medical Licence Number"});


            Jtable.setBackground(Color.lightGray);
            Jtable.setFont(new Font("Calibri",Font.BOLD,10));

            JPanel newpanel = new JPanel();

            newpanel.add(headerlable);
            newpanel.add(new JScrollPane(Jtable));
            frame.add(newpanel);
            newpanel.setLayout(new GridLayout(3,1));
            newpanel.setBackground(Color.CYAN);

// Create buttons

            JPanel buttonpanel = new JPanel(new FlowLayout(4));
            newpanel.add(buttonpanel);

            JButton consultbut=new JButton("Consultation Form");
            consultbut.setBounds(50,100,95,30);
            consultbut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.setVisible(false);
                    new PatientGUI();

                }
            });

            buttonpanel.add(consultbut);


            JButton patientbut =new JButton("Patient List");
            patientbut.setBounds(50,100,95,30);

            patientbut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.setVisible(false);
                    new PatientTableGUI();
                }
            });

            buttonpanel.add(patientbut);

            frame.setVisible(true);


    }



    public static void main(String[] args) {
        new listdoctorsGUI();
    }
}

