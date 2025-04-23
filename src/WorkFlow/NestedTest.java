package WorkFlow;

public class NestedTest {
    public static void main(String[] args) {
        int marks = 85;
        String grade = "";

        if (marks >= 50) {
            if (marks >= 80) {
                grade = "A";
            } else {
                grade = "B";
            }
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

    }
}


//A