import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.util.Date;
import javax.swing.JFormattedTextField;

public class PatientGUI {
    public static void main(String[] args) {

        WestminsterSkinConsultationManager newobjx = new WestminsterSkinConsultationManager();


        // Create a panel to hold the form elements
        JPanel panelmain = new JPanel();
        JPanel panel = new JPanel();
        GridLayout gridlaynew = new GridLayout(10,1);
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

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    newobjx.consultf(textField.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField6.getText(), dobText.getText(), timeArea1.getText(), timeArea2.getText());

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // Create a doc list button
        JButton button1 = new JButton("Doctor List");

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

        panel.add(button1);

        // Create a frame to hold the panel
        JFrame frame = new JFrame("Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelmain.add(panel);
        GridLayout gridlay = new GridLayout(1,1);
        panelmain.setLayout(gridlay);
        frame.add(panelmain);
        frame.pack();

        frame.setVisible(true);

        JTextField Jtext = new JTextField("From Example");
//        Jtext.setSize();
    }
}