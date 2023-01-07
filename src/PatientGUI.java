import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;

import java.awt.*;
import javax.swing.*;
import java.text.DateFormat;
import java.text.Format;
import java.util.Date;
import javax.swing.JFormattedTextField;

public class PatientGUI {
    public static void main(String[] args) {

        JLabel headerlable = new JLabel();

        headerlable.setPreferredSize(new Dimension(250, 100));
        headerlable.setText("Available Doctor List");
        headerlable.setFont(new Font("Calibri",Font.BOLD,25));
        headerlable.setVerticalTextPosition(JLabel.TOP);
        headerlable.setHorizontalAlignment(JLabel.CENTER);
        headerlable.setForeground(Color.BLACK);

        // Create a panel to hold the form elements
        JPanel panelmain = new JPanel();
        JPanel panel = new JPanel();
        GridLayout gridlaynew = new GridLayout(5,2);
        gridlaynew.setHgap(40);
        gridlaynew.setVgap(10);
        panel.setLayout(gridlaynew);
        panel.setSize(new Dimension(300,100));

        // Create a labels and a text field

        JLabel label = new JLabel("Patient's first name :");
        JTextField textField = new JTextField(20);

        JLabel label2 = new JLabel("Patient's surname :");
        JTextField textField2 = new JTextField(20);

        JLabel label3 = new JLabel("Date of Birth :");
        JTextField textField3 = new JTextField(20);

        JLabel label4 = new JLabel("Mobile Number :");
        JTextField textField4 = new JTextField(20);

        JLabel label5 = new JLabel("ID No :");
        JTextField textField5 = new JTextField(20);

        JLabel label6 = new JLabel("Extra Note :");
        JTextField textField6 = new JTextField(20);

        JLabel label7 = new JLabel("Add date :");

        JLabel label8 = new JLabel("Start time :");

        JLabel label9 = new JLabel("End time :");

        //Create a label for date

        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setSizeTextFieldMinimumWidthDefaultOverride(false);
        dateSettings2.setSizeTextFieldMinimumWidth(6);
        DatePicker dobText = new DatePicker(dateSettings2);

        //Create a label for start time and end time

        TimePickerSettings timeSettings=new TimePickerSettings();

        timeSettings.setMinimumSpinnerButtonWidthInPixels(15);
        timeSettings.setDisplaySpinnerButtons(true);

        TimePicker timeArea1 =new TimePicker(timeSettings);
        TimePicker timeArea2 =new TimePicker(timeSettings);


        // Create a submit button
        JButton button = new JButton("Submit");

        // Add the label, text field, and button to the panel
        panel.add(label);
        panel.add(textField);

        panel.add(label2);
        panel.add(textField2);

        panel.add(label3);
        panel.add(textField3);

        panel.add(label4);
        panel.add(textField4);

        panel.add(label5);
        panel.add(textField5);

        panel.add(label6);
        panel.add(textField6);

        panel.add(label7);
        panel.add(dobText);

        panel.add(label8);
        panel.add(timeArea1);

        panel.add(label9);
        panel.add(timeArea2);

        panel.add(button);

        // Create a frame to hold the panel
        JFrame frame = new JFrame("Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelmain.add(panel);
        GridLayout gridlay = new GridLayout(2,1);
        panelmain.setLayout(gridlay);
        frame.add(panelmain);
        frame.pack();

        JPanel buttonpanel = new JPanel(new FlowLayout(4));
        panel.add(buttonpanel);


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

        JTextField Jtext = new JTextField("From Example");
//        Jtext.setSize();
    }
}