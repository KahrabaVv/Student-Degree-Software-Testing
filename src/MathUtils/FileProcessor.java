package MathUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileProcessor {
    private Subject subject;

    // constructor
    public FileProcessor(String fileName) {
        ArrayList<Student> students = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Check if file is empty
            if (!bufferedReader.ready()) {
                System.out.println("ERROR EMPTY FILE!");
                return;
            }

            // Reading the first line for subject information
            String subjectLine = bufferedReader.readLine();
            String[] subjectInfo = subjectLine.split(",");
            String subjectName = subjectInfo[0];
            String subjectCode = subjectInfo[1];
            int fullMarks = Integer.parseInt(subjectInfo[2]);

            subject = new Subject(subjectName,subjectCode,fullMarks);

            // Reading student information
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] studentInfo = line.split(",");
                String studentName = studentInfo[0];
                String studentNumber = studentInfo[1];
                int activitiesMark = Integer.parseInt(studentInfo[2]);
                int practicalMark = Integer.parseInt(studentInfo[3]);
                int midtermExamMark = Integer.parseInt(studentInfo[4]);
                int finalExamMark = Integer.parseInt(studentInfo[5]);

                // Create a Student object and add it to the list
                Student student = new Student(studentName, studentNumber, activitiesMark, practicalMark, midtermExamMark, finalExamMark);
                students.add(student);
            }

            subject.setEnrolledStudents(students);

            // Close the BufferedReader
            bufferedReader.close();

        } catch(FileNotFoundException e) {
            System.out.print("File was not found!");
        } catch (Exception e) {
            System.out.print("Error, Could not process the file!");
        }
    }

    public Subject getSubject() {
        return subject;
    }
}
