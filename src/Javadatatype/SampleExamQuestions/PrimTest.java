//Examine the following code and select the correct options:
package Javadatatype.SampleExamQuestions;

public class PrimTest {
    public static void main(String[] args) { // line 2
        int num1 = 12; // line 3
        float num2 = 17.8f; // line 4
        boolean eJavaResult = true; // line 5
        boolean returnVal = num1 >= 12 && num2 < 4.567 // line 6
                || eJavaResult == true;
        System.out.println(returnVal); // line 7
    }
}


//Code prints true
//c Code will print true if code on line 6 is modified to the following:
//boolean returnVal = (num1 >= 12 && num2 < 4.567) || eJavaResult == true;

//Explanation: Option (a) is incorrect because the code prints true.
// Option (d) is incorrect because the code prints false.
// The code in option (c) uses parentheses to indicate which expression should evaluate prior to the rest. Here are the steps of execution:
//boolean returnVal = (num1 >= 12 && num2 < 4.567) || eJavaResult == true;
//returnVal = false || eJavaResult == true;
//returnVal = true;
//The original code in the question doesn’t use parentheses to group the expressions.
//In this case, because the operator && has a higher operator precedence than ||, the
//expression 'num1 >= 12 && num2 < 4.567' will be the first expression to execute. Here
//are the steps of execution:
//boolean returnVal = num1 >= 12 && num2 < 4.567 || eJavaResult == true;
//returnVal = false |