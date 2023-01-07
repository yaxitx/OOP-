import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class listdoctorsGUI {

    listdoctorsGUI (){
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
//

        String[] column ={"Name","Surname","Date of Birth","Mobile Number","Medical Licence Number","Specialisation"};
//        String[] data = WestminsterSkinConsultationManager.docArr;
        DefaultTableModel tableModel = new DefaultTableModel(column, 10);
//        String[][] data = {{"a","b","c","a","b","c"}, {"a1","b1","c1","a","b","c"}, {"a2","b2","c2","a","b","c"}};
        for (Doctor doctor : WestminsterSkinConsultationManager.docArr){
            tableModel.addRow(new Object[]{doctor.getName() +""+doctor.getSurName(),doctor.getDob(),doctor.getMobiNum(),doctor.getmediLicenceNum(),doctor.getspecialisation()});
        }


        JTable Jtable =new JTable(tableModel);

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


        JButton b1=new JButton("Doctor List");
        b1.setBounds(50,100,95,30);
        buttonpanel.add(b1);

        JButton b2=new JButton("Consultation Form");
        b2.setBounds(50,100,95,30);
        buttonpanel.add(b2);

        JButton b3=new JButton("Patient List");
        b2.setBounds(50,100,95,30);
        buttonpanel.add(b3);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new listdoctorsGUI();
    }
}

