package MathUtils;

public class Calculator {

    /*
     * Description: Compute the total mark for a student
     *
     * Input: activitiesMark, oralPracticalMark, midtermMark, finalMark: int
     *
     * Output: Total Student Marks: int
     *
     */
    public static int compute_total_mark(int activitiesMark, int oralPracticalMark, int midtermMark, int finalMark){
        return (activitiesMark+oralPracticalMark+midtermMark+finalMark);
    }

    /*
     * Description: Convert student total mark to Grade
     *
     * Input: Total Mark: int
     *
     * Output: Student Grade: String
     *
     */
    public static String compute_Grade(int mark){
        String Grade;
        if(mark >= 97)
            Grade = "A+";
        else if(mark >= 93)
            Grade = "A";
        else if(mark >= 89)
            Grade = "A-";
        else if(mark >= 84)
            Grade = "B+";
        else if(mark >= 80)
            Grade = "B";
        else if(mark >= 76)
            Grade = "B-";
        else if(mark >= 73)
            Grade = "C+";
        else if(mark >= 70)
            Grade = "C";
        else if(mark >= 67)
            Grade = "C-";
        else if(mark >= 64)
            Grade = "D+";
        else if(mark >= 60)
            Grade = "D";
        else
            Grade = "F";

        return Grade;
    }

    /*
     * Description: Convert student Grade to GPA
     *
     * Input: Student Grade: String
     *
     * Output: Student GPA: float
     *
     */
    public static float compute_GPA(String Grade){
        float GPA;

        switch (Grade) {
			case "F":
				GPA = (float) 0;
				break;
			case "D":
				GPA = (float) 1;
				break;
			case "D+":
				GPA = (float) 1.3;
				break;
			case "C-":
				GPA = (float)1.7;
				break;
			case "C":
				GPA = (float) 2;
				break;
			case "C+":
				GPA = (float) 2.3;
				break;
			case "B-":
				GPA = (float) 2.7;
				break;
			case "B":
				GPA = (float) 3;
				break;
			case "B+":
				GPA = (float) 3.3;
				break;
			case "A-":
				GPA = (float) 3.7;
				break;
			default:
				GPA = (float) 4;
				break;
		}

		return GPA;
    }
}