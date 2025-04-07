package Javadatatype.SampleExamQuestions;

public class MyBoolTest {
    public static void main(String[] args) {
        boolean myBool = false; // line 1
        int yourInt = 10; // line 2
        float hisFloat = 19.54f; // line 3
        System.out.println(hisFloat = yourInt); // line 4
        System.out.println(yourInt > 10); // line 5
        System.out.println(myBool = false);
    }
}


//10.0
//false
//false

//Explanation: The expression myBool = false uses the assignment operator (=) and
//not a comparison operator (==). This expression assigns the boolean literal false to
//myBool; it doesn’t compare false with myBool. Watch out for similar (trick) assignments in the exam, which may seem to be comparing values.