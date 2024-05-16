package MathUtils;

import java.util.ArrayList;


public class Subject {

    private String name;
    private String code;
    private int fullMark;
    private ArrayList<Student> enrolledStudents;

    // constructor
    public Subject(String name, String code, int fullMark) {
        this.name = name;
        this.code = code;
        this.fullMark = fullMark;
    }


    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name.isEmpty()) {
            System.out.print("invalid subject name empty");
            return 0;
        } else if (Character.isWhitespace(name.charAt(0))) {
            System.out.print("invalid subject name start with space");
            return 0;
        } else if (name.matches("^[a-zA-Z]+$")) {
            System.out.print("invalid name containing Alphabetic only");
            return 0;
        } else {
            for (char c : name.toCharArray()) {
                if (Character.isDigit(c)) {
                    System.out.print("invalid subject name containing numbers");
                    return 0;
                } else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                    System.out.print("invalid subject name contains special symbol");
                    return 0;
                }
            }
            this.name = name;
            System.out.print("correct subject name info");
            return 1;
        }
    }


    public int setCode(String code) {
        if (code.isEmpty()) {
            System.out.print("invalid subject code empty");
            return 0;
        }

        else if (code.length() != 6 && code.length() != 7) {
            System.out.print("invalid subject code Length");
            return 0;
        }

        else if (code.length() == 7) {
            if (code.charAt(6) != 's') {
                System.out.print("invalid subject code");
                return 0;
            }
        }

        for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(code.charAt(i))) {
                    System.out.print("invalid subject code");
                    return 0;}
//                } else if (Character.isWhitespace(code.charAt(i))) {
//                    System.out.print("invalid subject code");
//                    return 0;
//                } else if (!Character.isLetterOrDigit(code.charAt(i)) && !Character.isWhitespace(code.charAt(i))) {
//                    System.out.print("invalid subject code");
//                    return 0;
//                }
            }

            for (int i = 3; i < 6; i++) {
                if (!Character.isDigit(code.charAt(i))) {
                    System.out.print("invalid subject code");
                    return 0;}
//                } else if (Character.isWhitespace(code.charAt(i))) {
//                    System.out.print("invalid subject code");
//                    return 0;
//                } else if (!Character.isLetterOrDigit(code.charAt(i)) && !Character.isWhitespace(code.charAt(i))) {
//                    System.out.print("invalid subject code");
//                    return 0;
//                }
            }

            this.code = code;
            System.out.print("Valid Subject Code");
            return 1;

        }




    public String getCode() {
        return code;
    }


    
    public int getFullMark() {
        return fullMark;
    }

    public int setFullMark(int fullMark) {
        if(fullMark > 100 || fullMark < 0)
        {
            System.out.print("full mark out of range");
            return 0;
        }

        else
        {
            this.fullMark = fullMark;
            System.out.print("full mark valid input");
            return 1;
        }
    }
    
    
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

}