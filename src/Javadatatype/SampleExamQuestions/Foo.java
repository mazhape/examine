//What is the output of the following code?
package Javadatatype.SampleExamQuestions;

public class Foo {
    public static void main(String[] args) {
        int a = 10;
        long b = 20;
        short c = 30;
        System.out.println(++a + b++ * c);
    }
}

//611

//Explanation: The prefix increment operator (++) used with the variable a will increment its value before it’s used in the expression ++a + b++ * c. The postfix increment
//operator (++) used with the variable b will increment its value after its initial value is
//used in the expression ++a + b++ * c.
// Therefore, the expression ++a + b++ * c evaluates with the following values:
//11 + 20 * 30
//
//Let's break this down into parts:
//
//++a (Pre-increment of a)
//The ++a operation increments the value of a before it's used in the expression.
//
//Initially, a = 10, so ++a will increment a to 11 and return 11.
//
//b++ (Post-increment of b)
//The b++ operation returns the value of b first and then increments b.
//
//Initially, b = 20, so b++ will return 20 first and then increment b to 21.
//
//b++ * c
//Now, we calculate the multiplication part: b++ * c.
//
//Using the value of b before it was incremented, b = 20 and c = 30.
//
//So, b++ * c = 20 * 30 = 600.
//
//The Final Expression
//Now, substitute these values into the full expression:
//
//++a + b++ * c becomes 11 + 600.
//
//The result is 611.