//What is true about the following lines of code?
package Javadatatype.SampleExamQuestions;

public class TrueAbout {
    public static void main(String[] args) {
        boolean b = false;
        int i = 90;
        System.out.println(i >= b);
    }
}


//Compilation error
//Explanation: The code will fail to compile; hence, it can’t execute. You can’t compare
//incomparable types, such as a boolean value with a number