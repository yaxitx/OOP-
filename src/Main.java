import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("DSgdsfg");


//        WestminsterSkinConsultationManager obj1 = new WestminsterSkinConsultationManager();

//        obj1.initialize(obj1.docArr);
        getOption();
    }

    public static void getOption() throws IOException {

            Scanner userInput = new Scanner(System.in);

        WestminsterSkinConsultationManager obj1 = new WestminsterSkinConsultationManager();


            while(true) {

                // Display the menu
                System.out.print("\nSkin Consultation Centre :" +
                        "\n\t\tA : Add a new doctor " +
                        "\n\t\tD : Delete a doctor " +
                        "\n\t\tP : Print the list of the doctors " +
                        "\n\t\tO : View Doctor's ordered alphabetically by surname." +
                        "\n\t\tS : Store program data into file "+
                        "\n\t\tQ : Quit the programme" +
                        "\n\nEnter the letter to choose the option : ");

                // Admin's task
                String menuOption;
                menuOption = userInput.nextLine().toUpperCase();

                // If admin enter "A" then add customer method will be called
                if (menuOption.equals("A"))
                    obj1.addDoc();

                    // If admin enter "D" then deleting customer will be called
                else if (menuOption.equals("D"))
                    obj1.delDoc();

                    // If admin enter "P" then Print the list of the doctors
                else if (menuOption.equals("P"))
                    obj1.priDoc();

                    // If admin enter "S" then saving data to the text method will be called
                else if (menuOption.equals("S"))
                    obj1.saveData();

                // If admin enter "Q" then program will get quit.
                else if (menuOption.equals("Q")) {
                    System.out.println("Program getting quit.\nThank you .\n" + "\n");

                    break;

                }
            }
    }
}
