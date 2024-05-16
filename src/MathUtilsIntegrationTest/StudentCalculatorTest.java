package MathUtilsIntegrationTest;

import MathUtils.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


// Testing the integration of the Student class and Calculator class
public class StudentCalculatorTest{


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Testing the computed GPA


    @Test
    void computeGradeTest1(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 20, 60); //100
        Student s2 = new Student("studentName", "12345678", 10, 10, 20, 59); //99
        Student s3 = new Student("studentName", "1234567c", 10, 10, 20, 57); //97
        String expectedGrade = "A+";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest2(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 16, 60); //96
        Student s2 = new Student("studentName", "1234567b", 10, 10, 15, 60); //95
        Student s3 = new Student("studentName", "1234567c", 10, 8, 15, 60); //93
        String expectedGrade = "A";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest3(){

        Student s1 = new Student("studentName", "1234567a", 8, 9, 18, 57); //92
        Student s2 = new Student("studentName", "1234567b", 8, 9, 18, 55); //90
        Student s3 = new Student("studentName", "1234567c", 7, 9, 18, 55); //89
        String expectedGrade = "A-";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest4(){

        Student s1 = new Student("studentName", "1234565k", 10, 10, 12, 56); //88
        Student s2 = new Student("studentName", "1234567b", 10, 10, 12, 54); //86
        Student s3 = new Student("studentName", "1234567c", 10, 10, 12, 52); //84
        String expectedGrade = "B+";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest5(){

        Student s1 = new Student("studentName", "1234567a", 5, 7, 15, 56); //83
        Student s2 = new Student("studentName", "12345677", 5, 7, 15, 55); //82
        Student s3 = new Student("studentName", "1234567c", 5, 7, 15, 53); //80
        String expectedGrade = "B";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest6(){

        Student s1 = new Student("student Name", "1234567a", 10, 10, 1, 58); //79
        Student s2 = new Student("student Name", "1234567b", 10, 10, 0, 58); //78
        Student s3 = new Student("student Name", "1234567c", 8, 10, 0, 58); //76
        String expectedGrade = "B-";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest7(){

        Student s1 = new Student("studentName", "1234567a", 5, 5, 15, 50); //75
        Student s2 = new Student("studentName", "1234567b", 5, 5, 14, 50); //74
        Student s3 = new Student("studentName", "12345679", 5, 5, 15, 48); //73
        String expectedGrade = "C+";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest8(){

        Student s1 = new Student("studentName", "1234567a", 10, 6, 15, 41); //72
        Student s2 = new Student("student Name", "1234567b", 10, 6, 15, 40); //71
        Student s3 = new Student("studentName", "1234567c", 10, 5, 15, 40); //70
        String expectedGrade = "C";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest9(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 18, 31); //69
        Student s2 = new Student("studentName", "12345558", 10, 10, 18, 30); //68
        Student s3 = new Student("stud ent Na me", "1234567c", 10, 10, 17, 30); //67
        String expectedGrade = "C-";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest10(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 5, 41); //66
        Student s2 = new Student("student Name", "1234567b", 10, 10, 5, 40); //65
        Student s3 = new Student("studentName", "1234567c", 9, 10, 5, 40); //64
        String expectedGrade = "D+";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest11(){

        Student s1 = new Student("student Name", "1234567a", 5, 5, 17, 36); //63
        Student s2 = new Student("studentName", "1234567b", 5, 5, 17, 35); //62
        Student s3 = new Student("studentName", "1234567c", 5, 5, 15, 35); //60
        String expectedGrade = "D";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest12(){

        Student s1 = new Student("studen Name", "1234567a", 10, 10, 20, 19); //59
        Student s2 = new Student("stu dent Name", "1234567b", 10, 10, 20, 10); //50
        Student s3 = new Student("studentName", "1234567c", 0, 0, 0, 0); //0
        String expectedGrade = "F"; //50
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    // Some Negative Test Cases

    @Test
    void computeGradeTest13(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, -20, 19); 
        Student s2 = new Student("studentName", "1234567b", 10, 10, 20, 70); 
        Student s3 = new Student("studentName", "1234567c", 11, 0, 0, 0);
        String expectedGrade = "Info given was Invalid!";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest14(){

        Student s1 = new Student("studentName", "123456789", 10, 10, 20, 19);
        Student s2 = new Student("studentName", "12345678d", 10, 10, 20, 40); 
        Student s3 = new Student("studentName", "1234567", 10, 0, 0, 0);
        String expectedGrade = "Info given was Invalid!";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest15(){

        Student s1 = new Student("studentName", "1234r567", 10, 10, 20, 19); 
        Student s2 = new Student("studentName", "f1234567", 10, 10, 20, 40);
        Student s3 = new Student("studentName", "abcdefgh", 10, 0, 0, 0);
        String expectedGrade = "Info given was Invalid!";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest16(){

        Student s1 = new Student("studentName", "1234 567", 10, 10, 20, 19);
        Student s2 = new Student("studentName", "1234567 f", 10, 10, 20, 40);
        Student s3 = new Student("studentName", "1234567*", 10, 0, 0, 0);
        String expectedGrade = "Info given was Invalid!";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest17(){

        Student s1 = new Student("", "12345678", 10, 10, 20, 19); 
        Student s2 = new Student("stude56ntName", "1234567b", 10, 10, 20, 40);
        Student s3 = new Student("studentName%", "1234567c", 10, 0, 0, 0);
        String expectedGrade = "Info given was Invalid!";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }

    @Test
    void computeGradeTest18(){

        Student s1 = new Student(" studentName", "12345678", 10, 10, 20, 19); 
        Student s2 = new Student("578", "1234567b", 10, 10, 20, 40);
        Student s3 = new Student("studentNa.me", "1234567c", 10, 0, 0, 0);
        String expectedGrade = "Info given was Invalid!";
        String actualGrade1 = s1.getGrade();
        String actualGrade2 = s2.getGrade();
        String actualGrade3 = s3.getGrade();
        Assertions.assertEquals(expectedGrade, actualGrade1);
        Assertions.assertEquals(expectedGrade, actualGrade2);
        Assertions.assertEquals(expectedGrade, actualGrade3);

    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Testing the computed Gpa


    @Test
    void computeGpaTest1(){

        Student s1 = new Student("student Name", "1234567a", 10, 10, 20, 60); //100
        Student s2 = new Student("student Name", "1234567b", 10, 10, 20, 59); //99
        Student s3 = new Student("student Name", "1234567c", 10, 10, 20, 57); //97
        float expectedGpa = (float) 4; //A+
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest2(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 16, 60); //96
        Student s2 = new Student("student Na me", "1234567b", 10, 10, 15, 60); //95
        Student s3 = new Student("studentName", "1234567c", 10, 8, 15, 60); //93
        float expectedGpa = (float) 4; //A
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest3(){

        Student s1 = new Student("studentName", "1234567a", 8, 9, 18, 57); //92
        Student s2 = new Student("stu den tN ame", "1234567b", 8, 9, 18, 55); //90
        Student s3 = new Student("studentName", "1234567c", 7, 9, 18, 55); //89
        float expectedGpa = (float) 3.7; //A-
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);
    }

    @Test
    void computeGpaTest4(){

        Student s1 = new Student("studen tName", "1234567a", 10, 10, 12, 56); //88
        Student s2 = new Student("studentName", "1234567b", 10, 10, 12, 54); //86
        Student s3 = new Student("studentName", "1234567c", 10, 10, 12, 52); //84
        float expectedGpa = (float) 3.3; //B+
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest5(){

        Student s1 = new Student("studentName", "1234567a", 5, 7, 15, 56); //83
        Student s2 = new Student("studentName", "1234567b", 5, 7, 15, 55); //82
        Student s3 = new Student("studentName", "1234567c", 5, 7, 15, 53); //80
        float expectedGpa = (float) 3; //B
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);
    }

    @Test
    void computeGpaTest6(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 1, 58); //79
        Student s2 = new Student("studentName", "1234567b", 10, 10, 0, 58); //78
        Student s3 = new Student("studentName", "1234567c", 8, 10, 0, 58); //76
        float expectedGpa = (float) 2.7; //B-
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);
    }

    @Test
    void computeGpaTest7(){

        Student s1 = new Student("student Name", "1234567a", 5, 5, 15, 50); //75
        Student s2 = new Student("studentName", "1234567b", 5, 5, 14, 50); //74
        Student s3 = new Student("student Na me", "1234567c", 5, 5, 15, 48); //73
        float expectedGpa = (float) 2.3; //C+
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest8(){

        Student s1 = new Student("studentName", "1234567a", 10, 6, 15, 41); //72
        Student s2 = new Student("studentName", "1234567b", 10, 6, 15, 40); //71
        Student s3 = new Student("studentName", "1234567c", 10, 5, 15, 40); //70
        float expectedGpa = (float) 2; //C
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest9(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 18, 31); //69
        Student s2 = new Student("studentName", "1234567b", 10, 10, 18, 30); //68
        Student s3 = new Student("studentName", "1234567c", 10, 10, 17, 30); //67
        float expectedGpa = (float) 1.7; //C-
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);
    }

    @Test
    void computeGpaTest10(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 5, 41); //66
        Student s2 = new Student("studentName", "1234567b", 10, 10, 5, 40); //65
        Student s3 = new Student("studentName", "1234567c", 9, 10, 5, 40); //64
        float expectedGpa = (float) 1.3; //D+
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest11(){

        Student s1 = new Student("studentName", "1234567a", 5, 5, 17, 36); //63
        Student s2 = new Student("studentName", "1234567b", 5, 5, 17, 35); //62
        Student s3 = new Student("studentName", "1234567c", 5, 5, 15, 35); //60
        float expectedGpa = (float) 1; //D
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest12(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, 20, 19); //59
        Student s2 = new Student("studentName", "1234567b", 10, 10, 20, 10); //50
        Student s3 = new Student("studentName", "1234567c", 0, 0, 0, 0); //0
        float expectedGpa = (float) 0; //F
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    // Some Negative Test Cases

    @Test
    void computeGpaTest13(){

        Student s1 = new Student("studentName", "1234567a", 10, 10, -20, 19); 
        Student s2 = new Student("studentName", "1234567b", 10, 10, 20, 70); 
        Student s3 = new Student("studentName", "1234567c", 11, 0, 0, 0);
        float expectedGpa = (float) -1;
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest14(){

        Student s1 = new Student("studentName", "123456789", 10, 10, 20, 19);
        Student s2 = new Student("studentName", "12345678d", 10, 10, 20, 40); 
        Student s3 = new Student("studentName", "1234567", 10, 0, 0, 0);
        float expectedGpa = (float) -1;
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest15(){

        Student s1 = new Student("studentName", "1234r567", 10, 10, 20, 19); 
        Student s2 = new Student("studentName", "f1234567", 10, 10, 20, 40);
        Student s3 = new Student("studentName", "abcdefgh", 10, 0, 0, 0);
        float expectedGpa = (float) -1;
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest16(){

        Student s1 = new Student("studentName", "1234 567", 10, 10, 20, 19);
        Student s2 = new Student("studentName", "1234567 f", 10, 10, 20, 40);
        Student s3 = new Student("studentName", "1234567*", 10, 0, 0, 0);
        float expectedGpa = (float) -1;
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest17(){

        Student s1 = new Student("", "12345678", 10, 10, 20, 19); 
        Student s2 = new Student("stude56ntName", "1234567b", 10, 10, 20, 40);
        Student s3 = new Student("studentName%", "1234567c", 10, 0, 0, 0);
        float expectedGpa = (float) -1;
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }

    @Test
    void computeGpaTest18(){

        Student s1 = new Student(" studentName", "12345678", 10, 10, 20, 19); 
        Student s2 = new Student("578", "1234567b", 10, 10, 20, 40);
        Student s3 = new Student("studentNa.me", "1234567c", 10, 0, 0, 0);
        float expectedGpa = (float) -1;
        float actualGpa1 = s1.getGpa();
        float actualGpa2 = s2.getGpa();
        float actualGpa3 = s3.getGpa();
        Assertions.assertEquals(expectedGpa, actualGpa1);
        Assertions.assertEquals(expectedGpa, actualGpa2);
        Assertions.assertEquals(expectedGpa, actualGpa3);

    }


}