package MathUtilsIntegrationTest;

import MathUtils.FileProcessor;
import MathUtils.Student;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


// Testing the integration of the File Processor class, Student class and Subject class
public class FileProcessorStudentSubjectTest{


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Testing the course's info like name, code and full mark

    @Test
    void courseInfoTest1(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData1.txt");
        String actualCourseName = fp.getSubject().getName();
        String actualCourseCode = fp.getSubject().getCode();
        int actualCourseFullMark = fp.getSubject().getFullMark();

        String expectedCourseName = "Mathematics";
        String expectedCourseCode = "MAT101s";
        int expectedCourseFullMark = 100;

        Assertions.assertEquals(actualCourseName, expectedCourseName);
        Assertions.assertEquals(actualCourseCode, expectedCourseCode);
        Assertions.assertEquals(actualCourseFullMark, expectedCourseFullMark);

    }

    @Test
    void courseInfoTest2(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData2.txt");
        String actualCourseName = fp.getSubject().getName();
        String actualCourseCode = fp.getSubject().getCode();
        int actualCourseFullMark = fp.getSubject().getFullMark();

        String expectedCourseName = "SoftwareTesting";
        String expectedCourseCode = "SWT102s";
        int expectedCourseFullMark = 100;

        Assertions.assertEquals(actualCourseName, expectedCourseName);
        Assertions.assertEquals(actualCourseCode, expectedCourseCode);
        Assertions.assertEquals(actualCourseFullMark, expectedCourseFullMark);

    }

    @Test
    void courseInfoTest3(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData3.txt");
        String actualCourseName = fp.getSubject().getName();
        String actualCourseCode = fp.getSubject().getCode();
        int actualCourseFullMark = fp.getSubject().getFullMark();

        String expectedCourseName = "Database";
        String expectedCourseCode = "DTB201";
        int expectedCourseFullMark = 100;

        Assertions.assertEquals(actualCourseName, expectedCourseName);
        Assertions.assertEquals(actualCourseCode, expectedCourseCode);
        Assertions.assertEquals(actualCourseFullMark, expectedCourseFullMark);

    }

    @Test
    void courseInfoTest4(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData8.txt");
        String actualCourseName = fp.getSubject().getName();
        String actualCourseCode = fp.getSubject().getCode();
        int actualCourseFullMark = fp.getSubject().getFullMark();

        String expectedCourseName = "Physics";
        String expectedCourseCode = "PHY109s";
        int expectedCourseFullMark = 100;

        Assertions.assertEquals(actualCourseName, expectedCourseName);
        Assertions.assertEquals(actualCourseCode, expectedCourseCode);
        Assertions.assertEquals(actualCourseFullMark, expectedCourseFullMark);

    }

    @Test
    void courseInfoTest5(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData9.txt");
        String actualCourseName = fp.getSubject().getName();
        String actualCourseCode = fp.getSubject().getCode();
        int actualCourseFullMark = fp.getSubject().getFullMark();

        String expectedCourseName = "Statistics";
        String expectedCourseCode = "STA181s";
        int expectedCourseFullMark = 100;

        Assertions.assertEquals(actualCourseName, expectedCourseName);
        Assertions.assertEquals(actualCourseCode, expectedCourseCode);
        Assertions.assertEquals(actualCourseFullMark, expectedCourseFullMark);

    }

    @Test
    void courseInfoTest6(){
        // empty file
        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData10.txt");
        Assertions.assertNull(fp.getSubject());

    }

    @Test
    void courseInfoTest7(){
        // file doesn't exist
        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData200.txt");
        Assertions.assertNull(fp.getSubject());

    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Testing the enrolled students's info

    
    @Test
    void studentInfoTest1(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData1.txt");

        ArrayList <Student> actualEnrolledStudents = fp.getSubject().getEnrolledStudents();

        Student s1 = new Student("Alice","1234567a",8,9,15,35);
        Student s2 = new Student("Bob","1234567b",7,8,16,34);
        Student s3 = new Student("Charlie","1234567c",9,8,18,31);
        ArrayList <Student> expectedEnrolledStudents = new ArrayList<>();
        expectedEnrolledStudents.add(s1);
        expectedEnrolledStudents.add(s2);
        expectedEnrolledStudents.add(s3);

        for(int i = 0; i < 3; i++){

            Assertions.assertEquals(actualEnrolledStudents.get(i).getName(), expectedEnrolledStudents.get(i).getName());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getNumber(), expectedEnrolledStudents.get(i).getNumber());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getActivitiesMark(), expectedEnrolledStudents.get(i).getActivitiesMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getPracticalMark(), expectedEnrolledStudents.get(i).getPracticalMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getMidtermExamMark(), expectedEnrolledStudents.get(i).getMidtermExamMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getFinalExamMark(), expectedEnrolledStudents.get(i).getFinalExamMark());

        }

    }

    @Test
    void studentInfoTest3(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData3.txt");

        ArrayList <Student> actualEnrolledStudents = fp.getSubject().getEnrolledStudents();

        Student s1 = new Student("Grace","1234567g",7,8,14,29);
        Student s2 = new Student("Henry Kave","1234567h",9,8,18,35);
        Student s3 = new Student("Isabel","1234567i",8,9,17,32);
        Student s4 = new Student("Frank","1234567f",8,9,15,33);
        ArrayList <Student> expectedEnrolledStudents = new ArrayList<>();
        expectedEnrolledStudents.add(s1);
        expectedEnrolledStudents.add(s2);
        expectedEnrolledStudents.add(s3);
        expectedEnrolledStudents.add(s4);

        for(int i = 0; i < 4; i++){

            Assertions.assertEquals(actualEnrolledStudents.get(i).getName(), expectedEnrolledStudents.get(i).getName());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getNumber(), expectedEnrolledStudents.get(i).getNumber());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getActivitiesMark(), expectedEnrolledStudents.get(i).getActivitiesMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getPracticalMark(), expectedEnrolledStudents.get(i).getPracticalMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getMidtermExamMark(), expectedEnrolledStudents.get(i).getMidtermExamMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getFinalExamMark(), expectedEnrolledStudents.get(i).getFinalExamMark());

        }

    }

    @Test
    void studentInfoTest2(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData2.txt");

        ArrayList <Student> actualEnrolledStudents = fp.getSubject().getEnrolledStudents();

        Student s1 = new Student("David","1234567d",9,8,17,35);
        Student s2 = new Student("Eve","1234567e",8,9,16,32);
        ArrayList <Student> expectedEnrolledStudents = new ArrayList<>();
        expectedEnrolledStudents.add(s1);
        expectedEnrolledStudents.add(s2);

        for(int i = 0; i < 2; i++){

            Assertions.assertEquals(actualEnrolledStudents.get(i).getName(), expectedEnrolledStudents.get(i).getName());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getNumber(), expectedEnrolledStudents.get(i).getNumber());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getActivitiesMark(), expectedEnrolledStudents.get(i).getActivitiesMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getPracticalMark(), expectedEnrolledStudents.get(i).getPracticalMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getMidtermExamMark(), expectedEnrolledStudents.get(i).getMidtermExamMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getFinalExamMark(), expectedEnrolledStudents.get(i).getFinalExamMark());

        }

    }

    @Test
    void studentInfoTest4(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData7.txt");

        ArrayList <Student> actualEnrolledStudents = fp.getSubject().getEnrolledStudents();

        Student s1 = new Student("Ursula", "1234567u",8,9,16, 34);
        Student s2 = new Student("Victoria","1234567v",9,8,17, 31);
        Student s3 = new Student("William","1234567w",9, 8,18, 35);
        ArrayList <Student> expectedEnrolledStudents = new ArrayList<>();
        expectedEnrolledStudents.add(s1);
        expectedEnrolledStudents.add(s2);
        expectedEnrolledStudents.add(s3);

        for(int i = 0; i < 3; i++){

            Assertions.assertEquals(actualEnrolledStudents.get(i).getName(), expectedEnrolledStudents.get(i).getName());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getNumber(), expectedEnrolledStudents.get(i).getNumber());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getActivitiesMark(), expectedEnrolledStudents.get(i).getActivitiesMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getPracticalMark(), expectedEnrolledStudents.get(i).getPracticalMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getMidtermExamMark(), expectedEnrolledStudents.get(i).getMidtermExamMark());
            Assertions.assertEquals(actualEnrolledStudents.get(i).getFinalExamMark(), expectedEnrolledStudents.get(i).getFinalExamMark());

        }

    }

    @Test
    void studentInfoTest5(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData11.txt");

        ArrayList <Student> actualEnrolledStudents = fp.getSubject().getEnrolledStudents();

        for(int i = 0; i < 3; i++){

            Assertions.assertEquals(actualEnrolledStudents.get(i).getName(), "Info given was Invalid!");
            Assertions.assertEquals(actualEnrolledStudents.get(i).getNumber(), "Info given was Invalid!");
            Assertions.assertEquals(actualEnrolledStudents.get(i).getActivitiesMark(), (float) -1);
            Assertions.assertEquals(actualEnrolledStudents.get(i).getPracticalMark(), (float) -1);
            Assertions.assertEquals(actualEnrolledStudents.get(i).getMidtermExamMark(), (float) -1);
            Assertions.assertEquals(actualEnrolledStudents.get(i).getFinalExamMark(), (float) -1);

        }
    }

    @Test
    void studentInfoTest6(){

        FileProcessor fp = new FileProcessor("inputTestData\\inputTestData12.txt");

        ArrayList <Student> actualEnrolledStudents = fp.getSubject().getEnrolledStudents();

        for(int i = 0; i < 3; i++){

            Assertions.assertEquals(actualEnrolledStudents.get(i).getName(), "Info given was Invalid!");
            Assertions.assertEquals(actualEnrolledStudents.get(i).getNumber(), "Info given was Invalid!");
            Assertions.assertEquals(actualEnrolledStudents.get(i).getActivitiesMark(), (float) -1);
            Assertions.assertEquals(actualEnrolledStudents.get(i).getPracticalMark(), (float) -1);
            Assertions.assertEquals(actualEnrolledStudents.get(i).getMidtermExamMark(), (float) -1);
            Assertions.assertEquals(actualEnrolledStudents.get(i).getFinalExamMark(), (float) -1);

        }
    }

       


}
