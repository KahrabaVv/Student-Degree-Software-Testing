package MathUtilsTest;

import static org.junit.Assert.*;

import MathUtils.Student;
import MathUtils.Subject;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SubjectTest {

   Subject sub ;
    int temp;

    @Before
    public void setup(){
        sub = new Subject(null, null , 0 );
    }

    @AfterEach
    public void cleanup(){
        temp = 0;
    }

    /////////////////////////////////////////////////
    /////////////// SUBJECT NAME TEST ///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_subjecttName_alphWithSpace() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("Intro to Electronics");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "correct subject name info" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subjecttName_numbersonly() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("1234");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name containing numbers" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subjecttName_numbers_with_alphabetic() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("electronics1234");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name containing numbers" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subjecttName_alphabetic_only() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("electronics");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid name containing Alphabetic only" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subjecttName_Start_with_spaces() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName(" testing");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name start with space";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subjecttName_Empty_name() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name empty";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subjecttName_with_special_symbol_name() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("testing@");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name contains special symbol";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    /////////////// SUBJECT CODE TEST ///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_subject_CODE_with_6_RIGHT_CHAR() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC123");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid Subject Code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_7_RIGHT_CHAR() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC123s");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid Subject Code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_All_alphabetic() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABCDEF");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_All_Digits() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("123456");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_All_alphabetic_7() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABCDEFG");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_All_Digits_7() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABCDEFG");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_alphabetic_in_last3() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC1D3");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_Digit_in_first3 () {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("A5C123");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_special_character () {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC@23");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_space() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC 23");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subject_CODE_with_wrong_lenth() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC12");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code Length";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_Empty() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code empty";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    ////////////////FULL MARK TESTING ///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_fullmark_right_in() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(80);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "full mark valid input";
        assertEquals(expected2,actual2);
        assertEquals(expected1,actual1);

    }


    @Test
    public void test_fullmark_out_of_range() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(150);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "full mark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_99() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(99);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "full mark valid input";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_101() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(101);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "full mark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_minus1() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(-1);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "full mark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_1() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(1);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "full mark valid input";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////



    @Test
    public void getName() {
        String expected = "electronic cse";
        temp = sub.setName(expected);
        String actual = sub.getName();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }


    @Test
    public void getCode() {
        String expected = "ABC123";
        temp = sub.setCode(expected);
        String actual = sub.getCode();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }


    @Test
    public void getFullMark() {
        int expected = 80;
        temp = sub.setFullMark(expected);
        int actual = sub.getFullMark();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }


//
//    @Test
//    public void getEnrolledStudents() {
//    }
//
//    @Test
//    public void setEnrolledStudents() {
//    }

    /*
     ************************************************************
     ************************************************************
     * The following Test cases are related to WhiteBox Testing
     ************************************************************
     ************************************************************
     */

    @Test
    public void testConstructor() {
        // Create a Subject object using the constructor
        Subject subject = new Subject("Math", "MATH01", 100);
        // Check if the object is not null, indicating successful creation
        assertNotNull(subject);
    }

    @Test
    public void testSetName() {
        // Create a Subject object for testing
        Subject subject = new Subject("Math", "MATH01", 100);

        // Test invalid input for setName method
        assertEquals(0, subject.setName(""));         // empty name
        assertEquals(0, subject.setName(" Math"));    // name starting with space
        assertEquals(0, subject.setName("123"));      // name containing numbers
        assertEquals(0, subject.setName("Math$"));    // name containing special characters
        assertEquals(0, subject.setName("Mathematics")); // name length exceeds limit
    }

    @Test
    public void testSetCode() {
        // Create a Subject object for testing
        Subject subject = new Subject("Math", "MATH01", 100);

        // Test invalid input for setCode method
        assertEquals(0, subject.setCode(""));        // empty code
        assertEquals(0, subject.setCode("123"));      // code containing only numbers
        assertEquals(0, subject.setCode("ABC"));      // code containing only letters
        assertEquals(0, subject.setCode("MATH"));     // code length less than 6
        assertEquals(0, subject.setCode("MATH001"));  // code length more than 7
        assertEquals(0, subject.setCode("MATH01 "));  // code containing trailing space
        assertEquals(0, subject.setCode("MATH01s"));  // code containing 's' in the wrong position
    }

    @Test
    public void testSetFullMark() {
        // Create a Subject object for testing
        Subject subject = new Subject("Math", "MATH01", 100);

        // Test invalid input for setFullMark method
        assertEquals(0, subject.setFullMark(120));   // full mark greater than 100
        assertEquals(0, subject.setFullMark(-10));    // full mark less than 0

        // Test valid input for setFullMark method
        assertEquals(1, subject.setFullMark(90));     // full mark within range
    }

    @Test
    public void testGetters() {
        // Create a Subject object for testing
        Subject subject = new Subject("Math", "MATH01", 100);

        // Test getters for subject properties
        assertEquals("Math", subject.getName());     // test getName method
        assertEquals("MATH01", subject.getCode());   // test getCode method
        assertEquals(100, subject.getFullMark());    // test getFullMark method
    }

    @Test
    public void testSetEnrolledStudents() {
        // Create a Subject object for testing
        Subject subject = new Subject("Math", "MATH01", 100);
        ArrayList<Student> students = new ArrayList<>();

        // Test setEnrolledStudents method
        subject.setEnrolledStudents(students);       // set enrolled students
        assertEquals(students, subject.getEnrolledStudents()); // verify if set correctly
    }



}