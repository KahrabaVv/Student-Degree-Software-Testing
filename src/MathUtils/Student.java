package MathUtils;

public class Student {


    private String name;
    private String number;

    private int activitiesMark ;
    private int practicalMark ;
    private int midtermExamMark ;
    private int finalExamMark ;

    private float gpa;
    private String grade;

    private int wrongInfoFlag;



    // constructor
    public Student(String name, String number, int activitiesMark, int practicalMark, int midtermExamMark, int finalExamMark) {
        setName(name);
        setNumber(number);
        setActivitiesMark(activitiesMark);
        setPracticalMark(practicalMark);
        setMidtermExamMark(midtermExamMark);
        setFinalExamMark(finalExamMark);
        setGrade(Calculator.compute_Grade(Calculator.compute_total_mark(activitiesMark, practicalMark, midtermExamMark, finalExamMark)));
        setGpa(Calculator.compute_GPA(this.grade));
    }


    public float getGpa() {
        if (wrongInfoFlag == 1)
            return -1;
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
            System.out.print("OK");
        }
        else{
            System.out.println("Invalid GPA");
            wrongInfoFlag = 1;
        }
    }

    public String getGrade() {
        if (wrongInfoFlag == 1)
            return "Info given was Invalid!";
        return grade;
    }

    public void setGrade(String grade) {
        if( grade == "A+" ||
            grade == "A" ||
            grade == "A-" ||
            grade == "B+" ||
            grade == "B" ||
            grade == "B-" ||
            grade == "C+" ||
            grade == "C" ||
            grade == "C-" ||
            grade == "D+" ||
            grade == "D" ||
            grade == "F"){
                this.grade = grade;
        }
//        else{
//            System.out.println("Invalid Grade");
//            wrongInfoFlag = 1;
//        }
    }
    public String getName() {
        if (wrongInfoFlag == 1)
            return "Info given was Invalid!";
        return name;
    }

    public int setName(String name) {
        if(name.isEmpty()){
            System.out.print("invalid student name empty");
            wrongInfoFlag = 1;
            return 0 ;
        }

        else if (Character.isWhitespace(name.charAt(0))) {
            System.out.print("invalid student name start with space");
            wrongInfoFlag = 1;
            return 0 ;
        }

        else if (name.matches("^[a-zA-Z]+$")) {
            System.out.print("invalid name containing Alphabetic only");
            return 0;
        }


        else {
            for(char c:name.toCharArray()){
                if(Character.isDigit(c)){
                    System.out.print("invalid student name containing numbers");
                    wrongInfoFlag = 1;
                    return 0;
                }
                else if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                    System.out.print("invalid student name contains special symbol");
                    wrongInfoFlag = 1;
                    return 0;
                }
            }
            this.name = name ;
             System.out.print("correct student name info");
             return 1;
        }
    }


    public String getNumber() {
        if (wrongInfoFlag == 1)
            return "Info given was Invalid!";
        return number;
    }

    public int setNumber(String number) {
        if(number.length() != 8) {
            System.out.print("invalid width number");
            wrongInfoFlag = 1;
            return 0 ;
        }

        else if (!Character.isLetterOrDigit(number.charAt(7)) && !Character.isWhitespace(number.charAt(7)))
        {
            System.out.print("invalid number contains special symbol");
            wrongInfoFlag = 1;
            return 0 ;
        }

//        else if (Character.isWhitespace(number.charAt(7)))
//        {
//            System.out.print("invalid number contains Space");
//            wrongInfoFlag = 1;
//            return 0 ;
//        }

        else{
            for (int i = 0; i < 7; i++) {
                if (Character.isLetter(number.charAt(i))) {
                    System.out.print("invalid number contains alphabetic");
                    wrongInfoFlag = 1;
                    return 0 ;
                }

                else if (!Character.isLetterOrDigit(number.charAt(i)) && !Character.isWhitespace(number.charAt(i)) )
                {
                    System.out.print("invalid number contains special symbol");
                    wrongInfoFlag = 1;
                    return 0 ;
                }

                else if (Character.isWhitespace(number.charAt(i))) {
                    System.out.print("invalid number contains space");
                    wrongInfoFlag = 1;
                    return 0 ;
                }
            }
            this.number = number;
            System.out.print("Valid Number");
            return 1;
        }
    }

    public int getActivitiesMark() {
        if (wrongInfoFlag == 1)
            return -1;
        return activitiesMark;
    }

    public int setActivitiesMark(int activitiesMark) {
        if(activitiesMark < 0 || activitiesMark > 10)
        {
           System.out.print("invalid ActivityMark out of range");
           wrongInfoFlag = 1;
           return 0 ;
        }

        else {
            this.activitiesMark = activitiesMark;
            System.out.print("Valid ActivityMark");
            return 1 ;
        }
    }

    public int getPracticalMark() {
        if (wrongInfoFlag == 1)
            return -1;
        return practicalMark;
    }

    public int setPracticalMark(int practicalMark) {
        if(practicalMark < 0 || practicalMark > 10)
        {
            System.out.print("invalid PracticalMark out of range");
            wrongInfoFlag = 1;
            return 0 ;
        }

        else {
            this.practicalMark = practicalMark;
            System.out.print("Valid PracticalMark");
            return 1 ;
        }
    }


    public int getMidtermExamMark() {
        if (wrongInfoFlag == 1)
            return -1;
        return midtermExamMark;
    }

    public int setMidtermExamMark(int midtermExamMark) {
        if(midtermExamMark < 0 || midtermExamMark > 20)
        {
            System.out.print("invalid MidtermMark out of range");
            wrongInfoFlag = 1;
            return 0 ;
        }

        else {
            this.midtermExamMark = midtermExamMark;
            System.out.print("Valid MidtermMark");
            return 1 ;
        }
    }


    public int getFinalExamMark() {
        if (wrongInfoFlag == 1)
            return -1;
        return finalExamMark;
    }

    public int setFinalExamMark(int finalExamMark) {
        if(finalExamMark < 0 || finalExamMark > 60)
        {
            System.out.print("invalid FinalMark out of range");
            wrongInfoFlag = 1;
            return 0 ;
        }

        else {
            this.finalExamMark = finalExamMark;
            System.out.print("Valid FinalMark");
            return 1 ;
        }
    }

}