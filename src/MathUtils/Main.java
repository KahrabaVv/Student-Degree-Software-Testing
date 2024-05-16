package MathUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfSubjects;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Of Subjects:");
        numberOfSubjects = scanner.nextInt();


       for (int i = 0 ; i < numberOfSubjects ; i++)
       {
           System.out.println("\nEnter InputFile"+(i+1)+"name: ");
           Scanner scanner1 = new Scanner(System.in);
           try {
               String file_hand = scanner1.nextLine();
               String Output_File = "Subject" + (i+1);
               InputOutput IO = new InputOutput(file_hand , Output_File);
           } catch (Exception e){
               System.out.println("EMPTY ENTRY");
           }

       }

    }
}
