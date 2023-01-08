import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;


public class WestminsterSkinConsultationManager implements SkinConsultationManager {


    //    String[][] docArr = new String[10][6];
    static ArrayList<Doctor> docArr = new ArrayList<Doctor>();
    Scanner myObj = new Scanner(System.in);

    //method to add a doctor
    public void addDoc() {
        Doctor doc = new Doctor();
        System.out.print("    Enter doctor's name : ");
        doc.setName(myObj.nextLine());

        System.out.print("    Enter doctor's surname : ");
        doc.setSurName(myObj.nextLine());

        System.out.print("    Enter DOB : ");
        doc.setDob(myObj.nextLine());

        System.out.print("    Enter mobile number : ");
        doc.setMobiNum(myObj.nextInt());
        myObj.nextLine();

        System.out.print("    Enter medical licence number : ");
        doc.setmediLicenceNum(myObj.nextLine());

        System.out.print("    Enter specialisation : ");
        doc.setspecialisation(myObj.nextLine());

        docArr.add(doc);
        System.out.print("No " + docArr.size() + " Doctor added successfully!!");
        System.out.println();
    }


    //method to delete a doctor
    public void delDoc() {
        //remove doctor object from arraylist
        Scanner doctorDetails = new Scanner(System.in);

        System.out.print("Enter Doctor Medical License No to delete : ");
        String licNo = doctorDetails.nextLine();
        System.out.println();

        for (int i = 0; i < docArr.size(); i++) {
            if (docArr.get(i).getmediLicenceNum().equalsIgnoreCase(licNo)) ;
            {
                docArr.remove(i);
                System.out.println("Deleted doctor from the list");
            }

        }
    }

    public  void consultf(String firstname, String surename, String dob, String mobilnum, String bookeddate, String medicalLicenseNO, String starttime , String endtime , String notes) throws IOException {
        // Open the file.
        FileWriter Writer = new FileWriter("src/files/tempfile.txt",true);

        Writer.write(firstname+":"+surename+ ":" +dob+":"+mobilnum+":"+bookeddate+":"+medicalLicenseNO+":"+starttime+":"+endtime+":"+notes) ;
        Writer.write(System.getProperty("line.separator"));
        Writer.close();

    }


    //method to view doctors
    public void priDoc() {
//        Doctor doc2 = new Doctor();
        System.out.println("List of all Doctors");

        //sort doctors using surname
        docArr.sort((o1, o2) -> o1.getSurName().compareTo(o2.getSurName()));

        for (int i=0; i< docArr.size(); i++){

            System.out.println("Doctor No " + (i + 1));

            System.out.printf("\t Doctor Full Name : %s\n\t Doctor DOB : %s\n\t Doctor Contact No : %s\n\t Doctor Medical License No : %s\n\t Doctor Specialization : %s \n\n",
                    (docArr.get(i).getName() + " " + docArr.get(i).getSurName()), docArr.get(i).getDob(),
                    docArr.get(i).getMobiNum(),docArr.get(i).getmediLicenceNum(),docArr.get(i).getspecialisation());
        }
    }


        //method to save data in text file
        void saveData () {

            //sort doctors using surname
            docArr.sort((o1, o2) -> o1.getSurName().compareTo(o2.getSurName()));

            String DATA = "";

            for (int i = 0; i < docArr.size(); i++) {
                DATA += String.format(docArr.get(i).getName() + "," + docArr.get(i).getSurName()
                        + "," + docArr.get(i).getDob() + "," + docArr.get(i).getMobiNum() + ","
                        + docArr.get(i).getspecialisation() + "," + docArr.get(i).getmediLicenceNum() + "\n");
            }

            try {

                //create a File object
                File db = new File("westministerData.txt");

                //write a File object
                FileWriter dbwrite = new FileWriter("westministerData.txt", true);

                //Viewer desktop file object
                Desktop desktop = Desktop.getDesktop();

                //check if file exists
                if (db.exists()) {
                    System.out.println("\t File already exists\n");

                    //append it to the existing file
                    dbwrite.append(DATA);
                    System.out.printf("\t\t︎ File %s is appended with data succesfully!\n", db.getName());
                    if (db.exists()) desktop.open(db);
                    System.out.printf("\t\t︎ File %s is Ready to View\n\n", db.getName());


                } else {

                    //create a new file
                    db.createNewFile();
                    System.out.printf("\n\t\t︎ File %s created succesfully!\n\n", db.getName());
                    dbwrite.append(DATA);
                    System.out.printf("\n\t\t︎ File %s is written with data succesfully!\n\n", db.getName());
                    if (db.exists()) desktop.open(db);
                    System.out.printf("\t\t File %s is Ready to View\n\n", db.getName());

                }

                dbwrite.close();

            } catch (IOException e) {
                System.out.println("An error occurred while file creation.");
                e.printStackTrace();
            }
        }

    }