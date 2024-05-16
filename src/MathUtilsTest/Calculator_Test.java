package MathUtilsTest;

import MathUtils.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class Calculator_Test
{


    // @Before
    //  public void setup(){
    //   calc = new Calculator();
    //  }


    /////////////////////////////////////////////////
    ///////// Compute total mark TEST ///////////////
    /////////////////////////////////////////////////
    @Test
    void Test_compute_total_mark_positiveTesting()
    {
        int activitiesMark = 8;
        int oralPracticalMark = 0;
        int midtermMark = 20;
        int finalMark = 59;

        int expectedValue = 87;

        int actualValue = Calculator.compute_total_mark(activitiesMark,oralPracticalMark,midtermMark,finalMark);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    /////////////////////////////////////////////////
    ////////////// compute grade TEST ///////////////
    /////////////////////////////////////////////////
    @Test
    void Test_compute_Grade_valuesBetween97And100_gradeAPlus()
    {
        int grade1 = 100;
        String expectedValue1 = "A+";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 97;
        String expectedValue2 = "A+";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1, actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween93And96_gradeA()
    {
        int grade1 = 96;
        String expectedValue1 = "A";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 93;
        String expectedValue2 = "A";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween89And92_gradeAMinus()
    {
        int grade1 = 92;
        String expectedValue1 = "A-";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 89;
        String expectedValue2 = "A-";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween84And88_gradeBPlus()
    {
        int grade1 = 88;
        String expectedValue1 = "B+";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 84;
        String expectedValue2 = "B+";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween80And83_gradeB()
    {
        int grade1 = 83;
        String expectedValue1 = "B";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 80;
        String expectedValue2 = "B";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween76And79_gradeBMinus()
    {
        int grade1 = 79;
        String expectedValue1 = "B-";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 76;
        String expectedValue2 = "B-";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween73And75_gradeCPlus()
    {
        int grade1 = 75;
        String expectedValue1 = "C+";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 73;
        String expectedValue2 = "C+";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween70And72_gradeC()
    {
        int grade1 = 72;
        String expectedValue1 = "C";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 70;
        String expectedValue2 = "C";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween67And69_gradeCMinus()
    {
        int grade1 = 69;
        String expectedValue1 = "C-";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 67;
        String expectedValue2 = "C-";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween64And66_gradeDPlus()
    {
        int grade1 = 66;
        String expectedValue1 = "D+";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 64;
        String expectedValue2 = "D+";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween60And63_gradeD()
    {
        int grade1 = 63;
        String expectedValue1 = "D";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 60;
        String expectedValue2 = "D";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween0And59_gradeF()
    {
        int grade1 = 59;
        String expectedValue1 = "F";
        String actualValue1 = Calculator.compute_Grade(grade1);

        int grade2 = 0;
        String expectedValue2 = "F";
        String actualValue2 = Calculator.compute_Grade(grade2);

        Assertions.assertEquals(expectedValue1,actualValue1);
        Assertions.assertEquals(expectedValue2,actualValue2);
    }

    /////////////////////////////////////////////////
    ////////////// compute Gpa TEST ///////////////
    /////////////////////////////////////////////////

    @Test
    void Test_compute_GPA_gradeAPlus_Gpa4()
    {
        String grade = "A+";

        float expectedValue = (float) 4;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeA_Gpa4()
    {
        String grade = "A";

        float expectedValue = (float) 4;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeAMinus_Gpa3_7()
    {
        String grade = "A-";

        float expectedValue = (float) 3.7;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeBPlus_Gpa3_3()
    {
        String grade = "B+";

        float expectedValue = (float) 3.3;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeB_Gpa3()
    {
        String grade = "B";

        float expectedValue = (float) 3;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeBMinus_Gpa2_7()
    {
        String grade = "B-";

        float expectedValue = (float) 2.7;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeCPlus_Gpa2_3()
    {
        String grade = "C+";

        float expectedValue = (float) 2.3;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeC_Gpa2()
    {
        String grade = "C";

        float expectedValue = (float) 2;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    @Tag("unit")
    @Tag("blackbox")
    void Test_compute_GPA_gradeCMinus_Gpa1_7()
    {
        String grade = "C-";

        float expectedValue = (float) 1.7;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeDPlus_Gpa1_3()
    {
        String grade = "D+";

        float expectedValue = (float) 1.3;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeD_Gpa1()
    {
        String grade = "D";

        float expectedValue = (float) 1;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    void Test_compute_GPA_gradeF_Gpa0()
    {
        String grade = "F";

        float expectedValue = (float) 0;

        float actualValue = Calculator.compute_GPA(grade);

        Assertions.assertEquals(expectedValue,actualValue);
    }
    /*
     ************************************************************
     ************************************************************
     * The following Test cases are related to WhiteBox Testing
     ************************************************************
     ************************************************************
     */


    @Test
    public void testComputeTotalMark() {
        // Test with positive values
        Assertions.assertEquals(85, Calculator.compute_total_mark(20, 15, 25, 25));

        // Test with zero values
        Assertions.assertEquals(0, Calculator.compute_total_mark(0, 0, 0, 0));

        // Test with negative values
        Assertions.assertEquals(-20, Calculator.compute_total_mark(-5, -5, -5, -5));
    }

    @Test
    public void testComputeGrade() {
        // Test for each grade boundary
        Assertions.assertEquals("A+", Calculator.compute_Grade(97));
        Assertions.assertEquals("A", Calculator.compute_Grade(93));
        Assertions.assertEquals("A-", Calculator.compute_Grade(89));
        Assertions.assertEquals("B+", Calculator.compute_Grade(84));
        Assertions.assertEquals("B", Calculator.compute_Grade(80));
        Assertions.assertEquals("B-", Calculator.compute_Grade(76));
        Assertions.assertEquals("C+", Calculator.compute_Grade(73));
        Assertions.assertEquals("C", Calculator.compute_Grade(70));
        Assertions.assertEquals("C-", Calculator.compute_Grade(67));
        Assertions.assertEquals("D+", Calculator.compute_Grade(64));
        Assertions.assertEquals("D", Calculator.compute_Grade(60));
        Assertions.assertEquals("F", Calculator.compute_Grade(59));
    }

    @Test
    public void testComputeGPA() {
        // Test for each grade to GPA conversion
        Assertions.assertEquals((float) 0, Calculator.compute_GPA("F"));
        Assertions.assertEquals((float) 1, Calculator.compute_GPA("D"));
        Assertions.assertEquals((float) 1.3, Calculator.compute_GPA("D+"));
        Assertions.assertEquals((float) 1.7, Calculator.compute_GPA("C-"));
        Assertions.assertEquals((float) 2, Calculator.compute_GPA("C"));
        Assertions.assertEquals((float) 2.3, Calculator.compute_GPA("C+"));
        Assertions.assertEquals((float) 2.7, Calculator.compute_GPA("B-"));
        Assertions.assertEquals((float) 3, Calculator.compute_GPA("B"));
        Assertions.assertEquals((float) 3.3, Calculator.compute_GPA("B+"));
        Assertions.assertEquals((float) 3.7, Calculator.compute_GPA("A-"));
        Assertions.assertEquals((float) 4, Calculator.compute_GPA("A+"));
    }
}