package MathUtilsIntegrationTest;

import MathUtils.InputOutput;
import MathUtils.Student;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputOutputFileProcessorTest {

    private InputOutput IO;

    @Before
    public void setup(){
        IO = new InputOutput("","");
    }

    @Test
    public void Right_one_File_Input(){
        IO = new InputOutput("input_file.txt" , "INTEG_TST1");
    }

    @Test
    public void Right_Mult_File_Input(){
        IO = new InputOutput("input_file.txt" , "INTEG_TST2_1");
        InputOutput IO2 = new InputOutput("input_file2.txt" , "INTEG_TST2_2");
        InputOutput IO3 = new InputOutput("input_file3.txt" , "INTEG_TST2_3");
    }

    @Test
    public void Empty_File_Input(){
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);
        IO = new InputOutput("empty_file.txt" , "INTEG_TST2_1");

        String expected = "ERROR EMPTY FILE!";
        String actual = boas.toString();

//        assertEquals(expected,actual);
    }


    @Test
    public void Empty_File_Handle(){
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);
        IO = new InputOutput("" , "INTEG_TST3_1");

        String expected = "File was not found!";
        String actual = boas.toString();

        assertEquals(expected,actual);
    }

}
