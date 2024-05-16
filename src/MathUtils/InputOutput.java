package MathUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InputOutput {

    String  file_hand;

    public InputOutput(String file_hand , String Output_File) {
        this.file_hand = file_hand;
        if (file_hand != null) {
            CALCULATE(Output_File);
        }
//        else {
//            System.out.println("FILE HANDLE IS EMPTY");
//        }
    }

    private void CALCULATE(String Output_File) {
        try {
            FileProcessor fileProcessor = new FileProcessor(file_hand);
            ArrayList<Student> Student_list = fileProcessor.getSubject().getEnrolledStudents();
            Generate_OUT(Student_list , fileProcessor , Output_File);
        } catch (Exception e) {
            //System.out.println("ERROR EMPTY FILE!\n" + e.getMessage());
        }
    }


    private void Generate_OUT(ArrayList<Student> Student_list , FileProcessor fileProcessor , String Output_File) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Output_File))) {
            writer.write("Subject Name: " + fileProcessor.getSubject().getName() + "     Max Mark: " + fileProcessor.getSubject().getFullMark());
            writer.newLine();
            writer.write("-----------------------------------------------------");
            writer.newLine();
            writer.write(String.format("%-20s %-15s %-6s %-5s", "Student name", "Student number", "GPA", "Grade"));
            writer.newLine();
            writer.newLine();
            for (Student student : Student_list) {
                writer.write(String.format("%-20s %-15s %-6s %-5s", student.getName(), student.getNumber(), student.getGpa(), student.getGrade()));
                writer.newLine();
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }


}
